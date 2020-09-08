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
 * Creation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T19:05:09.264+05:30[Asia/Calcutta]")
public class Creation {
    public static final String SERIALIZED_NAME_DATETIME = "datetime";
    @SerializedName(SERIALIZED_NAME_DATETIME)
    private Datetime datetime;


    public Creation datetime(Datetime datetime) {

        this.datetime = datetime;
        return this;
    }

    /**
     * Get datetime
     *
     * @return datetime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Datetime getDatetime() {
        return datetime;
    }


    public void setDatetime(Datetime datetime) {
        this.datetime = datetime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Creation creation = (Creation) o;
        return Objects.equals(this.datetime, creation.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datetime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Creation {\n");
        sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
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
