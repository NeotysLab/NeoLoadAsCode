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
 * ElementIdDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class ElementIdDefinition {
  @SerializedName("id")
  private String id = null;

  /**
   * Comma-separated list of statistics to get.  Available statistics are: - AVG_DURATION (ms) - MIN_DURATION (ms) - MAX_DURATION (ms) - COUNT - THROUGHPUT (Byte/s) - ELEMENTS_PER_SECOND - ERRORS - ERRORS_PER_SECOND - ERROR_RATE (%) - AVG_TTFB (ms) - MIN_TTFB (ms) - MAX_TTFB (ms) - PERCENTILES_DURATION (ms)  Warning: PERCENTILES_DURATION cannot be mixed with other statistics. 
   */
  @JsonAdapter(StatisticsEnum.Adapter.class)
  public enum StatisticsEnum {
    AVG_DURATION("AVG_DURATION"),
    MIN_DURATION("MIN_DURATION"),
    MAX_DURATION("MAX_DURATION"),
    COUNT("COUNT"),
    THROUGHPUT("THROUGHPUT"),
    ELEMENTS_PER_SECOND("ELEMENTS_PER_SECOND"),
    ERRORS("ERRORS"),
    ERRORS_PER_SECOND("ERRORS_PER_SECOND"),
    ERROR_RATE("ERROR_RATE"),
    AVG_TTFB("AVG_TTFB"),
    MIN_TTFB("MIN_TTFB"),
    MAX_TTFB("MAX_TTFB"),
    PERCENTILES_DURATION("PERCENTILES_DURATION");

    private String value;

    StatisticsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatisticsEnum fromValue(String text) {
      for (StatisticsEnum b : StatisticsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatisticsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatisticsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatisticsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatisticsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("statistics")
  private List<StatisticsEnum> statistics = null;

  public ElementIdDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the element. Can be a specific element identifier or one of the following keywords: - all-requests - all-pages - all-transactions
   * @return id
  **/
  @Schema(example = "a6f2f595-7b62-4dc4-9368-a1cf670cd924", description = "The id of the element. Can be a specific element identifier or one of the following keywords: - all-requests - all-pages - all-transactions")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ElementIdDefinition statistics(List<StatisticsEnum> statistics) {
    this.statistics = statistics;
    return this;
  }

  public ElementIdDefinition addStatisticsItem(StatisticsEnum statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<StatisticsEnum>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(description = "")
  public List<StatisticsEnum> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticsEnum> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementIdDefinition elementIdDefinition = (ElementIdDefinition) o;
    return Objects.equals(this.id, elementIdDefinition.id) &&
        Objects.equals(this.statistics, elementIdDefinition.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementIdDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
