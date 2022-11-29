package com.payment.paymentsdk.sharedclasses.remote;

import com.payment.paymentsdk.sharedclasses.model.response.TransactionResponseBody;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/payment/paymentsdk/sharedclasses/remote/TransactionWebService;", "", "doTransaction", "Lcom/payment/paymentsdk/sharedclasses/model/response/TransactionResponseBody;", "requestBody", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryTransaction", "paymentsdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransactionWebService {
    @Headers({"Content-Type:application/octet-stream"})
    @POST("payment/request")
    Object doTransaction(@Body RequestBody requestBody, Continuation<? super TransactionResponseBody> continuation);

    @Headers({"Content-Type:application/octet-stream"})
    @POST("payment/query")
    Object queryTransaction(@Body RequestBody requestBody, Continuation<? super TransactionResponseBody> continuation);
}