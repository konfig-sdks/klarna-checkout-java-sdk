package com.konfigthis.client;

import com.konfigthis.client.api.OrderApi;

public class KlarnaCheckout {
    private ApiClient apiClient;
    public final OrderApi order;

    public KlarnaCheckout() {
        this(null);
    }

    public KlarnaCheckout(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.order = new OrderApi(this.apiClient);
    }

}
