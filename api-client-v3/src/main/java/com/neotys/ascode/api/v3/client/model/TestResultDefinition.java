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
/**
 * TestResultDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class TestResultDefinition {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("author")
  private String author = null;

  /**
   * Reason that caused the test to end.
   */
  @JsonAdapter(TerminationReasonEnum.Adapter.class)
  public enum TerminationReasonEnum {
    POLICY("POLICY"),
    VARIABLE("VARIABLE"),
    MANUAL("MANUAL"),
    LG_AVAILABILITY("LG_AVAILABILITY"),
    LICENSE("LICENSE"),
    FAILED_TO_START("FAILED_TO_START"),
    UNKNOWN("UNKNOWN");

    private String value;

    TerminationReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TerminationReasonEnum fromValue(String text) {
      for (TerminationReasonEnum b : TerminationReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TerminationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TerminationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TerminationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TerminationReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("terminationReason")
  private TerminationReasonEnum terminationReason = null;

  @SerializedName("lgCount")
  private Integer lgCount = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("scenario")
  private String scenario = null;

  /**
   * Status of the test result.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INIT("INIT"),
    STARTING("STARTING"),
    RUNNING("RUNNING"),
    TERMINATED("TERMINATED"),
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  /**
   * Quality status of the test result.
   */
  @JsonAdapter(QualityStatusEnum.Adapter.class)
  public enum QualityStatusEnum {
    PASSED("PASSED"),
    FAILED("FAILED"),
    COMPUTING("COMPUTING"),
    UNKNOWN("UNKNOWN");

    private String value;

    QualityStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static QualityStatusEnum fromValue(String text) {
      for (QualityStatusEnum b : QualityStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<QualityStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualityStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualityStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QualityStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("qualityStatus")
  private QualityStatusEnum qualityStatus = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("endDate")
  private Long endDate = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("testId")
  private String testId = null;

  public TestResultDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the test result.
   * @return id
  **/
  @Schema(description = "Unique identifier of the test result.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TestResultDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the test result.
   * @return name
  **/
  @Schema(description = "Name of the test result.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestResultDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the test result.
   * @return description
  **/
  @Schema(description = "Description of the test result.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestResultDefinition author(String author) {
    this.author = author;
    return this;
  }

   /**
   * First and Last name of the person who launched the test.
   * @return author
  **/
  @Schema(description = "First and Last name of the person who launched the test.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public TestResultDefinition terminationReason(TerminationReasonEnum terminationReason) {
    this.terminationReason = terminationReason;
    return this;
  }

   /**
   * Reason that caused the test to end.
   * @return terminationReason
  **/
  @Schema(description = "Reason that caused the test to end.")
  public TerminationReasonEnum getTerminationReason() {
    return terminationReason;
  }

  public void setTerminationReason(TerminationReasonEnum terminationReason) {
    this.terminationReason = terminationReason;
  }

  public TestResultDefinition lgCount(Integer lgCount) {
    this.lgCount = lgCount;
    return this;
  }

   /**
   * Total number of Load Generators used in the test result.
   * @return lgCount
  **/
  @Schema(description = "Total number of Load Generators used in the test result.")
  public Integer getLgCount() {
    return lgCount;
  }

  public void setLgCount(Integer lgCount) {
    this.lgCount = lgCount;
  }

  public TestResultDefinition project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Name of the project.
   * @return project
  **/
  @Schema(description = "Name of the project.")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public TestResultDefinition scenario(String scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Name of the scenario.
   * @return scenario
  **/
  @Schema(description = "Name of the scenario.")
  public String getScenario() {
    return scenario;
  }

  public void setScenario(String scenario) {
    this.scenario = scenario;
  }

  public TestResultDefinition status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the test result.
   * @return status
  **/
  @Schema(description = "Status of the test result.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TestResultDefinition qualityStatus(QualityStatusEnum qualityStatus) {
    this.qualityStatus = qualityStatus;
    return this;
  }

   /**
   * Quality status of the test result.
   * @return qualityStatus
  **/
  @Schema(description = "Quality status of the test result.")
  public QualityStatusEnum getQualityStatus() {
    return qualityStatus;
  }

  public void setQualityStatus(QualityStatusEnum qualityStatus) {
    this.qualityStatus = qualityStatus;
  }

  public TestResultDefinition startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Timestamp when the test started.
   * @return startDate
  **/
  @Schema(description = "Timestamp when the test started.")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public TestResultDefinition endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Timestamp when the test ended.
   * @return endDate
  **/
  @Schema(description = "Timestamp when the test ended.")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public TestResultDefinition duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Test duration in seconds.
   * @return duration
  **/
  @Schema(description = "Test duration in seconds.")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public TestResultDefinition testId(String testId) {
    this.testId = testId;
    return this;
  }

   /**
   * Unique identifier of the test.
   * @return testId
  **/
  @Schema(example = "5ed5350f-9f2f-4e2a-9acb-cdbcee874256", description = "Unique identifier of the test.")
  public String getTestId() {
    return testId;
  }

  public void setTestId(String testId) {
    this.testId = testId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultDefinition testResultDefinition = (TestResultDefinition) o;
    return Objects.equals(this.id, testResultDefinition.id) &&
        Objects.equals(this.name, testResultDefinition.name) &&
        Objects.equals(this.description, testResultDefinition.description) &&
        Objects.equals(this.author, testResultDefinition.author) &&
        Objects.equals(this.terminationReason, testResultDefinition.terminationReason) &&
        Objects.equals(this.lgCount, testResultDefinition.lgCount) &&
        Objects.equals(this.project, testResultDefinition.project) &&
        Objects.equals(this.scenario, testResultDefinition.scenario) &&
        Objects.equals(this.status, testResultDefinition.status) &&
        Objects.equals(this.qualityStatus, testResultDefinition.qualityStatus) &&
        Objects.equals(this.startDate, testResultDefinition.startDate) &&
        Objects.equals(this.endDate, testResultDefinition.endDate) &&
        Objects.equals(this.duration, testResultDefinition.duration) &&
        Objects.equals(this.testId, testResultDefinition.testId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, author, terminationReason, lgCount, project, scenario, status, qualityStatus, startDate, endDate, duration, testId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    terminationReason: ").append(toIndentedString(terminationReason)).append("\n");
    sb.append("    lgCount: ").append(toIndentedString(lgCount)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    qualityStatus: ").append(toIndentedString(qualityStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
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
