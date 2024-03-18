

# DiscountLine


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Descriptive name of discount |  |
|**quantity** | **Long** | Non-negative number. Quantity of the discount line item. |  |
|**unitPrice** | **Long** | Minor units. Includes tax, excludes discount. (Must be non-positive).  Example: -100 Euros should be -10000. |  |
|**taxRate** | **Long** | Non-negative value. The percentage value is represented with two implicit decimals. (max 10000)  Example: 25% should be 2500. |  |
|**totalAmount** | **Long** | Minor units. Includes tax and discount.   Example: -25 euros should be -2500 Value &#x3D; (quantity x unit_price). (Must be non-positive) |  |
|**totalTaxAmount** | **Long** | Must be within ±1 of total_amount - total_amount \\* 10000 / (10000 + tax_rate). Should be non-positive |  |
|**reference** | **String** | The CRM reference to the gift-card that was entered by the user |  [optional] |
|**merchantData** | **String** | The gift-card number that was entered by the user |  [optional] |



