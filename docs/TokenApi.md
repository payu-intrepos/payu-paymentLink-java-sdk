# TokenApi

All URIs are relative to *http://localhost:8087*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](TokenApi.md#getToken) | **POST** /token | get Token


<a name="getToken"></a>
# **getToken**
> String getToken(mid, clientTokenDTO)

get Token

Get token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    TokenApi apiInstance = new TokenApi(defaultClient);
    String mid = "mid_example"; // String | merchant identifier
    ClientTokenDTO clientTokenDTO = new ClientTokenDTO(); // ClientTokenDTO | 
    try {
      String result = apiInstance.getToken(mid, clientTokenDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#getToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mid** | **String**| merchant identifier |
 **clientTokenDTO** | [**ClientTokenDTO**](ClientTokenDTO.md)|  |

### Return type

**String**

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Token Generated successfully |  -  |

