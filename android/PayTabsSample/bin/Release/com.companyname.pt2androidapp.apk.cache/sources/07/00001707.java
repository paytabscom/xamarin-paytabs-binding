package mono.com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk;

import android.graphics.Bitmap;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionResult;
import com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes.dex */
public class RecognitionStatusListenerImplementor implements IGCUserPeer, RecognitionStatusListener {
    public static final String __md_methods = "n_onCardImageReceived:(Landroid/graphics/Bitmap;)V:GetOnCardImageReceived_Landroid_graphics_Bitmap_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib\nn_onRecognitionComplete:(Lcom/paytabs/paytabscardrecognizer/cards/pay/paycardsrecognizer/sdk/ndk/RecognitionResult;)V:GetOnRecognitionComplete_Lcom_paytabs_paytabscardrecognizer_cards_pay_paycardsrecognizer_sdk_ndk_RecognitionResult_Handler:Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerInvoker, CardScanBindingLib\n";
    private ArrayList refList;

    private native void n_onCardImageReceived(Bitmap bitmap);

    private native void n_onRecognitionComplete(RecognitionResult recognitionResult);

    static {
        Runtime.register("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerImplementor, CardScanBindingLib", RecognitionStatusListenerImplementor.class, __md_methods);
    }

    public RecognitionStatusListenerImplementor() {
        if (getClass() == RecognitionStatusListenerImplementor.class) {
            TypeManager.Activate("Com.Paytabs.Paytabscardrecognizer.Cards.Pay.Paycardsrecognizer.Sdk.Ndk.IRecognitionStatusListenerImplementor, CardScanBindingLib", "", this, new Object[0]);
        }
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener
    public void onCardImageReceived(Bitmap bitmap) {
        n_onCardImageReceived(bitmap);
    }

    @Override // com.paytabs.paytabscardrecognizer.cards.pay.paycardsrecognizer.sdk.ndk.RecognitionStatusListener
    public void onRecognitionComplete(RecognitionResult recognitionResult) {
        n_onRecognitionComplete(recognitionResult);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}