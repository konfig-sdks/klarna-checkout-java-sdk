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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.PickupLocationV1;
import com.konfigthis.client.model.ProductV1;
import com.konfigthis.client.model.TimeslotV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DeliveryDetailsV1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DeliveryDetailsV1 {
  public static final String SERIALIZED_NAME_CARRIER = "carrier";
  @SerializedName(SERIALIZED_NAME_CARRIER)
  private String carrier;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private ProductV1 product;

  public static final String SERIALIZED_NAME_TIMESLOT = "timeslot";
  @SerializedName(SERIALIZED_NAME_TIMESLOT)
  private TimeslotV1 timeslot;

  public static final String SERIALIZED_NAME_PICKUP_LOCATION = "pickup_location";
  @SerializedName(SERIALIZED_NAME_PICKUP_LOCATION)
  private PickupLocationV1 pickupLocation;

  public DeliveryDetailsV1() {
  }

  public DeliveryDetailsV1 carrier(String carrier) {
    
    
    
    
    this.carrier = carrier;
    return this;
  }

   /**
   * Carrier product name
   * @return carrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Carrier product name")

  public String getCarrier() {
    return carrier;
  }


  public void setCarrier(String carrier) {
    
    
    
    this.carrier = carrier;
  }


  public DeliveryDetailsV1 product(ProductV1 product) {
    
    
    
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductV1 getProduct() {
    return product;
  }


  public void setProduct(ProductV1 product) {
    
    
    
    this.product = product;
  }


  public DeliveryDetailsV1 timeslot(TimeslotV1 timeslot) {
    
    
    
    
    this.timeslot = timeslot;
    return this;
  }

   /**
   * Get timeslot
   * @return timeslot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeslotV1 getTimeslot() {
    return timeslot;
  }


  public void setTimeslot(TimeslotV1 timeslot) {
    
    
    
    this.timeslot = timeslot;
  }


  public DeliveryDetailsV1 pickupLocation(PickupLocationV1 pickupLocation) {
    
    
    
    
    this.pickupLocation = pickupLocation;
    return this;
  }

   /**
   * Get pickupLocation
   * @return pickupLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickupLocationV1 getPickupLocation() {
    return pickupLocation;
  }


  public void setPickupLocation(PickupLocationV1 pickupLocation) {
    
    
    
    this.pickupLocation = pickupLocation;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DeliveryDetailsV1 instance itself
   */
  public DeliveryDetailsV1 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetailsV1 deliveryDetailsV1 = (DeliveryDetailsV1) o;
    return Objects.equals(this.carrier, deliveryDetailsV1.carrier) &&
        Objects.equals(this.product, deliveryDetailsV1.product) &&
        Objects.equals(this.timeslot, deliveryDetailsV1.timeslot) &&
        Objects.equals(this.pickupLocation, deliveryDetailsV1.pickupLocation)&&
        Objects.equals(this.additionalProperties, deliveryDetailsV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, product, timeslot, pickupLocation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetailsV1 {\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    timeslot: ").append(toIndentedString(timeslot)).append("\n");
    sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("carrier");
    openapiFields.add("product");
    openapiFields.add("timeslot");
    openapiFields.add("pickup_location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryDetailsV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeliveryDetailsV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryDetailsV1 is not found in the empty JSON string", DeliveryDetailsV1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("carrier") != null && !jsonObj.get("carrier").isJsonNull()) && !jsonObj.get("carrier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrier").toString()));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        ProductV1.validateJsonObject(jsonObj.getAsJsonObject("product"));
      }
      // validate the optional field `timeslot`
      if (jsonObj.get("timeslot") != null && !jsonObj.get("timeslot").isJsonNull()) {
        TimeslotV1.validateJsonObject(jsonObj.getAsJsonObject("timeslot"));
      }
      // validate the optional field `pickup_location`
      if (jsonObj.get("pickup_location") != null && !jsonObj.get("pickup_location").isJsonNull()) {
        PickupLocationV1.validateJsonObject(jsonObj.getAsJsonObject("pickup_location"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryDetailsV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryDetailsV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryDetailsV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryDetailsV1.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryDetailsV1>() {
           @Override
           public void write(JsonWriter out, DeliveryDetailsV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryDetailsV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DeliveryDetailsV1 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryDetailsV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryDetailsV1
  * @throws IOException if the JSON string is invalid with respect to DeliveryDetailsV1
  */
  public static DeliveryDetailsV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryDetailsV1.class);
  }

 /**
  * Convert an instance of DeliveryDetailsV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

