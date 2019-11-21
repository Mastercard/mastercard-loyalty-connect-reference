/*
 * Mastercard Loyalty Connect Service
 * Rest Service for linking payment cards with loyalty programme
 *
 * OpenAPI spec version: 1.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_connect_client.api;

import com.mastercard.developer.loyalty_connect_client.ApiCallback;
import com.mastercard.developer.loyalty_connect_client.ApiClient;
import com.mastercard.developer.loyalty_connect_client.ApiException;
import com.mastercard.developer.loyalty_connect_client.ApiResponse;
import com.mastercard.developer.loyalty_connect_client.Configuration;
import com.mastercard.developer.loyalty_connect_client.Pair;
import com.mastercard.developer.loyalty_connect_client.ProgressRequestBody;
import com.mastercard.developer.loyalty_connect_client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mastercard.developer.loyalty_connect_client.model.Error;
import com.mastercard.developer.loyalty_connect_client.model.Transaction;
import com.mastercard.developer.loyalty_connect_client.model.TransactionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getLoyaltyId
     * @param transaction The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLoyaltyIdCall(Transaction transaction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transaction;

        // create path and map variables
        String localVarPath = "/loyalty-ids/searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLoyaltyIdValidateBeforeCall(Transaction transaction, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'transaction' is set
        if (transaction == null) {
            throw new ApiException("Missing the required parameter 'transaction' when calling getLoyaltyId(Async)");
        }
        

        com.squareup.okhttp.Call call = getLoyaltyIdCall(transaction, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get loyalty id
     * Returns the Loyalty ID connected with a payment card for a specific Merchant. This API is called when a Member transacts using a payment card connected in MLC at a participating Merchant store.
     * @param transaction The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID (required)
     * @return TransactionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionResponse getLoyaltyId(Transaction transaction) throws ApiException {
        ApiResponse<TransactionResponse> resp = getLoyaltyIdWithHttpInfo(transaction);
        return resp.getData();
    }

    /**
     * Get loyalty id
     * Returns the Loyalty ID connected with a payment card for a specific Merchant. This API is called when a Member transacts using a payment card connected in MLC at a participating Merchant store.
     * @param transaction The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID (required)
     * @return ApiResponse&lt;TransactionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionResponse> getLoyaltyIdWithHttpInfo(Transaction transaction) throws ApiException {
        com.squareup.okhttp.Call call = getLoyaltyIdValidateBeforeCall(transaction, null, null);
        Type localVarReturnType = new TypeToken<TransactionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get loyalty id (asynchronously)
     * Returns the Loyalty ID connected with a payment card for a specific Merchant. This API is called when a Member transacts using a payment card connected in MLC at a participating Merchant store.
     * @param transaction The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLoyaltyIdAsync(Transaction transaction, final ApiCallback<TransactionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLoyaltyIdValidateBeforeCall(transaction, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
