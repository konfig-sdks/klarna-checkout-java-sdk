# OrderApi

All URIs are relative to *https://api.klarna.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abortOrder**](OrderApi.md#abortOrder) | **POST** /checkout/v3/orders/{order_id}/abort | Abort an order |
| [**createNewOrder**](OrderApi.md#createNewOrder) | **POST** /checkout/v3/orders | Create an order |
| [**getOrderDetails**](OrderApi.md#getOrderDetails) | **GET** /checkout/v3/orders/{order_id} | Get order details |
| [**updateOrder**](OrderApi.md#updateOrder) | **POST** /checkout/v3/orders/{order_id} | Update an order |


<a name="abortOrder"></a>
# **abortOrder**
> Order abortOrder(orderId).execute();

Abort an order

Mark an order as aborted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaCheckout client = new KlarnaCheckout(configuration);
    String orderId = "orderId_example";
    try {
      Order result = client
              .order
              .abortOrder(orderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getOrderId());
      System.out.println(result.getName());
      System.out.println(result.getPurchaseCountry());
      System.out.println(result.getPurchaseCurrency());
      System.out.println(result.getLocale());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getOrderAmount());
      System.out.println(result.getOrderTaxAmount());
      System.out.println(result.getOrderLines());
      System.out.println(result.getCustomer());
      System.out.println(result.getMerchantUrls());
      System.out.println(result.getHtmlSnippet());
      System.out.println(result.getMerchantReference1());
      System.out.println(result.getMerchantReference2());
      System.out.println(result.getStartedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getLastModifiedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getAttachment());
      System.out.println(result.getExternalPaymentMethods());
      System.out.println(result.getExternalCheckouts());
      System.out.println(result.getShippingCountries());
      System.out.println(result.getShippingOptions());
      System.out.println(result.getMerchantData());
      System.out.println(result.getGui());
      System.out.println(result.getMerchantRequested());
      System.out.println(result.getSelectedShippingOption());
      System.out.println(result.getRecurring());
      System.out.println(result.getRecurringToken());
      System.out.println(result.getRecurringDescription());
      System.out.println(result.getBillingCountries());
      System.out.println(result.getDiscountLines());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#abortOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .abortOrder(orderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#abortOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **403** | You tried to modify a read only resource. |  -  |
| **404** | We did not find any order with given ID. You need to create a new order. |  -  |

<a name="createNewOrder"></a>
# **createNewOrder**
> Order createNewOrder().klarnaPartner(klarnaPartner).order(order).execute();

Create an order

To create a new order simply provide a JSON object with the applicable properties.&lt;br&gt;The location of the newly created checkout order can be found in the location header of the response.&lt;br&gt;Please note: This is the url that should be used for future interactions (read and update) with the order, i.e. do not construct the order url based on the order id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaCheckout client = new KlarnaCheckout(configuration);
    String purchaseCountry = "purchaseCountry_example"; // The purchase country of the merchant's store. The format to be used is ISO 3166 alpha-2. Eg: GB, SE, DE, US, etc.   Note: purchase country and currency need to match the defined merchant configuration. For global configuration read this https://docs.klarna.com/klarna-checkout/popular-use-cases/selling-to-multiple-countries/
    String purchaseCurrency = "purchaseCurrency_example"; // The purchase currency of the merchant's store. The format to be used is ISO 4217. Eg: USD, EUR, SEK, GBP, etc.  Note: purchase country and currency need to match the defined merchant configuration. For global configuration read this https://docs.klarna.com/klarna-checkout/popular-use-cases/selling-to-multiple-countries/
    String locale = "locale_example"; // Used to define the language and region of the customer. RFC 1766 customer's locale.
    Long orderAmount = 56L; // Total amount of the order including tax and any available discounts. The value should be in non-negative minor units.  Example: 25 Euros should be 2500.
    Long orderTaxAmount = 56L; // Total tax amount of the order. The value should be in non-negative minor units.  Example: 25 Euros should be 2500.
    List<OrderLine> orderLines = Arrays.asList(); // An array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
    List<String> tags = Arrays.asList(); // Extra information added to the order.  Example: [\\\"dangerous_goods\\\", \\\"bulky\\\"]
    String orderId = "orderId_example"; // Unique order ID that will be used for the entire lifecycle of the order. (max 255 characters)
    String name = "name_example"; // The merchant name (max 255 characters).
    String status = "status_example"; // The current status of the order. The status will be ‘incomplete’ until the customer has been successfully authorized.
    Address billingAddress = new Address();
    Address shippingAddress = new Address();
    Customer customer = new Customer();
    MerchantUrls merchantUrls = new MerchantUrls();
    String htmlSnippet = "htmlSnippet_example"; // The HTML snippet that is used to render the checkout in an iframe.
    String merchantReference1 = "merchantReference1_example"; // Used for storing merchant's internal order number or other reference. If set, will be shown on the confirmation page as \\\"order number\\\" . The value is also available in the settlement files. (max 255 characters). Example: \\\"45aa52f387871e3a210645d4\\\"
    String merchantReference2 = "merchantReference2_example"; // Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters). Example: \\\"45aa52f387871e3a210645d4\\\"
    OffsetDateTime startedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order has been created. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    OffsetDateTime completedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order has been completed. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    OffsetDateTime lastModifiedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order was last modified. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    Options options = new Options();
    Attachment attachment = new Attachment();
    List<PaymentProvider> externalPaymentMethods = Arrays.asList(); // List of external payment methods that will be displayed as part of payment methods in the checkout.
    List<PaymentProvider> externalCheckouts = Arrays.asList(); // List of external checkouts that will be displayed as part of payment methods in the checkout. The image_url is required, and the image size has to be 276x48px
    List<String> shippingCountries = Arrays.asList(); // List of allowed shipping countries for this order in ISO-3166 alpha-2 format.  If specified, the customer will be able to change the shipping country in the checkout and you will be notified through ‘address_update’ callback or the ‘shipping_address_change’ javascript event.   If not specified then the default value will be the purchase country.  Example: look at billing_countries example.
    List<ShippingOption> shippingOptions = Arrays.asList(); // A list of shipping options available for this order.
    String merchantData = "merchantData_example"; // Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters).
    Gui gui = new Gui();
    MerchantRequested merchantRequested = new MerchantRequested();
    ShippingOption selectedShippingOption = new ShippingOption();
    Boolean recurring = true; // Indicates whether this purchase will create a token that can be used by the merchant to create recurring purchases. This must be enabled for the merchant to use. Default: false  Depending on specified country, recurring could be used for the following payment methods: Pay Later, Direct Debit, Card.
    String recurringToken = "recurringToken_example"; // Token to be used when creating recurring orders.
    String recurringDescription = "recurringDescription_example"; // Description to be added to the recurring order.
    List<String> billingCountries = Arrays.asList(); // List of allowed billing countries for this order. If specified, the customer will be able to change the billing country in the checkout and you will be notified through ‘country_change’ callback or the ‘billing_address_change’ javascript event. If not specified but shipping_countries is specified, will use same values as shipping_countries. If not specified and shipping_countries is not specified, then the default value will be the purchase country.  Example: [\\\"AD\\\", \\\"AE\\\", \\\"AG\\\", \\\"AI\\\", \\\"AL\\\", \\\"AM\\\", \\\"AQ\\\", \\\"AR\\\", \\\"AS\\\", \\\"AT\\\", \\\"AU\\\", \\\"AW\\\", \\\"AX\\\", \\\"AZ\\\", \\\"BA\\\", \\\"BB\\\", \\\"BD\\\", \\\"BE\\\", \\\"BF\\\", \\\"BG\\\", \\\"BH\\\", \\\"BJ\\\", \\\"BL\\\", \\\"BM\\\", \\\"BN\\\", \\\"BO\\\", \\\"BQ\\\", \\\"BR\\\", \\\"BS\\\", \\\"BT\\\", \\\"BW\\\", \\\"BY\\\", \\\"BZ\\\", \\\"CA\\\", \\\"CF\\\", \\\"CH\\\", \\\"CI\\\", \\\"CK\\\", \\\"CL\\\", \\\"CM\\\", \\\"CN\\\", \\\"CO\\\", \\\"CR\\\", \\\"CU\\\", \\\"CV\\\", \\\"CW\\\", \\\"CX\\\", \\\"CY\\\", \\\"CZ\\\", \\\"DE\\\", \\\"DJ\\\", \\\"DK\\\", \\\"DM\\\", \\\"DO\\\", \\\"DZ\\\", \\\"EC\\\", \\\"EE\\\", \\\"EG\\\", \\\"ER\\\", \\\"ES\\\", \\\"ET\\\", \\\"FI\\\", \\\"FJ\\\", \\\"FK\\\", \\\"FM\\\", \\\"FO\\\", \\\"FR\\\", \\\"GA\\\", \\\"GB\\\", \\\"GD\\\", \\\"GE\\\", \\\"GF\\\", \\\"GG\\\", \\\"GH\\\", \\\"GI\\\", \\\"GL\\\", \\\"GM\\\", \\\"GN\\\", \\\"GP\\\", \\\"GR\\\", \\\"GS\\\", \\\"GT\\\", \\\"GU\\\", \\\"GY\\\", \\\"HK\\\", \\\"HN\\\", \\\"HR\\\", \\\"HU\\\", \\\"ID\\\", \\\"IE\\\", \\\"IL\\\", \\\"IM\\\", \\\"IN\\\", \\\"IS\\\", \\\"IT\\\", \\\"JE\\\", \\\"JM\\\", \\\"JO\\\", \\\"JP\\\", \\\"KE\\\", \\\"KG\\\", \\\"KI\\\", \\\"KM\\\", \\\"KN\\\", \\\"KR\\\", \\\"KW\\\", \\\"KY\\\", \\\"KZ\\\", \\\"LA\\\", \\\"LA\\\", \\\"LB\\\", \\\"LC\\\", \\\"LI\\\", \\\"LK\\\", \\\"LR\\\", \\\"LS\\\", \\\"LT\\\", \\\"LU\\\", \\\"LV\\\", \\\"MA\\\", \\\"MC\\\", \\\"MD\\\", \\\"ME\\\", \\\"MF\\\", \\\"MG\\\", \\\"MH\\\", \\\"MK\\\", \\\"MK\\\", \\\"ML\\\", \\\"MM\\\", \\\"MN\\\", \\\"MO\\\", \\\"MP\\\", \\\"MQ\\\", \\\"MR\\\", \\\"MT\\\", \\\"MU\\\", \\\"MV\\\", \\\"MW\\\", \\\"MX\\\", \\\"MY\\\", \\\"MZ\\\", \\\"NA\\\", \\\"NC\\\", \\\"NE\\\", \\\"NF\\\", \\\"NG\\\", \\\"NI\\\", \\\"NL\\\", \\\"NO\\\", \\\"NP\\\", \\\"NR\\\", \\\"NU\\\", \\\"NZ\\\", \\\"OM\\\", \\\"PA\\\", \\\"PE\\\", \\\"PF\\\", \\\"PG\\\", \\\"PH\\\", \\\"PK\\\", \\\"PL\\\", \\\"PM\\\", \\\"PR\\\", \\\"PS\\\", \\\"PT\\\", \\\"PW\\\", \\\"PY\\\", \\\"QA\\\", \\\"RE\\\", \\\"RO\\\", \\\"RS\\\", \\\"RU\\\", \\\"RW\\\", \\\"SA\\\", \\\"SB\\\", \\\"SC\\\", \\\"SE\\\", \\\"SG\\\", \\\"SH\\\", \\\"SI\\\", \\\"SJ\\\", \\\"SK\\\", \\\"SL\\\", \\\"SM\\\", \\\"SN\\\", \\\"SR\\\", \\\"ST\\\", \\\"SV\\\", \\\"SX\\\", \\\"SZ\\\", \\\"TC\\\", \\\"TF\\\", \\\"TG\\\", \\\"TH\\\", \\\"TJ\\\", \\\"TK\\\", \\\"TL\\\", \\\"TO\\\", \\\"TR\\\", \\\"TT\\\", \\\"TV\\\", \\\"TW\\\", \\\"TZ\\\", \\\"UA\\\", \\\"UG\\\", \\\"UM\\\", \\\"US\\\", \\\"UY\\\", \\\"UZ\\\", \\\"VA\\\", \\\"VC\\\", \\\"VG\\\", \\\"VI\\\", \\\"VN\\\", \\\"VU\\\", \\\"WF\\\", \\\"WS\\\", \\\"XK\\\", \\\"YT\\\", \\\"ZA\\\", \\\"ZM\\\", \\\"ZW\\\"]\\\"
    List<DiscountLine> discountLines = Arrays.asList(); // List of discounts applied to this order via the KCO discount-service
    String klarnaPartner = "klarnaPartner_example";
    try {
      Order result = client
              .order
              .createNewOrder(purchaseCountry, purchaseCurrency, locale, orderAmount, orderTaxAmount, orderLines)
              .tags(tags)
              .orderId(orderId)
              .name(name)
              .status(status)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .merchantUrls(merchantUrls)
              .htmlSnippet(htmlSnippet)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .startedAt(startedAt)
              .completedAt(completedAt)
              .lastModifiedAt(lastModifiedAt)
              .options(options)
              .attachment(attachment)
              .externalPaymentMethods(externalPaymentMethods)
              .externalCheckouts(externalCheckouts)
              .shippingCountries(shippingCountries)
              .shippingOptions(shippingOptions)
              .merchantData(merchantData)
              .gui(gui)
              .merchantRequested(merchantRequested)
              .selectedShippingOption(selectedShippingOption)
              .recurring(recurring)
              .recurringToken(recurringToken)
              .recurringDescription(recurringDescription)
              .billingCountries(billingCountries)
              .discountLines(discountLines)
              .klarnaPartner(klarnaPartner)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getOrderId());
      System.out.println(result.getName());
      System.out.println(result.getPurchaseCountry());
      System.out.println(result.getPurchaseCurrency());
      System.out.println(result.getLocale());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getOrderAmount());
      System.out.println(result.getOrderTaxAmount());
      System.out.println(result.getOrderLines());
      System.out.println(result.getCustomer());
      System.out.println(result.getMerchantUrls());
      System.out.println(result.getHtmlSnippet());
      System.out.println(result.getMerchantReference1());
      System.out.println(result.getMerchantReference2());
      System.out.println(result.getStartedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getLastModifiedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getAttachment());
      System.out.println(result.getExternalPaymentMethods());
      System.out.println(result.getExternalCheckouts());
      System.out.println(result.getShippingCountries());
      System.out.println(result.getShippingOptions());
      System.out.println(result.getMerchantData());
      System.out.println(result.getGui());
      System.out.println(result.getMerchantRequested());
      System.out.println(result.getSelectedShippingOption());
      System.out.println(result.getRecurring());
      System.out.println(result.getRecurringToken());
      System.out.println(result.getRecurringDescription());
      System.out.println(result.getBillingCountries());
      System.out.println(result.getDiscountLines());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .createNewOrder(purchaseCountry, purchaseCurrency, locale, orderAmount, orderTaxAmount, orderLines)
              .tags(tags)
              .orderId(orderId)
              .name(name)
              .status(status)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .merchantUrls(merchantUrls)
              .htmlSnippet(htmlSnippet)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .startedAt(startedAt)
              .completedAt(completedAt)
              .lastModifiedAt(lastModifiedAt)
              .options(options)
              .attachment(attachment)
              .externalPaymentMethods(externalPaymentMethods)
              .externalCheckouts(externalCheckouts)
              .shippingCountries(shippingCountries)
              .shippingOptions(shippingOptions)
              .merchantData(merchantData)
              .gui(gui)
              .merchantRequested(merchantRequested)
              .selectedShippingOption(selectedShippingOption)
              .recurring(recurring)
              .recurringToken(recurringToken)
              .recurringDescription(recurringDescription)
              .billingCountries(billingCountries)
              .discountLines(discountLines)
              .klarnaPartner(klarnaPartner)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **klarnaPartner** | **String**|  | [optional] |
| **order** | [**Order**](Order.md)|  | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **400** | We were unable to create an order with the provided data. Some field constraint was violated. |  -  |
| **401** | You were not authorized to execute this operation. |  -  |

<a name="getOrderDetails"></a>
# **getOrderDetails**
> Order getOrderDetails(orderId).execute();

Get order details

Get the full details of a Klarna checkout order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaCheckout client = new KlarnaCheckout(configuration);
    String orderId = "orderId_example";
    try {
      Order result = client
              .order
              .getOrderDetails(orderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getOrderId());
      System.out.println(result.getName());
      System.out.println(result.getPurchaseCountry());
      System.out.println(result.getPurchaseCurrency());
      System.out.println(result.getLocale());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getOrderAmount());
      System.out.println(result.getOrderTaxAmount());
      System.out.println(result.getOrderLines());
      System.out.println(result.getCustomer());
      System.out.println(result.getMerchantUrls());
      System.out.println(result.getHtmlSnippet());
      System.out.println(result.getMerchantReference1());
      System.out.println(result.getMerchantReference2());
      System.out.println(result.getStartedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getLastModifiedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getAttachment());
      System.out.println(result.getExternalPaymentMethods());
      System.out.println(result.getExternalCheckouts());
      System.out.println(result.getShippingCountries());
      System.out.println(result.getShippingOptions());
      System.out.println(result.getMerchantData());
      System.out.println(result.getGui());
      System.out.println(result.getMerchantRequested());
      System.out.println(result.getSelectedShippingOption());
      System.out.println(result.getRecurring());
      System.out.println(result.getRecurringToken());
      System.out.println(result.getRecurringDescription());
      System.out.println(result.getBillingCountries());
      System.out.println(result.getDiscountLines());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .getOrderDetails(orderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**|  | |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | You were not authorized to execute this operation. |  -  |
| **403** | Merchant was not activated. |  -  |
| **404** | We did not find any order with given ID. You need to create a new order. |  -  |

<a name="updateOrder"></a>
# **updateOrder**
> Order updateOrder(orderId).order(order).execute();

Update an order

To update an order simply provide a JSON object with the properties you want to update. Properties not provided in the request will stay the same.&lt;br&gt;Please note: an order can only be updated when the status is checkout_incomplete

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrderApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaCheckout client = new KlarnaCheckout(configuration);
    String purchaseCountry = "purchaseCountry_example"; // The purchase country of the merchant's store. The format to be used is ISO 3166 alpha-2. Eg: GB, SE, DE, US, etc.   Note: purchase country and currency need to match the defined merchant configuration. For global configuration read this https://docs.klarna.com/klarna-checkout/popular-use-cases/selling-to-multiple-countries/
    String purchaseCurrency = "purchaseCurrency_example"; // The purchase currency of the merchant's store. The format to be used is ISO 4217. Eg: USD, EUR, SEK, GBP, etc.  Note: purchase country and currency need to match the defined merchant configuration. For global configuration read this https://docs.klarna.com/klarna-checkout/popular-use-cases/selling-to-multiple-countries/
    String locale = "locale_example"; // Used to define the language and region of the customer. RFC 1766 customer's locale.
    Long orderAmount = 56L; // Total amount of the order including tax and any available discounts. The value should be in non-negative minor units.  Example: 25 Euros should be 2500.
    Long orderTaxAmount = 56L; // Total tax amount of the order. The value should be in non-negative minor units.  Example: 25 Euros should be 2500.
    List<OrderLine> orderLines = Arrays.asList(); // An array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
    String orderId = "orderId_example";
    List<String> tags = Arrays.asList(); // Extra information added to the order.  Example: [\\\"dangerous_goods\\\", \\\"bulky\\\"]
    String orderId = "orderId_example"; // Unique order ID that will be used for the entire lifecycle of the order. (max 255 characters)
    String name = "name_example"; // The merchant name (max 255 characters).
    String status = "status_example"; // The current status of the order. The status will be ‘incomplete’ until the customer has been successfully authorized.
    Address billingAddress = new Address();
    Address shippingAddress = new Address();
    Customer customer = new Customer();
    MerchantUrls merchantUrls = new MerchantUrls();
    String htmlSnippet = "htmlSnippet_example"; // The HTML snippet that is used to render the checkout in an iframe.
    String merchantReference1 = "merchantReference1_example"; // Used for storing merchant's internal order number or other reference. If set, will be shown on the confirmation page as \\\"order number\\\" . The value is also available in the settlement files. (max 255 characters). Example: \\\"45aa52f387871e3a210645d4\\\"
    String merchantReference2 = "merchantReference2_example"; // Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters). Example: \\\"45aa52f387871e3a210645d4\\\"
    OffsetDateTime startedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order has been created. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    OffsetDateTime completedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order has been completed. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    OffsetDateTime lastModifiedAt = OffsetDateTime.now(); // ISO 8601 datetime. The date and time when the order was last modified. The format will be as follows: \\\"yyyy-mm-ddThh:mm:ssZ\\\"
    Options options = new Options();
    Attachment attachment = new Attachment();
    List<PaymentProvider> externalPaymentMethods = Arrays.asList(); // List of external payment methods that will be displayed as part of payment methods in the checkout.
    List<PaymentProvider> externalCheckouts = Arrays.asList(); // List of external checkouts that will be displayed as part of payment methods in the checkout. The image_url is required, and the image size has to be 276x48px
    List<String> shippingCountries = Arrays.asList(); // List of allowed shipping countries for this order in ISO-3166 alpha-2 format.  If specified, the customer will be able to change the shipping country in the checkout and you will be notified through ‘address_update’ callback or the ‘shipping_address_change’ javascript event.   If not specified then the default value will be the purchase country.  Example: look at billing_countries example.
    List<ShippingOption> shippingOptions = Arrays.asList(); // A list of shipping options available for this order.
    String merchantData = "merchantData_example"; // Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters).
    Gui gui = new Gui();
    MerchantRequested merchantRequested = new MerchantRequested();
    ShippingOption selectedShippingOption = new ShippingOption();
    Boolean recurring = true; // Indicates whether this purchase will create a token that can be used by the merchant to create recurring purchases. This must be enabled for the merchant to use. Default: false  Depending on specified country, recurring could be used for the following payment methods: Pay Later, Direct Debit, Card.
    String recurringToken = "recurringToken_example"; // Token to be used when creating recurring orders.
    String recurringDescription = "recurringDescription_example"; // Description to be added to the recurring order.
    List<String> billingCountries = Arrays.asList(); // List of allowed billing countries for this order. If specified, the customer will be able to change the billing country in the checkout and you will be notified through ‘country_change’ callback or the ‘billing_address_change’ javascript event. If not specified but shipping_countries is specified, will use same values as shipping_countries. If not specified and shipping_countries is not specified, then the default value will be the purchase country.  Example: [\\\"AD\\\", \\\"AE\\\", \\\"AG\\\", \\\"AI\\\", \\\"AL\\\", \\\"AM\\\", \\\"AQ\\\", \\\"AR\\\", \\\"AS\\\", \\\"AT\\\", \\\"AU\\\", \\\"AW\\\", \\\"AX\\\", \\\"AZ\\\", \\\"BA\\\", \\\"BB\\\", \\\"BD\\\", \\\"BE\\\", \\\"BF\\\", \\\"BG\\\", \\\"BH\\\", \\\"BJ\\\", \\\"BL\\\", \\\"BM\\\", \\\"BN\\\", \\\"BO\\\", \\\"BQ\\\", \\\"BR\\\", \\\"BS\\\", \\\"BT\\\", \\\"BW\\\", \\\"BY\\\", \\\"BZ\\\", \\\"CA\\\", \\\"CF\\\", \\\"CH\\\", \\\"CI\\\", \\\"CK\\\", \\\"CL\\\", \\\"CM\\\", \\\"CN\\\", \\\"CO\\\", \\\"CR\\\", \\\"CU\\\", \\\"CV\\\", \\\"CW\\\", \\\"CX\\\", \\\"CY\\\", \\\"CZ\\\", \\\"DE\\\", \\\"DJ\\\", \\\"DK\\\", \\\"DM\\\", \\\"DO\\\", \\\"DZ\\\", \\\"EC\\\", \\\"EE\\\", \\\"EG\\\", \\\"ER\\\", \\\"ES\\\", \\\"ET\\\", \\\"FI\\\", \\\"FJ\\\", \\\"FK\\\", \\\"FM\\\", \\\"FO\\\", \\\"FR\\\", \\\"GA\\\", \\\"GB\\\", \\\"GD\\\", \\\"GE\\\", \\\"GF\\\", \\\"GG\\\", \\\"GH\\\", \\\"GI\\\", \\\"GL\\\", \\\"GM\\\", \\\"GN\\\", \\\"GP\\\", \\\"GR\\\", \\\"GS\\\", \\\"GT\\\", \\\"GU\\\", \\\"GY\\\", \\\"HK\\\", \\\"HN\\\", \\\"HR\\\", \\\"HU\\\", \\\"ID\\\", \\\"IE\\\", \\\"IL\\\", \\\"IM\\\", \\\"IN\\\", \\\"IS\\\", \\\"IT\\\", \\\"JE\\\", \\\"JM\\\", \\\"JO\\\", \\\"JP\\\", \\\"KE\\\", \\\"KG\\\", \\\"KI\\\", \\\"KM\\\", \\\"KN\\\", \\\"KR\\\", \\\"KW\\\", \\\"KY\\\", \\\"KZ\\\", \\\"LA\\\", \\\"LA\\\", \\\"LB\\\", \\\"LC\\\", \\\"LI\\\", \\\"LK\\\", \\\"LR\\\", \\\"LS\\\", \\\"LT\\\", \\\"LU\\\", \\\"LV\\\", \\\"MA\\\", \\\"MC\\\", \\\"MD\\\", \\\"ME\\\", \\\"MF\\\", \\\"MG\\\", \\\"MH\\\", \\\"MK\\\", \\\"MK\\\", \\\"ML\\\", \\\"MM\\\", \\\"MN\\\", \\\"MO\\\", \\\"MP\\\", \\\"MQ\\\", \\\"MR\\\", \\\"MT\\\", \\\"MU\\\", \\\"MV\\\", \\\"MW\\\", \\\"MX\\\", \\\"MY\\\", \\\"MZ\\\", \\\"NA\\\", \\\"NC\\\", \\\"NE\\\", \\\"NF\\\", \\\"NG\\\", \\\"NI\\\", \\\"NL\\\", \\\"NO\\\", \\\"NP\\\", \\\"NR\\\", \\\"NU\\\", \\\"NZ\\\", \\\"OM\\\", \\\"PA\\\", \\\"PE\\\", \\\"PF\\\", \\\"PG\\\", \\\"PH\\\", \\\"PK\\\", \\\"PL\\\", \\\"PM\\\", \\\"PR\\\", \\\"PS\\\", \\\"PT\\\", \\\"PW\\\", \\\"PY\\\", \\\"QA\\\", \\\"RE\\\", \\\"RO\\\", \\\"RS\\\", \\\"RU\\\", \\\"RW\\\", \\\"SA\\\", \\\"SB\\\", \\\"SC\\\", \\\"SE\\\", \\\"SG\\\", \\\"SH\\\", \\\"SI\\\", \\\"SJ\\\", \\\"SK\\\", \\\"SL\\\", \\\"SM\\\", \\\"SN\\\", \\\"SR\\\", \\\"ST\\\", \\\"SV\\\", \\\"SX\\\", \\\"SZ\\\", \\\"TC\\\", \\\"TF\\\", \\\"TG\\\", \\\"TH\\\", \\\"TJ\\\", \\\"TK\\\", \\\"TL\\\", \\\"TO\\\", \\\"TR\\\", \\\"TT\\\", \\\"TV\\\", \\\"TW\\\", \\\"TZ\\\", \\\"UA\\\", \\\"UG\\\", \\\"UM\\\", \\\"US\\\", \\\"UY\\\", \\\"UZ\\\", \\\"VA\\\", \\\"VC\\\", \\\"VG\\\", \\\"VI\\\", \\\"VN\\\", \\\"VU\\\", \\\"WF\\\", \\\"WS\\\", \\\"XK\\\", \\\"YT\\\", \\\"ZA\\\", \\\"ZM\\\", \\\"ZW\\\"]\\\"
    List<DiscountLine> discountLines = Arrays.asList(); // List of discounts applied to this order via the KCO discount-service
    try {
      Order result = client
              .order
              .updateOrder(purchaseCountry, purchaseCurrency, locale, orderAmount, orderTaxAmount, orderLines, orderId)
              .tags(tags)
              .orderId(orderId)
              .name(name)
              .status(status)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .merchantUrls(merchantUrls)
              .htmlSnippet(htmlSnippet)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .startedAt(startedAt)
              .completedAt(completedAt)
              .lastModifiedAt(lastModifiedAt)
              .options(options)
              .attachment(attachment)
              .externalPaymentMethods(externalPaymentMethods)
              .externalCheckouts(externalCheckouts)
              .shippingCountries(shippingCountries)
              .shippingOptions(shippingOptions)
              .merchantData(merchantData)
              .gui(gui)
              .merchantRequested(merchantRequested)
              .selectedShippingOption(selectedShippingOption)
              .recurring(recurring)
              .recurringToken(recurringToken)
              .recurringDescription(recurringDescription)
              .billingCountries(billingCountries)
              .discountLines(discountLines)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getOrderId());
      System.out.println(result.getName());
      System.out.println(result.getPurchaseCountry());
      System.out.println(result.getPurchaseCurrency());
      System.out.println(result.getLocale());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getOrderAmount());
      System.out.println(result.getOrderTaxAmount());
      System.out.println(result.getOrderLines());
      System.out.println(result.getCustomer());
      System.out.println(result.getMerchantUrls());
      System.out.println(result.getHtmlSnippet());
      System.out.println(result.getMerchantReference1());
      System.out.println(result.getMerchantReference2());
      System.out.println(result.getStartedAt());
      System.out.println(result.getCompletedAt());
      System.out.println(result.getLastModifiedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getAttachment());
      System.out.println(result.getExternalPaymentMethods());
      System.out.println(result.getExternalCheckouts());
      System.out.println(result.getShippingCountries());
      System.out.println(result.getShippingOptions());
      System.out.println(result.getMerchantData());
      System.out.println(result.getGui());
      System.out.println(result.getMerchantRequested());
      System.out.println(result.getSelectedShippingOption());
      System.out.println(result.getRecurring());
      System.out.println(result.getRecurringToken());
      System.out.println(result.getRecurringDescription());
      System.out.println(result.getBillingCountries());
      System.out.println(result.getDiscountLines());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .order
              .updateOrder(purchaseCountry, purchaseCurrency, locale, orderAmount, orderTaxAmount, orderLines, orderId)
              .tags(tags)
              .orderId(orderId)
              .name(name)
              .status(status)
              .billingAddress(billingAddress)
              .shippingAddress(shippingAddress)
              .customer(customer)
              .merchantUrls(merchantUrls)
              .htmlSnippet(htmlSnippet)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .startedAt(startedAt)
              .completedAt(completedAt)
              .lastModifiedAt(lastModifiedAt)
              .options(options)
              .attachment(attachment)
              .externalPaymentMethods(externalPaymentMethods)
              .externalCheckouts(externalCheckouts)
              .shippingCountries(shippingCountries)
              .shippingOptions(shippingOptions)
              .merchantData(merchantData)
              .gui(gui)
              .merchantRequested(merchantRequested)
              .selectedShippingOption(selectedShippingOption)
              .recurring(recurring)
              .recurringToken(recurringToken)
              .recurringDescription(recurringDescription)
              .billingCountries(billingCountries)
              .discountLines(discountLines)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**|  | |
| **order** | [**Order**](Order.md)|  | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | We were unable to update an order with the provided data. Some field constraint was violated. |  -  |
| **401** | You were not authorized to execute this operation. |  -  |
| **403** | You tried to modify a read only resource. |  -  |
| **404** | We did not find any order with given ID. You need to create a new order. |  -  |

