package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

/* loaded from: classes.dex */
interface StableIdStorage {

    /* loaded from: classes.dex */
    public interface StableIdLookup {
        long localToGlobal(long j2);
    }

    StableIdLookup createStableIdLookup();

    /* loaded from: classes.dex */
    public static class NoStableIdStorage implements StableIdStorage {
        private final StableIdLookup mNoIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j2) {
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return this.mNoIdLookup;
        }
    }

    /* loaded from: classes.dex */
    public static class SharedPoolStableIdStorage implements StableIdStorage {
        private final StableIdLookup mSameIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j2) {
                return j2;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return this.mSameIdLookup;
        }
    }

    /* loaded from: classes.dex */
    public static class IsolatedStableIdStorage implements StableIdStorage {
        long mNextStableId = 0;

        long obtainId() {
            long j2 = this.mNextStableId;
            this.mNextStableId = 1 + j2;
            return j2;
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            return new WrapperStableIdLookup();
        }

        /* loaded from: classes.dex */
        class WrapperStableIdLookup implements StableIdLookup {
            private final LongSparseArray<Long> mLocalToGlobalLookup = new LongSparseArray<>();

            WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j2) {
                Long l2 = this.mLocalToGlobalLookup.get(j2);
                if (l2 == null) {
                    l2 = Long.valueOf(IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.put(j2, l2);
                }
                return l2.longValue();
            }
        }
    }
}