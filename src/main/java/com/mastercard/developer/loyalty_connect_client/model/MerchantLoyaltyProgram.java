/*
 * Mastercard Loyalty Connect Service
 * Rest Service for linking payment cards with loyalty programme
 *
 * OpenAPI spec version: 1.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_connect_client.model;

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

/**
 * MerchantLoyaltyProgram
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-12T16:02:42.822+05:30[Asia/Calcutta]")
public class MerchantLoyaltyProgram {
  public static final String SERIALIZED_NAME_LOYALTY_ID = "loyaltyId";
  @SerializedName(SERIALIZED_NAME_LOYALTY_ID)
  private String loyaltyId;

  public static final String SERIALIZED_NAME_MERCHANT_CODE = "merchantCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CODE)
  private String merchantCode;

  public MerchantLoyaltyProgram loyaltyId(String loyaltyId) {
    this.loyaltyId = loyaltyId;
    return this;
  }

   /**
   * Loyalty Id represents unique member merchant association
   * @return loyaltyId
  **/
  @ApiModelProperty(example = "vk@mastercard.com", value = "Loyalty Id represents unique member merchant association")
  public String getLoyaltyId() {
    return loyaltyId;
  }

  public void setLoyaltyId(String loyaltyId) {
    this.loyaltyId = loyaltyId;
  }

  public MerchantLoyaltyProgram merchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
    return this;
  }

   /**
   * Unique code assigned to a merchant on boarded with MLC
   * @return merchantCode
  **/
  @ApiModelProperty(example = "MLCMerchant", required = true, value = "Unique code assigned to a merchant on boarded with MLC")
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLoyaltyProgram merchantLoyaltyProgram = (MerchantLoyaltyProgram) o;
    return Objects.equals(this.loyaltyId, merchantLoyaltyProgram.loyaltyId) &&
        Objects.equals(this.merchantCode, merchantLoyaltyProgram.merchantCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyId, merchantCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLoyaltyProgram {\n");
    
    sb.append("    loyaltyId: ").append(toIndentedString(loyaltyId)).append("\n");
    sb.append("    merchantCode: ").append(toIndentedString(merchantCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

