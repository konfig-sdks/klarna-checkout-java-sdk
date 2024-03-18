

# Options


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requireValidateCallbackSuccess** | **Boolean** | If true, validate callback must get a positive response to not stop purchase. Default: false. |  [optional] |
|**acquiringChannel** | **String** | Acquiring channel for the order. The possible values are: &lt;ul&gt;&lt;li&gt;&lt;em&gt;ECOMMERCE for \&quot;E-commerce\&quot;&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;IN_STORE for \&quot;Purchase in boutique\&quot;&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;Default : ECOMMERCE&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**vatRemoved** | **Boolean** | If true, VAT is not displayed in Checkout&#39;s Order Summary page. |  [optional] |
|**allowSeparateShippingAddress** | **Boolean** | If true, the consumer can enter different billing and shipping addresses. Default: false, except for purchase_country DE where default is: true |  [optional] |
|**colorButton** | **String** | Color for the buttons within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**colorButtonText** | **String** | Color for the text inside the buttons within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**colorCheckbox** | **String** | Color for the checkboxes within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**colorCheckboxCheckmark** | **String** | Color for the checkboxes checkmark within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**colorHeader** | **String** | Color for the headers within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**colorLink** | **String** | Color for the hyperlinks within the iFrame. Value should be a CSS hex color, e.g. \&quot;#FF9900\&quot; |  [optional] |
|**dateOfBirthMandatory** | **Boolean** | If true, the consumer cannot skip date of birth. Default: false |  [optional] |
|**shippingDetails** | **String** | A message that will be presented on the confirmation page under the headline \&quot;Delivery\&quot; (max 255 characters). |  [optional] |
|**titleMandatory** | **Boolean** | If specified to false, title becomes optional. Only available for orders for country GB. |  [optional] |
|**additionalCheckbox** | [**Checkbox**](Checkbox.md) |  |  [optional] |
|**nationalIdentificationNumberMandatory** | **Boolean** | If true, the user cannot skip national identification number in SE, NO, FI and DK. Default: false. In order to read the national identification number in the validation callback, please contact Klarna’s merchant support. |  [optional] |
|**additionalMerchantTerms** | **String** | Additional merchant defined field. e.g. Extra terms and conditions to show.  Example: \&quot;ADDITIONAL MERCHANT TERMS! \\[terms link\\](https://merchant.com/extra_terms)\&quot; |  [optional] |
|**phoneMandatory** | **Boolean** | If false, the consumer can skip the phone. Only available for orders in DACH countries. |  [optional] |
|**radiusBorder** | **String** | Radius for the border of elements within the iFrame. |  [optional] |
|**allowedCustomerTypes** | **List&lt;String&gt;** | A list of allowed customer types. Supported types: &lt;b&gt;person&lt;/b&gt; &amp; &lt;b&gt;organization&lt;/b&gt;. Example: [\&quot;person\&quot;,\&quot;organization\&quot;] |  [optional] |
|**showSubtotalDetail** | **Boolean** | If true, the Order Detail subtotals view is expanded when the Klarna Checkout iFrame is loaded. Default: false |  [optional] |
|**additionalCheckboxes** | [**List&lt;CheckboxV2&gt;**](CheckboxV2.md) |  |  [optional] |
|**verifyNationalIdentificationNumber** | **Boolean** | Enable verification of National Identification Numbers only in Sweden, Finland and Norway. This option also make the national identification number mandatory. (Not applicable for countries outside of Sweden, Finland and Norway) |  [optional] |
|**autoCapture** | **Boolean** | Allow merchant to trigger auto capturing. |  [optional] |
|**requireClientValidation** | **Boolean** | If true, a client side validation is needed to complete the purchase |  [optional] |
|**enableDiscountModule** | **Boolean** | Enables the inline discount module |  [optional] |
|**showVatRegistrationNumberField** | **Boolean** | If true, a optional VAT registration number field will be shown in the address form. Only applies for b2b orders. |  [optional] |



