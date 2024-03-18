

# ShippingOption


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description. |  [optional] |
|**id** | **String** | id |  |
|**name** | **String** | Name. |  |
|**promo** | **String** | Promotion name. To be used if this shipping option is promotional. |  [optional] |
|**price** | **Long** | Price including tax. |  |
|**preselected** | **Boolean** | If true, this option will be preselected when checkout loads. Default: false |  [optional] |
|**taxAmount** | **Long** | Tax amount. |  |
|**taxRate** | **Long** | Non-negative. In percent, two implicit decimals. I.e 2500 &#x3D; 25%. |  |
|**shippingMethod** | **String** | Shipping method. Possible values:&lt;ul&gt;&lt;li&gt;PickUpStore&lt;/li&gt;&lt;li&gt;Home&lt;/li&gt;&lt;li&gt;BoxReg&lt;/li&gt;&lt;li&gt;BoxUnreg&lt;/li&gt;&lt;li&gt;PickUpPoint&lt;/li&gt;&lt;li&gt;Own&lt;/li&gt;&lt;li&gt;Postal&lt;/li&gt;&lt;li&gt;DHLPackstation&lt;/li&gt;&lt;li&gt;Digital&lt;/li&gt;&lt;/ul&gt; If DHLPackstation is selected the correct form will be displayed. |  [optional] |
|**deliveryDetails** | [**DeliveryDetailsV1**](DeliveryDetailsV1.md) |  |  [optional] |
|**tmsReference** | **String** | TMS reference. Required to map completed orders to shipments reserved in TMS. |  [optional] |
|**selectedAddons** | [**List&lt;SelectedAddon&gt;**](SelectedAddon.md) |  |  [optional] |



