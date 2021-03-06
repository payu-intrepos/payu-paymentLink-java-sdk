/*
 * Hub Token
 * Generate Token
 *
 * The version of the OpenAPI document: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ClientTokenDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenApi {
    private ApiClient localVarApiClient;

    public TokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getToken
     * @param mid merchant identifier (required)
     * @param clientTokenDTO  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Token Generated successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokenCall(String mid, ClientTokenDTO clientTokenDTO, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = clientTokenDTO;

        // create path and map variables
        String localVarPath = "/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (mid != null) {
            localVarHeaderParams.put("mid", localVarApiClient.parameterToString(mid));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTokenValidateBeforeCall(String mid, ClientTokenDTO clientTokenDTO, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new ApiException("Missing the required parameter 'mid' when calling getToken(Async)");
        }
        
        // verify the required parameter 'clientTokenDTO' is set
        if (clientTokenDTO == null) {
            throw new ApiException("Missing the required parameter 'clientTokenDTO' when calling getToken(Async)");
        }
        

        okhttp3.Call localVarCall = getTokenCall(mid, clientTokenDTO, _callback);
        return localVarCall;

    }

    /**
     * get Token
     * Get token
     * @param mid merchant identifier (required)
     * @param clientTokenDTO  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Token Generated successfully </td><td>  -  </td></tr>
     </table>
     */
    public String getToken(String mid, ClientTokenDTO clientTokenDTO) throws ApiException {
        ApiResponse<String> localVarResp = getTokenWithHttpInfo(mid, clientTokenDTO);
        return localVarResp.getData();
    }

    /**
     * get Token
     * Get token
     * @param mid merchant identifier (required)
     * @param clientTokenDTO  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Token Generated successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getTokenWithHttpInfo(String mid, ClientTokenDTO clientTokenDTO) throws ApiException {
        okhttp3.Call localVarCall = getTokenValidateBeforeCall(mid, clientTokenDTO, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * get Token (asynchronously)
     * Get token
     * @param mid merchant identifier (required)
     * @param clientTokenDTO  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Token Generated successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokenAsync(String mid, ClientTokenDTO clientTokenDTO, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTokenValidateBeforeCall(mid, clientTokenDTO, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
