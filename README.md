# Payment Link SDK for Java

The Payment Link SDK for Java enables you to easily work with Payment Link API of PayU by easily integrating this SDK within your base system.
With our SDK, you do not need to worry about low level details for doing API integration and with few lines of code and a method calling, it can be done within few minutes.

## Features Supported
Following features are supported in the Payment link Java SDK:
 - Create Payment Link
 - Get Details of all Payment Links
 - Get Details of Specific Payment Link
 - Get Summary of all Payment Links Created by a Particular Merchant
 - Share Payment Link with end Customer via email or sms
 - Get list of all Transactions done against a particular Payment Link
 - Change Status or Expiry of a Payment Link

To get started with Payment Link, visit our [Developer Guide](https://devguide.payu.in/payment-links/payu-payment-links-api-integration)

# Table of Contents
 1. [Requirements](#requirements)
 2. [Getting Started](#getting-started)
 3. [Installation](#installation)
 4. [Documentation for API Endpoints](#documentation-for-api-endpoints)
 5. [Documentation for Models](#documentation-for-models)
 6. [Documentation for Authorization](#documentation-for-authorization)
 7. [Recommendation](#recommendation)



## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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
## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.0.0.jar`
* `target/lib/*.jar`

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8087*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentLinkApi* | [**changeStatusOrExpiry**](docs/PaymentLinkApi.md#changeStatusOrExpiry) | **PUT** /payment-links/{id} | change status and expiry for paymentLink 
*PaymentLinkApi* | [**createPaymentLink**](docs/PaymentLinkApi.md#createPaymentLink) | **POST** /payment-links | Create PaymentLinks
*PaymentLinkApi* | [**getAllPaymentLink**](docs/PaymentLinkApi.md#getAllPaymentLink) | **GET** /payment-links | Get all PaymentLinks
*PaymentLinkApi* | [**getMerchantCustomAttributes**](docs/PaymentLinkApi.md#getMerchantCustomAttributes) | **GET** /payment-links/default-merchant-attributes | Get Custom Attributes
*PaymentLinkApi* | [**getPaymentLinkTransactions**](docs/PaymentLinkApi.md#getPaymentLinkTransactions) | **GET** /payment-links/{id}/txns | Get Transaction details
*PaymentLinkApi* | [**getSinglePaymentLink**](docs/PaymentLinkApi.md#getSinglePaymentLink) | **GET** /payment-links/{id} | Get Single PaymentLink
*PaymentLinkApi* | [**sendPaymentLink**](docs/PaymentLinkApi.md#sendPaymentLink) | **POST** /payment-links/{id}/share | send PaymentLink
*PaymentLinkApi* | [**summary**](docs/PaymentLinkApi.md#summary) | **GET** /payment-links/summary | Details of paymentlinks
*TokenApi* | [**getToken**](docs/TokenApi.md#getToken) | **POST** /token | get Token


## Documentation for Models

 - [AddressDTO](docs/AddressDTO.md)
 - [ClientTokenDTO](docs/ClientTokenDTO.md)
 - [CustomAttributeDTO](docs/CustomAttributeDTO.md)
 - [CustomerDTO](docs/CustomerDTO.md)
 - [PaymentLinkRequestDTO](docs/PaymentLinkRequestDTO.md)
 - [ReminderDTO](docs/ReminderDTO.md)
 - [ResultDTO](docs/ResultDTO.md)
 - [StaticFieldDTO](docs/StaticFieldDTO.md)
 - [StatusOrExpiryDTO](docs/StatusOrExpiryDTO.md)
 - [UdfDTO](docs/UdfDTO.md)


## Documentation for Authorization

### OAuth2

- **Type**: OAuth
- **Flow**: application
- **Scopes**: 
  - read_payment_links: Grants read access
  - create_payment_links: Grants write access
  - update_payment_links: Grants update access


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
