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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AsCodeFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class AsCodeFile {
  @SerializedName("path")
  private String path = null;

  @SerializedName("includes")
  private List<String> includes = null;

  public AsCodeFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The yaml file path
   * @return path
  **/
  @Schema(description = "The yaml file path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AsCodeFile includes(List<String> includes) {
    this.includes = includes;
    return this;
  }

  public AsCodeFile addIncludesItem(String includesItem) {
    if (this.includes == null) {
      this.includes = new ArrayList<String>();
    }
    this.includes.add(includesItem);
    return this;
  }

   /**
   * List of yaml files included
   * @return includes
  **/
  @Schema(description = "List of yaml files included")
  public List<String> getIncludes() {
    return includes;
  }

  public void setIncludes(List<String> includes) {
    this.includes = includes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsCodeFile asCodeFile = (AsCodeFile) o;
    return Objects.equals(this.path, asCodeFile.path) &&
        Objects.equals(this.includes, asCodeFile.includes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, includes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsCodeFile {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
