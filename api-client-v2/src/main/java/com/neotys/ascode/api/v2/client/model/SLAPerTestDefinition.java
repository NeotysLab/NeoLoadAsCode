/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.api.v2.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * SLAPerTestDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-04-02T07:51:59.064Z[GMT]")
public class SLAPerTestDefinition {
  @SerializedName("kpi")
  private SLAKPIDefinition kpi = null;

  @SerializedName("status")
  private SLAStatusDefinition status = null;

  @SerializedName("value")
  private Float value = null;

  @SerializedName("warningThreshold")
  private ThresholdDefinition warningThreshold = null;

  @SerializedName("failedThreshold")
  private ThresholdDefinition failedThreshold = null;

  @SerializedName("element")
  private SLAElementDefinition element = null;

  public SLAPerTestDefinition kpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
    return this;
  }

   /**
   * Get kpi
   * @return kpi
  **/
  @Schema(description = "")
  public SLAKPIDefinition getKpi() {
    return kpi;
  }

  public void setKpi(SLAKPIDefinition kpi) {
    this.kpi = kpi;
  }

  public SLAPerTestDefinition status(SLAStatusDefinition status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public SLAStatusDefinition getStatus() {
    return status;
  }

  public void setStatus(SLAStatusDefinition status) {
    this.status = status;
  }

  public SLAPerTestDefinition value(Float value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public SLAPerTestDefinition warningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
    return this;
  }

   /**
   * Get warningThreshold
   * @return warningThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getWarningThreshold() {
    return warningThreshold;
  }

  public void setWarningThreshold(ThresholdDefinition warningThreshold) {
    this.warningThreshold = warningThreshold;
  }

  public SLAPerTestDefinition failedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
    return this;
  }

   /**
   * Get failedThreshold
   * @return failedThreshold
  **/
  @Schema(description = "")
  public ThresholdDefinition getFailedThreshold() {
    return failedThreshold;
  }

  public void setFailedThreshold(ThresholdDefinition failedThreshold) {
    this.failedThreshold = failedThreshold;
  }

  public SLAPerTestDefinition element(SLAElementDefinition element) {
    this.element = element;
    return this;
  }

   /**
   * Get element
   * @return element
  **/
  @Schema(description = "")
  public SLAElementDefinition getElement() {
    return element;
  }

  public void setElement(SLAElementDefinition element) {
    this.element = element;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLAPerTestDefinition slAPerTestDefinition = (SLAPerTestDefinition) o;
    return Objects.equals(this.kpi, slAPerTestDefinition.kpi) &&
        Objects.equals(this.status, slAPerTestDefinition.status) &&
        Objects.equals(this.value, slAPerTestDefinition.value) &&
        Objects.equals(this.warningThreshold, slAPerTestDefinition.warningThreshold) &&
        Objects.equals(this.failedThreshold, slAPerTestDefinition.failedThreshold) &&
        Objects.equals(this.element, slAPerTestDefinition.element);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kpi, status, value, warningThreshold, failedThreshold, element);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAPerTestDefinition {\n");
    
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    warningThreshold: ").append(toIndentedString(warningThreshold)).append("\n");
    sb.append("    failedThreshold: ").append(toIndentedString(failedThreshold)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
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
