package androidx.lifecycle;

import androidx.arch.core.util.Function;

/* loaded from: classes.dex */
public class Transformations {
    private Transformations() {
    }

    public static <X, Y> LiveData<Y> map(LiveData<X> source, final Function<X, Y> mapFunction) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source, new Observer<X>() { // from class: androidx.lifecycle.Transformations.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x2) {
                MediatorLiveData.this.setValue(mapFunction.apply(x2));
            }
        });
        return mediatorLiveData;
    }

    public static <X, Y> LiveData<Y> switchMap(LiveData<X> source, final Function<X, LiveData<Y>> switchMapFunction) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source, new Observer<X>() { // from class: androidx.lifecycle.Transformations.2
            LiveData<Y> mSource;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X x2) {
                LiveData<Y> liveData = (LiveData) Function.this.apply(x2);
                Object obj = this.mSource;
                if (obj == liveData) {
                    return;
                }
                if (obj != null) {
                    mediatorLiveData.removeSource(obj);
                }
                this.mSource = liveData;
                if (liveData != 0) {
                    mediatorLiveData.addSource(liveData, new Observer<Y>() { // from class: androidx.lifecycle.Transformations.2.1
                        @Override // androidx.lifecycle.Observer
                        public void onChanged(Y y2) {
                            mediatorLiveData.setValue(y2);
                        }
                    });
                }
            }
        });
        return mediatorLiveData;
    }

    public static <X> LiveData<X> distinctUntilChanged(LiveData<X> source) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source, new Observer<X>() { // from class: androidx.lifecycle.Transformations.3
            boolean mFirstTime = true;

            @Override // androidx.lifecycle.Observer
            public void onChanged(X currentValue) {
                T value = MediatorLiveData.this.getValue();
                if (this.mFirstTime || ((value == 0 && currentValue != 0) || !(value == 0 || value.equals(currentValue)))) {
                    this.mFirstTime = false;
                    MediatorLiveData.this.setValue(currentValue);
                }
            }
        });
        return mediatorLiveData;
    }
}