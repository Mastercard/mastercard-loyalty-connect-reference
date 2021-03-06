/*
 * Mastercard Loyalty Connect Service
 * Connecting payment and retail loyalty into a single checkout experience
 *
 * The version of the OpenAPI document: 2.2.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_connect_client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * BusinessPartnerStoreResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T19:05:09.264+05:30[Asia/Calcutta]")
public class BusinessPartnerStoreResponse {
    public static final String SERIALIZED_NAME_BUSINESS_PARTNER_STORE_ID = "businessPartnerStoreId";
    public static final String SERIALIZED_NAME_STORE_REFERENCE_ID = "storeReferenceId";
    @SerializedName(SERIALIZED_NAME_BUSINESS_PARTNER_STORE_ID)
    private String businessPartnerStoreId;
    @SerializedName(SERIALIZED_NAME_STORE_REFERENCE_ID)
    private String storeReferenceId;


    public BusinessPartnerStoreResponse businessPartnerStoreId(String businessPartnerStoreId) {

        this.businessPartnerStoreId = businessPartnerStoreId;
        return this;
    }

    /**
     * BusinessPartnerStoreDetails Identity
     *
     * @return businessPartnerStoreId
     **/
    @ApiModelProperty(example = "G3243423J4534", required = true, value = "BusinessPartnerStoreDetails Identity")

    public String getBusinessPartnerStoreId() {
        return businessPartnerStoreId;
    }


    public void setBusinessPartnerStoreId(String businessPartnerStoreId) {
        this.businessPartnerStoreId = businessPartnerStoreId;
    }


    public BusinessPartnerStoreResponse storeReferenceId(String storeReferenceId) {

        this.storeReferenceId = storeReferenceId;
        return this;
    }

    /**
     * Unique reference key for business partner location
     *
     * @return storeReferenceId
     **/
    @ApiModelProperty(example = "5f0d07c1-6fc4-4e74-9152-0e20bb767589", required = true, value = "Unique reference key for business partner location")

    public String getStoreReferenceId() {
        return storeReferenceId;
    }


    public void setStoreReferenceId(String storeReferenceId) {
        this.storeReferenceId = storeReferenceId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessPartnerStoreResponse businessPartnerStoreResponse = (BusinessPartnerStoreResponse) o;
        return Objects.equals(this.businessPartnerStoreId, businessPartnerStoreResponse.businessPartnerStoreId) &&
                Objects.equals(this.storeReferenceId, businessPartnerStoreResponse.storeReferenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessPartnerStoreId, storeReferenceId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessPartnerStoreResponse {\n");
        sb.append("    businessPartnerStoreId: ").append(toIndentedString(businessPartnerStoreId)).append("\n");
        sb.append("    storeReferenceId: ").append(toIndentedString(storeReferenceId)).append("\n");
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

