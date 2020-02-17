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


package com.mastercard.developer.mastercard_loyalty_connect_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.DetailItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ErrorItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-16T15:13:26.840+05:30[Asia/Calcutta]")
public class ErrorItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<DetailItem> details = null;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_RECOVERABLE = "Recoverable";
  @SerializedName(SERIALIZED_NAME_RECOVERABLE)
  private Boolean recoverable;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public ErrorItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the error
   * @return description
  **/
  @ApiModelProperty(example = "Invalid request", value = "Description of the error")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorItem details(List<DetailItem> details) {
    this.details = details;
    return this;
  }

  public ErrorItem addDetailsItem(DetailItem detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<DetailItem>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<DetailItem> getDetails() {
    return details;
  }

  public void setDetails(List<DetailItem> details) {
    this.details = details;
  }

  public ErrorItem reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason code indicating type of the error
   * @return reasonCode
  **/
  @ApiModelProperty(example = "BAD_REQUEST", value = "Reason code indicating type of the error")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ErrorItem recoverable(Boolean recoverable) {
    this.recoverable = recoverable;
    return this;
  }

   /**
   * Indicates if the error is recoverable when the same payload is submitted again
   * @return recoverable
  **/
  @ApiModelProperty(example = "false", value = "Indicates if the error is recoverable when the same payload is submitted again")
  public Boolean getRecoverable() {
    return recoverable;
  }

  public void setRecoverable(Boolean recoverable) {
    this.recoverable = recoverable;
  }

  public ErrorItem source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source of the error
   * @return source
  **/
  @ApiModelProperty(example = "Input parameters", value = "Source of the error")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItem errorItem = (ErrorItem) o;
    return Objects.equals(this.description, errorItem.description) &&
        Objects.equals(this.details, errorItem.details) &&
        Objects.equals(this.reasonCode, errorItem.reasonCode) &&
        Objects.equals(this.recoverable, errorItem.recoverable) &&
        Objects.equals(this.source, errorItem.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, details, reasonCode, recoverable, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

}
