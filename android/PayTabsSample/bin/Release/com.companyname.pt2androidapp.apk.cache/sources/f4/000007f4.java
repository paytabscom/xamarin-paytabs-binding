package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.KeyedFactory {
    private static final Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = {Application.class, SavedStateHandle.class};
    private static final Class<?>[] VIEWMODEL_SIGNATURE = {SavedStateHandle.class};
    private final Application mApplication;
    private final Bundle mDefaultArgs;
    private final ViewModelProvider.Factory mFactory;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner) {
        this(application, owner, null);
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner, Bundle defaultArgs) {
        ViewModelProvider.Factory newInstanceFactory;
        this.mSavedStateRegistry = owner.getSavedStateRegistry();
        this.mLifecycle = owner.getLifecycle();
        this.mDefaultArgs = defaultArgs;
        this.mApplication = application;
        if (application != null) {
            newInstanceFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
        } else {
            newInstanceFactory = ViewModelProvider.NewInstanceFactory.getInstance();
        }
        this.mFactory = newInstanceFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    public <T extends ViewModel> T create(String key, Class<T> modelClass) {
        Constructor findMatchingConstructor;
        T t2;
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        if (isAssignableFrom && this.mApplication != null) {
            findMatchingConstructor = findMatchingConstructor(modelClass, ANDROID_VIEWMODEL_SIGNATURE);
        } else {
            findMatchingConstructor = findMatchingConstructor(modelClass, VIEWMODEL_SIGNATURE);
        }
        if (findMatchingConstructor == null) {
            return (T) this.mFactory.create(modelClass);
        }
        SavedStateHandleController create = SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, key, this.mDefaultArgs);
        if (isAssignableFrom) {
            try {
                Application application = this.mApplication;
                if (application != null) {
                    t2 = (T) findMatchingConstructor.newInstance(application, create.getHandle());
                    t2.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
                    return t2;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + modelClass, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + modelClass, e4.getCause());
            }
        }
        t2 = (T) findMatchingConstructor.newInstance(create.getHandle());
        t2.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", create);
        return t2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) create(canonicalName, modelClass);
    }

    private static <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, Class<?>[] signature) {
        for (Constructor<?> constructor : modelClass.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(signature, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    void onRequery(ViewModel viewModel) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }
}