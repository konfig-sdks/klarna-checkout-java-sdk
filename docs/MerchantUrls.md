

# MerchantUrls


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**terms** | **String** | URL for the terms and conditions page of the merchant. The URL will be displayed inside the Klarna Checkout iFrame.(max 2000 characters) Example: \&quot;https://merchant.com/terms\&quot; |  |
|**checkout** | **String** | URL for the checkout page of the merchant. (max 2000 characters) Example: \&quot;https://merchant.com/checkout\&quot; |  |
|**confirmation** | **String** | URL of the merchant confirmation page. The consumer will be redirected back to the confirmation page if the authorization is successful after the customer clicks on the ‘Place Order’ button inside checkout. The special characters of the confirmation URL should be encoded, e.g. the \&quot;space\&quot; character should be written as \&quot;%20\&quot;. Then, on top of that, the whole confirmation URL should be encoded. E.g. the \&quot;space\&quot; character should become \&quot;%2520\&quot;. (max 2000 characters) Example: \&quot;https://merchant.com/confirmation\&quot; |  |
|**push** | **String** | URL that will be used for push notification when an order is completed. Should be different than checkout and confirmation URLs. (max 2000 characters) Example: \&quot;https://merchant.com/push\&quot; |  |
|**validation** | **String** | URL that will be requested for final merchant validation. (must be https, max 2000 characters) Example: \&quot;https://merchant.com/validation\&quot; |  [optional] |
|**notification** | **String** | URL for notifications on pending orders. (max 2000 characters) Example: \&quot;https://merchant.com/notification/{checkout.order.id}\&quot; |  [optional] |
|**cancellationTerms** | **String** | URL for the cancellation terms page of the merchant. The URL will be displayed in the email that is sent to the customer after the order is captured.(max 2000 characters) Example: \&quot;https://merchant.com/terms/cancelation\&quot; |  [optional] |
|**shippingOptionUpdate** | **String** | URL for shipping option update. (must be https, max 2000 characters) Example: \&quot;https://merchant.com/shippingoptionupdate\&quot; |  [optional] |
|**addressUpdate** | **String** | URL for shipping, tax and purchase currency updates. Will be called on address changes. (must be https, max 2000 characters) Example: \&quot;https://merchant.com/addressupdate\&quot; |  [optional] |
|**countryChange** | **String** | URL for shipping, tax and purchase currency updates. Will be called on billing or shipping country changes. (must be https, max 2000 characters) Example: \&quot;https://merchant.com/countrychange\&quot; |  [optional] |



