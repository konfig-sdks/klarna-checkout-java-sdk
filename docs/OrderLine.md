

# OrderLine


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of the order line item. The possible values are:&lt;ul&gt;&lt;li&gt;&lt;em&gt;physical (physical good)&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;discount&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;shipping_fee&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;sales_tax (depends on the country/city, usually called VAT)&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;digital (digital good)&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;gift_card&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;store_credit (credit from the merchant)&lt;/em&gt;&lt;/li&gt;&lt;li&gt;&lt;em&gt;surcharge (extra charge)&lt;/em&gt;&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**reference** | **String** | Article number, SKU or similar. (max 255 characters) |  [optional] |
|**name** | **String** | Descriptive name of the order line item (max 255 characters) |  |
|**quantity** | **Long** | Non-negative number. Quantity of the order line item. |  |
|**subscription** | [**Subscription**](Subscription.md) |  |  [optional] |
|**quantityUnit** | **String** | Unit used to describe the quantity, e.g. kg, pcs... If defined has to be 1-8 characters |  [optional] |
|**unitPrice** | **Long** | Minor units. Includes tax, excludes discount. (max value: 100000000).  Example: 100 Euros should be 10000. |  |
|**taxRate** | **Long** | Non-negative value. The percentage value is represented with two implicit decimals. (max 10000)  Example: 25% should be 2500. |  |
|**totalAmount** | **Long** | Minor units. Includes tax and discount.   Example: 25 euros should be 2500 Value &#x3D; (quantity x unit_price) - total_discount_amount. (max value: 100000000) |  |
|**totalDiscountAmount** | **Long** | Non-negative minor units. Includes tax.  Example: 25 euros should be 2500 |  [optional] |
|**totalTaxAmount** | **Long** | Must be within ±1 of total_amount - total_amount \\* 10000 / (10000 + tax_rate). Negative when type is discount. |  |
|**merchantData** | **String** | Property used to store additional metadata per item that will be returned whenever an order is read from Klarna. Pass through field. (max 1024 characters). |  [optional] |
|**productUrl** | **String** | URL to the product page that can be later embedded in communications between Klarna and the customer. (max 1024 characters) |  [optional] |
|**imageUrl** | **String** | URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters)  Improves post-purchase customer experiences. |  [optional] |
|**productIdentifiers** | [**ProductIdentifiers**](ProductIdentifiers.md) |  |  [optional] |
|**shippingAttributes** | [**ShippingAttributes**](ShippingAttributes.md) |  |  [optional] |



