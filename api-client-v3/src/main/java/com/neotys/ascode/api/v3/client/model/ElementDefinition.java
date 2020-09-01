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
 * ElementDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class ElementDefinition {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private List<String> path = null;

  @SerializedName("type")
  private String type = null;

  public ElementDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the element.
   * @return id
  **/
  @Schema(example = "a6f2f595-7b62-4dc4-9368-a1cf670cd924", description = "Unique identifier of the element.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ElementDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the element.
   * @return name
  **/
  @Schema(example = "/home/login", description = "Name of the element.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElementDefinition path(List<String> path) {
    this.path = path;
    return this;
  }

  public ElementDefinition addPathItem(String pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<String>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * Full path of the element including the element itself.
   * @return path
  **/
  @Schema(example = "[\"UserPath\",\"Actions\",\"Transaction login\",\"Login page\",\"/home/login\"]", description = "Full path of the element including the element itself.")
  public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
  }

  public ElementDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the element.
   * @return type
  **/
  @Schema(description = "Type of the element.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementDefinition elementDefinition = (ElementDefinition) o;
    return Objects.equals(this.id, elementDefinition.id) &&
        Objects.equals(this.name, elementDefinition.name) &&
        Objects.equals(this.path, elementDefinition.path) &&
        Objects.equals(this.type, elementDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, path, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
