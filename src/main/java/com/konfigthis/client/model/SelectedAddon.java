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
 * SelectedAddon
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SelectedAddon {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_USER_INPUT = "user_input";
  @SerializedName(SERIALIZED_NAME_USER_INPUT)
  private String userInput;

  public SelectedAddon() {
  }

  public SelectedAddon type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public SelectedAddon price(Long price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    
    
    
    this.price = price;
  }


  public SelectedAddon externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public SelectedAddon userInput(String userInput) {
    
    
    
    
    this.userInput = userInput;
    return this;
  }

   /**
   * Get userInput
   * @return userInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserInput() {
    return userInput;
  }


  public void setUserInput(String userInput) {
    
    
    
    this.userInput = userInput;
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
   * @return the SelectedAddon instance itself
   */
  public SelectedAddon putAdditionalProperty(String key, Object value) {
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
    SelectedAddon selectedAddon = (SelectedAddon) o;
    return Objects.equals(this.type, selectedAddon.type) &&
        Objects.equals(this.price, selectedAddon.price) &&
        Objects.equals(this.externalId, selectedAddon.externalId) &&
        Objects.equals(this.userInput, selectedAddon.userInput)&&
        Objects.equals(this.additionalProperties, selectedAddon.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price, externalId, userInput, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedAddon {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    userInput: ").append(toIndentedString(userInput)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("price");
    openapiFields.add("external_id");
    openapiFields.add("user_input");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelectedAddon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SelectedAddon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelectedAddon is not found in the empty JSON string", SelectedAddon.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("user_input") != null && !jsonObj.get("user_input").isJsonNull()) && !jsonObj.get("user_input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_input").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelectedAddon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelectedAddon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelectedAddon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelectedAddon.class));

       return (TypeAdapter<T>) new TypeAdapter<SelectedAddon>() {
           @Override
           public void write(JsonWriter out, SelectedAddon value) throws IOException {
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
           public SelectedAddon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SelectedAddon instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SelectedAddon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelectedAddon
  * @throws IOException if the JSON string is invalid with respect to SelectedAddon
  */
  public static SelectedAddon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelectedAddon.class);
  }

 /**
  * Convert an instance of SelectedAddon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
