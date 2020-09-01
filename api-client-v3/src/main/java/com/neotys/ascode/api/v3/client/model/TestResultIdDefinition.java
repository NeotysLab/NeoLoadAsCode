/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.api.v3.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.neotys.ascode.api.v3.client.model.ElementIdDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The map of test result ids with their own statistics and counters definition.
 */
@Schema(description = "The map of test result ids with their own statistics and counters definition.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class TestResultIdDefinition {
  @SerializedName("elementIds")
  private List<ElementIdDefinition> elementIds = null;

  @SerializedName("counterIds")
  private List<String> counterIds = null;

  public TestResultIdDefinition elementIds(List<ElementIdDefinition> elementIds) {
    this.elementIds = elementIds;
    return this;
  }

  public TestResultIdDefinition addElementIdsItem(ElementIdDefinition elementIdsItem) {
    if (this.elementIds == null) {
      this.elementIds = new ArrayList<ElementIdDefinition>();
    }
    this.elementIds.add(elementIdsItem);
    return this;
  }

   /**
   * The list of elements.
   * @return elementIds
  **/
  @Schema(description = "The list of elements.")
  public List<ElementIdDefinition> getElementIds() {
    return elementIds;
  }

  public void setElementIds(List<ElementIdDefinition> elementIds) {
    this.elementIds = elementIds;
  }

  public TestResultIdDefinition counterIds(List<String> counterIds) {
    this.counterIds = counterIds;
    return this;
  }

  public TestResultIdDefinition addCounterIdsItem(String counterIdsItem) {
    if (this.counterIds == null) {
      this.counterIds = new ArrayList<String>();
    }
    this.counterIds.add(counterIdsItem);
    return this;
  }

   /**
   * The list of counters.
   * @return counterIds
  **/
  @Schema(description = "The list of counters.")
  public List<String> getCounterIds() {
    return counterIds;
  }

  public void setCounterIds(List<String> counterIds) {
    this.counterIds = counterIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultIdDefinition testResultIdDefinition = (TestResultIdDefinition) o;
    return Objects.equals(this.elementIds, testResultIdDefinition.elementIds) &&
        Objects.equals(this.counterIds, testResultIdDefinition.counterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementIds, counterIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultIdDefinition {\n");
    
    sb.append("    elementIds: ").append(toIndentedString(elementIds)).append("\n");
    sb.append("    counterIds: ").append(toIndentedString(counterIds)).append("\n");
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
