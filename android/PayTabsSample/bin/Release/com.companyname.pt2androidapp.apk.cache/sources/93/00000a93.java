package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AesGcmKeyManager;
import com.google.crypto.tink.daead.AesSivKeyManager;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final DeterministicAead mKeyDeterministicAead;
    final List<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new ArrayList();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final Aead mValueAead;

    EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = aead;
        this.mKeyDeterministicAead = deterministicAead;
    }

    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        DeterministicAeadConfig.register();
        AeadConfig.register();
        AndroidKeysetManager.Builder withSharedPref = new AndroidKeysetManager.Builder().withKeyTemplate(prefKeyEncryptionScheme.getKeyTemplate()).withSharedPref(context, KEY_KEYSET_ALIAS, str);
        KeysetHandle keysetHandle = withSharedPref.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        AndroidKeysetManager.Builder withSharedPref2 = new AndroidKeysetManager.Builder().withKeyTemplate(prefValueEncryptionScheme.getKeyTemplate()).withSharedPref(context, VALUE_KEYSET_ALIAS, str);
        KeysetHandle keysetHandle2 = withSharedPref2.withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        DeterministicAead deterministicAead = (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class);
        return new EncryptedSharedPreferences(str, str2, context.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), deterministicAead);
    }

    /* loaded from: classes.dex */
    public enum PrefKeyEncryptionScheme {
        AES256_SIV(AesSivKeyManager.aes256SivTemplate());
        
        private final KeyTemplate mDeterministicAeadKeyTemplate;

        PrefKeyEncryptionScheme(KeyTemplate keyTemplate) {
            this.mDeterministicAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    /* loaded from: classes.dex */
    public enum PrefValueEncryptionScheme {
        AES256_GCM(AesGcmKeyManager.aes256GcmTemplate());
        
        private final KeyTemplate mAeadKeyTemplate;

        PrefValueEncryptionScheme(KeyTemplate keyTemplate) {
            this.mAeadKeyTemplate = keyTemplate;
        }

        KeyTemplate getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    /* loaded from: classes.dex */
    private static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new ArraySet<>();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.getId());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.getId());
            allocate.putInt(i2);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.getId());
            allocate.putLong(j2);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.getId());
            allocate.putFloat(f2);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z2) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.getId());
            allocate.put(z2 ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> encryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
            }
        }

        private void notifyListeners() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.mEncryptedSharedPreferences.mListeners) {
                for (String str : this.mKeysChanged) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, str);
                }
            }
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String decryptKey = decryptKey(entry.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof String)) ? str2 : (String) decryptedObject;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> arraySet;
        Object decryptedObject = getDecryptedObject(str);
        if (decryptedObject instanceof Set) {
            arraySet = (Set) decryptedObject;
        } else {
            arraySet = new ArraySet<>();
        }
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Integer)) ? i2 : ((Integer) decryptedObject).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Long)) ? j2 : ((Long) decryptedObject).longValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Float)) ? f2 : ((Float) decryptedObject).floatValue();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z2) {
        Object decryptedObject = getDecryptedObject(str);
        return (decryptedObject == null || !(decryptedObject instanceof Boolean)) ? z2 : ((Boolean) decryptedObject).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        EncryptedType(int i2) {
            this.mId = i2;
        }

        public int getId() {
            return this.mId;
        }

        public static EncryptedType fromId(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }
    }

    private Object getDecryptedObject(String str) {
        if (isReservedKey(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            String encryptKey = encryptKey(str);
            String string = this.mSharedPreferences.getString(encryptKey, null);
            if (string != null) {
                ByteBuffer wrap = ByteBuffer.wrap(this.mValueAead.decrypt(Base64.decode(string, 0), encryptKey.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (AnonymousClass1.$SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.fromId(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i2 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i2);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals(NULL_VALUE)) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        return Boolean.valueOf(wrap.get() != 0);
                    case 6:
                        ArraySet arraySet = new ArraySet();
                        while (wrap.hasRemaining()) {
                            int i3 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i3);
                            wrap.position(wrap.position() + i3);
                            arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (arraySet.size() == 1 && NULL_VALUE.equals(arraySet.valueAt(0))) {
                            return null;
                        }
                        return arraySet;
                    default:
                        return null;
                }
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.EncryptedSharedPreferences$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$security$crypto$EncryptedSharedPreferences$EncryptedType[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            return Base64.encode(this.mKeyDeterministicAead.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.decryptDeterministically(Base64.decode(str, 0), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
        }
    }

    boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String encryptKey = encryptKey(str);
        return new Pair<>(encryptKey, Base64.encode(this.mValueAead.encrypt(bArr, encryptKey.getBytes(StandardCharsets.UTF_8))));
    }
}