/*
 * Klarna Checkout API V3
 * The checkout API is used to create a checkout with Klarna and update the checkout order during the purchase. As soon as the purchase is completed the order should be read and handled using the [`Order Management API`](https://docs.klarna.com/api/ordermanagement).\\n\\nRead more on [Klarna checkout](https://docs.klarna.com/klarna-checkout/).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.Customer;
import com.konfigthis.client.model.DiscountLine;
import com.konfigthis.client.model.Gui;
import com.konfigthis.client.model.MerchantRequested;
import com.konfigthis.client.model.MerchantUrls;
import com.konfigthis.client.model.Options;
import com.konfigthis.client.model.OrderLine;
import com.konfigthis.client.model.PaymentProvider;
import com.konfigthis.client.model.ShippingOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Order
 */
public class OrderTest {
    private final Order model = new Order();

    /**
     * Model tests for Order
     */
    @Test
    public void testOrder() {
        // TODO: test Order
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'orderId'
     */
    @Test
    public void orderIdTest() {
        // TODO: test orderId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'purchaseCountry'
     */
    @Test
    public void purchaseCountryTest() {
        // TODO: test purchaseCountry
    }

    /**
     * Test the property 'purchaseCurrency'
     */
    @Test
    public void purchaseCurrencyTest() {
        // TODO: test purchaseCurrency
    }

    /**
     * Test the property 'locale'
     */
    @Test
    public void localeTest() {
        // TODO: test locale
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'billingAddress'
     */
    @Test
    public void billingAddressTest() {
        // TODO: test billingAddress
    }

    /**
     * Test the property 'shippingAddress'
     */
    @Test
    public void shippingAddressTest() {
        // TODO: test shippingAddress
    }

    /**
     * Test the property 'orderAmount'
     */
    @Test
    public void orderAmountTest() {
        // TODO: test orderAmount
    }

    /**
     * Test the property 'orderTaxAmount'
     */
    @Test
    public void orderTaxAmountTest() {
        // TODO: test orderTaxAmount
    }

    /**
     * Test the property 'orderLines'
     */
    @Test
    public void orderLinesTest() {
        // TODO: test orderLines
    }

    /**
     * Test the property 'customer'
     */
    @Test
    public void customerTest() {
        // TODO: test customer
    }

    /**
     * Test the property 'merchantUrls'
     */
    @Test
    public void merchantUrlsTest() {
        // TODO: test merchantUrls
    }

    /**
     * Test the property 'htmlSnippet'
     */
    @Test
    public void htmlSnippetTest() {
        // TODO: test htmlSnippet
    }

    /**
     * Test the property 'merchantReference1'
     */
    @Test
    public void merchantReference1Test() {
        // TODO: test merchantReference1
    }

    /**
     * Test the property 'merchantReference2'
     */
    @Test
    public void merchantReference2Test() {
        // TODO: test merchantReference2
    }

    /**
     * Test the property 'startedAt'
     */
    @Test
    public void startedAtTest() {
        // TODO: test startedAt
    }

    /**
     * Test the property 'completedAt'
     */
    @Test
    public void completedAtTest() {
        // TODO: test completedAt
    }

    /**
     * Test the property 'lastModifiedAt'
     */
    @Test
    public void lastModifiedAtTest() {
        // TODO: test lastModifiedAt
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

    /**
     * Test the property 'attachment'
     */
    @Test
    public void attachmentTest() {
        // TODO: test attachment
    }

    /**
     * Test the property 'externalPaymentMethods'
     */
    @Test
    public void externalPaymentMethodsTest() {
        // TODO: test externalPaymentMethods
    }

    /**
     * Test the property 'externalCheckouts'
     */
    @Test
    public void externalCheckoutsTest() {
        // TODO: test externalCheckouts
    }

    /**
     * Test the property 'shippingCountries'
     */
    @Test
    public void shippingCountriesTest() {
        // TODO: test shippingCountries
    }

    /**
     * Test the property 'shippingOptions'
     */
    @Test
    public void shippingOptionsTest() {
        // TODO: test shippingOptions
    }

    /**
     * Test the property 'merchantData'
     */
    @Test
    public void merchantDataTest() {
        // TODO: test merchantData
    }

    /**
     * Test the property 'gui'
     */
    @Test
    public void guiTest() {
        // TODO: test gui
    }

    /**
     * Test the property 'merchantRequested'
     */
    @Test
    public void merchantRequestedTest() {
        // TODO: test merchantRequested
    }

    /**
     * Test the property 'selectedShippingOption'
     */
    @Test
    public void selectedShippingOptionTest() {
        // TODO: test selectedShippingOption
    }

    /**
     * Test the property 'recurring'
     */
    @Test
    public void recurringTest() {
        // TODO: test recurring
    }

    /**
     * Test the property 'recurringToken'
     */
    @Test
    public void recurringTokenTest() {
        // TODO: test recurringToken
    }

    /**
     * Test the property 'recurringDescription'
     */
    @Test
    public void recurringDescriptionTest() {
        // TODO: test recurringDescription
    }

    /**
     * Test the property 'billingCountries'
     */
    @Test
    public void billingCountriesTest() {
        // TODO: test billingCountries
    }

    /**
     * Test the property 'discountLines'
     */
    @Test
    public void discountLinesTest() {
        // TODO: test discountLines
    }

}