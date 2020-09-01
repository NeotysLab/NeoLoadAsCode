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
import com.neotys.ascode.api.v3.client.model.AsCodeFile;
import com.neotys.ascode.api.v3.client.model.ScenarioDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProjectDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class ProjectDefinition {
  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectVersion")
  private String projectVersion = null;

  @SerializedName("asCodeFiles")
  private List<AsCodeFile> asCodeFiles = null;

  @SerializedName("scenarios")
  private List<ScenarioDefinition> scenarios = null;

  public ProjectDefinition projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Id of project file.
   * @return projectId
  **/
  @Schema(example = "5e5fc0102cc4f82e5d9e18d4", description = "Id of project file.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProjectDefinition projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Neoload Project name.
   * @return projectName
  **/
  @Schema(description = "Neoload Project name.")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ProjectDefinition projectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
    return this;
  }

   /**
   * Neoload Project version.
   * @return projectVersion
  **/
  @Schema(description = "Neoload Project version.")
  public String getProjectVersion() {
    return projectVersion;
  }

  public void setProjectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
  }

  public ProjectDefinition asCodeFiles(List<AsCodeFile> asCodeFiles) {
    this.asCodeFiles = asCodeFiles;
    return this;
  }

  public ProjectDefinition addAsCodeFilesItem(AsCodeFile asCodeFilesItem) {
    if (this.asCodeFiles == null) {
      this.asCodeFiles = new ArrayList<AsCodeFile>();
    }
    this.asCodeFiles.add(asCodeFilesItem);
    return this;
  }

   /**
   * Get asCodeFiles
   * @return asCodeFiles
  **/
  @Schema(description = "")
  public List<AsCodeFile> getAsCodeFiles() {
    return asCodeFiles;
  }

  public void setAsCodeFiles(List<AsCodeFile> asCodeFiles) {
    this.asCodeFiles = asCodeFiles;
  }

  public ProjectDefinition scenarios(List<ScenarioDefinition> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  public ProjectDefinition addScenariosItem(ScenarioDefinition scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<ScenarioDefinition>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

   /**
   * Get scenarios
   * @return scenarios
  **/
  @Schema(description = "")
  public List<ScenarioDefinition> getScenarios() {
    return scenarios;
  }

  public void setScenarios(List<ScenarioDefinition> scenarios) {
    this.scenarios = scenarios;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDefinition projectDefinition = (ProjectDefinition) o;
    return Objects.equals(this.projectId, projectDefinition.projectId) &&
        Objects.equals(this.projectName, projectDefinition.projectName) &&
        Objects.equals(this.projectVersion, projectDefinition.projectVersion) &&
        Objects.equals(this.asCodeFiles, projectDefinition.asCodeFiles) &&
        Objects.equals(this.scenarios, projectDefinition.scenarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, projectVersion, asCodeFiles, scenarios);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDefinition {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersion: ").append(toIndentedString(projectVersion)).append("\n");
    sb.append("    asCodeFiles: ").append(toIndentedString(asCodeFiles)).append("\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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
