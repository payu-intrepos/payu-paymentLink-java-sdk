# PaymentLinkApi

All URIs are relative to *http://localhost:8087*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeStatusOrExpiry**](PaymentLinkApi.md#changeStatusOrExpiry) | **PUT** /payment-links/{id} | change status and expiry for paymentLink 
[**createPaymentLink**](PaymentLinkApi.md#createPaymentLink) | **POST** /payment-links | Create PaymentLinks
[**getAllPaymentLink**](PaymentLinkApi.md#getAllPaymentLink) | **GET** /payment-links | Get all PaymentLinks
[**getMerchantCustomAttributes**](PaymentLinkApi.md#getMerchantCustomAttributes) | **GET** /payment-links/default-merchant-attributes | Get Custom Attributes
[**getPaymentLinkTransactions**](PaymentLinkApi.md#getPaymentLinkTransactions) | **GET** /payment-links/{id}/txns | Get Transaction details
[**getSinglePaymentLink**](PaymentLinkApi.md#getSinglePaymentLink) | **GET** /payment-links/{id} | Get Single PaymentLink
[**sendPaymentLink**](PaymentLinkApi.md#sendPaymentLink) | **POST** /payment-links/{id}/share | send PaymentLink
[**summary**](PaymentLinkApi.md#summary) | **GET** /payment-links/summary | Details of paymentlinks


<a name="changeStatusOrExpiry"></a>
# **changeStatusOrExpiry**
> ResultDTO changeStatusOrExpiry(id, mid, statusOrExpiryDTO)

change status and expiry for paymentLink 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String id = "id_example"; // String | 
    String mid = "mid_example"; // String | merchant identifier
    StatusOrExpiryDTO statusOrExpiryDTO = new StatusOrExpiryDTO(); // StatusOrExpiryDTO | 
    try {
      ResultDTO result = apiInstance.changeStatusOrExpiry(id, mid, statusOrExpiryDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#changeStatusOrExpiry");
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
 **id** | **String**|  |
 **mid** | **String**| merchant identifier |
 **statusOrExpiryDTO** | [**StatusOrExpiryDTO**](StatusOrExpiryDTO.md)|  |

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | something went wrong |  -  |
**200** | Changed successfully |  -  |

<a name="createPaymentLink"></a>
# **createPaymentLink**
> ResultDTO createPaymentLink(mid, paymentLinkRequestDTO)

Create PaymentLinks

create single payment link

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String mid = "mid_example"; // String | merchant identifier
    PaymentLinkRequestDTO paymentLinkRequestDTO = new PaymentLinkRequestDTO(); // PaymentLinkRequestDTO | 
    try {
      ResultDTO result = apiInstance.createPaymentLink(mid, paymentLinkRequestDTO);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#createPaymentLink");
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
 **paymentLinkRequestDTO** | [**PaymentLinkRequestDTO**](PaymentLinkRequestDTO.md)|  |

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Link Created successfully |  -  |

<a name="getAllPaymentLink"></a>
# **getAllPaymentLink**
> ResultDTO getAllPaymentLink(dateFrom, dateTo, mid, pageOffset, pageSize, orderBy, order, searchText, status)

Get all PaymentLinks

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String dateFrom = "dateFrom_example"; // String | 
    String dateTo = "dateTo_example"; // String | 
    String mid = "mid_example"; // String | merchant identifier
    Integer pageOffset = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String orderBy = "addedOn"; // String | 
    String order = "asc"; // String | 
    String searchText = "searchText_example"; // String | 
    List<String> status = Arrays.asList(); // List<String> | 
    try {
      ResultDTO result = apiInstance.getAllPaymentLink(dateFrom, dateTo, mid, pageOffset, pageSize, orderBy, order, searchText, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#getAllPaymentLink");
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
 **dateFrom** | **String**|  |
 **dateTo** | **String**|  |
 **mid** | **String**| merchant identifier |
 **pageOffset** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 20]
 **orderBy** | **String**|  | [optional] [default to addedOn]
 **order** | **String**|  | [optional] [default to asc]
 **searchText** | **String**|  | [optional]
 **status** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Something went wrong |  -  |
**200** | Details fetched successfully |  -  |

<a name="getMerchantCustomAttributes"></a>
# **getMerchantCustomAttributes**
> ResultDTO getMerchantCustomAttributes(mid)

Get Custom Attributes

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String mid = "mid_example"; // String | merchant identifier
    try {
      ResultDTO result = apiInstance.getMerchantCustomAttributes(mid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#getMerchantCustomAttributes");
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

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Details fetched successfully |  -  |

<a name="getPaymentLinkTransactions"></a>
# **getPaymentLinkTransactions**
> ResultDTO getPaymentLinkTransactions(dateFrom, dateTo, id, mid, pageOffset, pageSize, orderBy, order, searchText, searchTerm, status)

Get Transaction details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String dateFrom = "dateFrom_example"; // String | 
    String dateTo = "dateTo_example"; // String | 
    String id = "id_example"; // String | 
    String mid = "mid_example"; // String | merchant identifier
    Integer pageOffset = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String orderBy = "addedOn"; // String | 
    String order = "asc"; // String | 
    String searchText = "searchText_example"; // String | 
    String searchTerm = "searchTerm_example"; // String | 
    List<String> status = Arrays.asList(); // List<String> | 
    try {
      ResultDTO result = apiInstance.getPaymentLinkTransactions(dateFrom, dateTo, id, mid, pageOffset, pageSize, orderBy, order, searchText, searchTerm, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#getPaymentLinkTransactions");
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
 **dateFrom** | **String**|  |
 **dateTo** | **String**|  |
 **id** | **String**|  |
 **mid** | **String**| merchant identifier |
 **pageOffset** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 20]
 **orderBy** | **String**|  | [optional] [default to addedOn]
 **order** | **String**|  | [optional] [default to asc]
 **searchText** | **String**|  | [optional]
 **searchTerm** | **String**|  | [optional]
 **status** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Bad Request |  -  |
**200** | Details fetched successfully |  -  |

<a name="getSinglePaymentLink"></a>
# **getSinglePaymentLink**
> ResultDTO getSinglePaymentLink(id, mid)

Get Single PaymentLink

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String id = "id_example"; // String | 
    String mid = "mid_example"; // String | merchant identifier
    try {
      ResultDTO result = apiInstance.getSinglePaymentLink(id, mid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#getSinglePaymentLink");
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
 **id** | **String**|  |
 **mid** | **String**| merchant identifier |

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Something went wrong |  -  |
**200** | Details fetched successfully |  -  |

<a name="sendPaymentLink"></a>
# **sendPaymentLink**
> ResultDTO sendPaymentLink(channelList, id, mid)

send PaymentLink

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    List<String> channelList = Arrays.asList(); // List<String> | 
    String id = "id_example"; // String | 
    String mid = "mid_example"; // String | merchant identifier
    try {
      ResultDTO result = apiInstance.sendPaymentLink(channelList, id, mid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#sendPaymentLink");
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
 **channelList** | [**List&lt;String&gt;**](String.md)|  |
 **id** | **String**|  |
 **mid** | **String**| merchant identifier |

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | something went wrong |  -  |
**200** | PaymentLink Sent successfully |  -  |

<a name="summary"></a>
# **summary**
> ResultDTO summary(mid)

Details of paymentlinks

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8087");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PaymentLinkApi apiInstance = new PaymentLinkApi(defaultClient);
    String mid = "mid_example"; // String | merchant identifier
    try {
      ResultDTO result = apiInstance.summary(mid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinkApi#summary");
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

### Return type

[**ResultDTO**](ResultDTO.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Something went wrong |  -  |
**200** | summary fetched successfully |  -  |

