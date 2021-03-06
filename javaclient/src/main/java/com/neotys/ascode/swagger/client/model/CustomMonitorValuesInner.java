/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.neotys.ascode.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CustomMonitorValuesInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-09-05T15:48:08.071+02:00[Europe/Paris]")
public class CustomMonitorValuesInner {

  @SerializedName("timestamp")
  private Long timestamp = null;
  
  @SerializedName("value")
  private Float value = null;
  
  public CustomMonitorValuesInner timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  /**
  * Timestamp in seconds for the value.
  * @return timestamp
  **/
  
  
  @Schema(description = "Timestamp in seconds for the value.")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }
  
  public CustomMonitorValuesInner value(Float value) {
    this.value = value;
    return this;
  }

  
  /**
  * Number for the value.
  * @return value
  **/
  
  
  @Schema(description = "Number for the value.")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomMonitorValuesInner customMonitorValuesInner = (CustomMonitorValuesInner) o;
    return Objects.equals(this.timestamp, customMonitorValuesInner.timestamp) &&
        Objects.equals(this.value, customMonitorValuesInner.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(timestamp, value);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomMonitorValuesInner {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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



