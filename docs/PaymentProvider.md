

# PaymentProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Short description of the payment method. This is displayed below the selected payment method. (max 500 characters) |  [optional] |
|**name** | **String** | The name of the payment provider. (max 255 characters) |  |
|**fee** | **Long** | Minor units. Includes tax. |  [optional] |
|**countries** | **List&lt;String&gt;** | If specified, limits the method to the listed countries (alpha 2 codes). |  [optional] |
|**label** | **String** | Controls label of buy button&lt;ul&gt;&lt;li&gt;continue&lt;/li&gt;&lt;li&gt;complete&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**redirectUrl** | **String** | URL to redirect to. (must be https, min 7, max 2000 characters) |  |
|**imageUrl** | **String** | URL to an image to display. (must be https, max 2000 characters) |  [optional] |



