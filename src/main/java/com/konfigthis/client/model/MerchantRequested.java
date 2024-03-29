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
import com.konfigthis.client.model.MerchantRequestedCheckbox;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * MerchantRequested
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantRequested {
  public static final String SERIALIZED_NAME_ADDITIONAL_CHECKBOX = "additional_checkbox";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CHECKBOX)
  private Boolean additionalCheckbox;

  public static final String SERIALIZED_NAME_ADDITIONAL_CHECKBOXES = "additional_checkboxes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_CHECKBOXES)
  private List<MerchantRequestedCheckbox> additionalCheckboxes = null;

  public MerchantRequested() {
  }

  
  public MerchantRequested(
     Boolean additionalCheckbox, 
     List<MerchantRequestedCheckbox> additionalCheckboxes
  ) {
    this();
    this.additionalCheckbox = additionalCheckbox;
    this.additionalCheckboxes = additionalCheckboxes;
  }

   /**
   * Informs whether the additional_checkbox is checked or not, when applicable.
   * @return additionalCheckbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informs whether the additional_checkbox is checked or not, when applicable.")

  public Boolean getAdditionalCheckbox() {
    return additionalCheckbox;
  }




   /**
   * Informs whether the additional_checkboxes is checked or not, when applicable.
   * @return additionalCheckboxes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Informs whether the additional_checkboxes is checked or not, when applicable.")

  public List<MerchantRequestedCheckbox> getAdditionalCheckboxes() {
    return additionalCheckboxes;
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
   * @return the MerchantRequested instance itself
   */
  public MerchantRequested putAdditionalProperty(String key, Object value) {
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
    MerchantRequested merchantRequested = (MerchantRequested) o;
    return Objects.equals(this.additionalCheckbox, merchantRequested.additionalCheckbox) &&
        Objects.equals(this.additionalCheckboxes, merchantRequested.additionalCheckboxes)&&
        Objects.equals(this.additionalProperties, merchantRequested.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCheckbox, additionalCheckboxes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRequested {\n");
    sb.append("    additionalCheckbox: ").append(toIndentedString(additionalCheckbox)).append("\n");
    sb.append("    additionalCheckboxes: ").append(toIndentedString(additionalCheckboxes)).append("\n");
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
    openapiFields.add("additional_checkbox");
    openapiFields.add("additional_checkboxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantRequested
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantRequested.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantRequested is not found in the empty JSON string", MerchantRequested.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("additional_checkboxes") != null && !jsonObj.get("additional_checkboxes").isJsonNull()) {
        JsonArray jsonArrayadditionalCheckboxes = jsonObj.getAsJsonArray("additional_checkboxes");
        if (jsonArrayadditionalCheckboxes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additional_checkboxes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additional_checkboxes` to be an array in the JSON string but got `%s`", jsonObj.get("additional_checkboxes").toString()));
          }

          // validate the optional field `additional_checkboxes` (array)
          for (int i = 0; i < jsonArrayadditionalCheckboxes.size(); i++) {
            MerchantRequestedCheckbox.validateJsonObject(jsonArrayadditionalCheckboxes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantRequested.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantRequested' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantRequested> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantRequested.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantRequested>() {
           @Override
           public void write(JsonWriter out, MerchantRequested value) throws IOException {
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
           public MerchantRequested read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantRequested instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantRequested given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantRequested
  * @throws IOException if the JSON string is invalid with respect to MerchantRequested
  */
  public static MerchantRequested fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantRequested.class);
  }

 /**
  * Convert an instance of MerchantRequested to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

