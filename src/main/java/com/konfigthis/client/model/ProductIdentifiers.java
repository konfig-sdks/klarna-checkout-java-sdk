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
 * ProductIdentifiers
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductIdentifiers {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_CATEGORY_PATH = "category_path";
  @SerializedName(SERIALIZED_NAME_CATEGORY_PATH)
  private String categoryPath;

  public static final String SERIALIZED_NAME_GLOBAL_TRADE_ITEM_NUMBER = "global_trade_item_number";
  @SerializedName(SERIALIZED_NAME_GLOBAL_TRADE_ITEM_NUMBER)
  private String globalTradeItemNumber;

  public static final String SERIALIZED_NAME_MANUFACTURER_PART_NUMBER = "manufacturer_part_number";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_PART_NUMBER)
  private String manufacturerPartNumber;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public ProductIdentifiers() {
  }

  public ProductIdentifiers brand(String brand) {
    
    
    if (brand != null && brand.length() < 0) {
      throw new IllegalArgumentException("Invalid value for brand. Length must be greater than or equal to 0.");
    }
    
    this.brand = brand;
    return this;
  }

   /**
   * The product&#39;s brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Intel", value = "The product's brand name as generally recognized by consumers. If no brand is available for a product, do not supply any value.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    
    
    if (brand != null && brand.length() < 0) {
      throw new IllegalArgumentException("Invalid value for brand. Length must be greater than or equal to 0.");
    }
    this.brand = brand;
  }


  public ProductIdentifiers color(String color) {
    
    
    if (color != null && color.length() < 0) {
      throw new IllegalArgumentException("Invalid value for color. Length must be greater than or equal to 0.");
    }
    
    this.color = color;
    return this;
  }

   /**
   * Color to be shown to the end customer (max 64 characters).
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Blue", value = "Color to be shown to the end customer (max 64 characters).")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    if (color != null && color.length() < 0) {
      throw new IllegalArgumentException("Invalid value for color. Length must be greater than or equal to 0.");
    }
    this.color = color;
  }


  public ProductIdentifiers categoryPath(String categoryPath) {
    
    
    if (categoryPath != null && categoryPath.length() < 0) {
      throw new IllegalArgumentException("Invalid value for categoryPath. Length must be greater than or equal to 0.");
    }
    
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * The product&#39;s category path as used in the merchant&#39;s webshop. Include the full and most detailed category and separate the segments with &#39; &gt; &#39;. (max 750 characters)  Example: \&quot;Electronics Store &gt; Computers &amp; Tablets &gt; Desktops\&quot;
   * @return categoryPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Electronics Store > Computers & Tablets > Desktops", value = "The product's category path as used in the merchant's webshop. Include the full and most detailed category and separate the segments with ' > '. (max 750 characters)  Example: \"Electronics Store > Computers & Tablets > Desktops\"")

  public String getCategoryPath() {
    return categoryPath;
  }


  public void setCategoryPath(String categoryPath) {
    
    
    if (categoryPath != null && categoryPath.length() < 0) {
      throw new IllegalArgumentException("Invalid value for categoryPath. Length must be greater than or equal to 0.");
    }
    this.categoryPath = categoryPath;
  }


  public ProductIdentifiers globalTradeItemNumber(String globalTradeItemNumber) {
    
    
    if (globalTradeItemNumber != null && globalTradeItemNumber.length() < 0) {
      throw new IllegalArgumentException("Invalid value for globalTradeItemNumber. Length must be greater than or equal to 0.");
    }
    
    this.globalTradeItemNumber = globalTradeItemNumber;
    return this;
  }

   /**
   * The product&#39;s Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible
   * @return globalTradeItemNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "735858293167", value = "The product's Global Trade Item Number (GTIN). Common types of GTIN are EAN, ISBN or UPC. Exclude dashes and spaces, where possible")

  public String getGlobalTradeItemNumber() {
    return globalTradeItemNumber;
  }


  public void setGlobalTradeItemNumber(String globalTradeItemNumber) {
    
    
    if (globalTradeItemNumber != null && globalTradeItemNumber.length() < 0) {
      throw new IllegalArgumentException("Invalid value for globalTradeItemNumber. Length must be greater than or equal to 0.");
    }
    this.globalTradeItemNumber = globalTradeItemNumber;
  }


  public ProductIdentifiers manufacturerPartNumber(String manufacturerPartNumber) {
    
    
    if (manufacturerPartNumber != null && manufacturerPartNumber.length() < 0) {
      throw new IllegalArgumentException("Invalid value for manufacturerPartNumber. Length must be greater than or equal to 0.");
    }
    
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

   /**
   * The product&#39;s Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible
   * @return manufacturerPartNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BOXNUC5CPYH", value = "The product's Manufacturer Part Number (MPN), which - together with the brand - uniquely identifies a product. Only submit MPNs assigned by a manufacturer and use the most specific MPN possible")

  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }


  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    
    
    if (manufacturerPartNumber != null && manufacturerPartNumber.length() < 0) {
      throw new IllegalArgumentException("Invalid value for manufacturerPartNumber. Length must be greater than or equal to 0.");
    }
    this.manufacturerPartNumber = manufacturerPartNumber;
  }


  public ProductIdentifiers size(String size) {
    
    
    if (size != null && size.length() < 0) {
      throw new IllegalArgumentException("Invalid value for size. Length must be greater than or equal to 0.");
    }
    
    this.size = size;
    return this;
  }

   /**
   * Size to be shown to the end customer (max 64 characters).
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Medium", value = "Size to be shown to the end customer (max 64 characters).")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    
    
    if (size != null && size.length() < 0) {
      throw new IllegalArgumentException("Invalid value for size. Length must be greater than or equal to 0.");
    }
    this.size = size;
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
   * @return the ProductIdentifiers instance itself
   */
  public ProductIdentifiers putAdditionalProperty(String key, Object value) {
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
    ProductIdentifiers productIdentifiers = (ProductIdentifiers) o;
    return Objects.equals(this.brand, productIdentifiers.brand) &&
        Objects.equals(this.color, productIdentifiers.color) &&
        Objects.equals(this.categoryPath, productIdentifiers.categoryPath) &&
        Objects.equals(this.globalTradeItemNumber, productIdentifiers.globalTradeItemNumber) &&
        Objects.equals(this.manufacturerPartNumber, productIdentifiers.manufacturerPartNumber) &&
        Objects.equals(this.size, productIdentifiers.size)&&
        Objects.equals(this.additionalProperties, productIdentifiers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, color, categoryPath, globalTradeItemNumber, manufacturerPartNumber, size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIdentifiers {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
    sb.append("    globalTradeItemNumber: ").append(toIndentedString(globalTradeItemNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("color");
    openapiFields.add("category_path");
    openapiFields.add("global_trade_item_number");
    openapiFields.add("manufacturer_part_number");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductIdentifiers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductIdentifiers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductIdentifiers is not found in the empty JSON string", ProductIdentifiers.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("category_path") != null && !jsonObj.get("category_path").isJsonNull()) && !jsonObj.get("category_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_path").toString()));
      }
      if ((jsonObj.get("global_trade_item_number") != null && !jsonObj.get("global_trade_item_number").isJsonNull()) && !jsonObj.get("global_trade_item_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `global_trade_item_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("global_trade_item_number").toString()));
      }
      if ((jsonObj.get("manufacturer_part_number") != null && !jsonObj.get("manufacturer_part_number").isJsonNull()) && !jsonObj.get("manufacturer_part_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer_part_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer_part_number").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductIdentifiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductIdentifiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductIdentifiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductIdentifiers.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductIdentifiers>() {
           @Override
           public void write(JsonWriter out, ProductIdentifiers value) throws IOException {
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
           public ProductIdentifiers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductIdentifiers instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductIdentifiers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductIdentifiers
  * @throws IOException if the JSON string is invalid with respect to ProductIdentifiers
  */
  public static ProductIdentifiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductIdentifiers.class);
  }

 /**
  * Convert an instance of ProductIdentifiers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

