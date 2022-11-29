package b0;

import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a<T> extends MutableLiveData<T> {

    /* renamed from: a */
    private final AtomicBoolean f19a = new AtomicBoolean(false);

    public /* synthetic */ void a(Observer observer, Object obj) {
        if (this.f19a.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
    }

    public static /* synthetic */ void lambda$l93ZZTITFWwzAzAnu4vL1dwZIXM(a aVar, Observer observer, Object obj) {
        aVar.a(observer, obj);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        if (hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner, new Observer() { // from class: b0.-$$Lambda$a$l93ZZTITFWwzAzAnu4vL1dwZIXM
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                a.lambda$l93ZZTITFWwzAzAnu4vL1dwZIXM(a.this, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t2) {
        this.f19a.set(true);
        super.setValue(t2);
    }
}