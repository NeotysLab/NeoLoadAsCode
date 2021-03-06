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
 * TestResultRasterConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-01T07:09:13.021Z[GMT]")
public class TestResultRasterConfiguration {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("title")
  private String title = null;

  /**
   * The type of the generated graph. Can be PNG, TIFF or JPEG. Default is PNG.
   */
  @JsonAdapter(RasterTypeEnum.Adapter.class)
  public enum RasterTypeEnum {
    PNG("PNG"),
    TIFF("TIFF"),
    JPEG("JPEG");

    private String value;

    RasterTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RasterTypeEnum fromValue(String text) {
      for (RasterTypeEnum b : RasterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RasterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RasterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RasterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RasterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("rasterType")
  private RasterTypeEnum rasterType = null;

  @SerializedName("xAxisLabel")
  private String xAxisLabel = null;

  @SerializedName("yAxisLabel")
  private String yAxisLabel = null;

  @SerializedName("legend")
  private Boolean legend = null;

  @SerializedName("multiYAxis")
  private Boolean multiYAxis = null;

  /**
   * The theme of the graph. Default is TRANSPARENT.
   */
  @JsonAdapter(ThemeEnum.Adapter.class)
  public enum ThemeEnum {
    DARK("DARK"),
    LIGHT("LIGHT"),
    TRANSPARENT("TRANSPARENT");

    private String value;

    ThemeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ThemeEnum fromValue(String text) {
      for (ThemeEnum b : ThemeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ThemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThemeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThemeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ThemeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("theme")
  private ThemeEnum theme = null;

  @SerializedName("elementIds")
  private List<ElementIdDefinition> elementIds = null;

  @SerializedName("counterIds")
  private List<String> counterIds = null;

  public TestResultRasterConfiguration width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the generated graph.
   * @return width
  **/
  @Schema(example = "600", description = "The width of the generated graph.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TestResultRasterConfiguration height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the generated graph.
   * @return height
  **/
  @Schema(example = "200", description = "The height of the generated graph.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TestResultRasterConfiguration title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The main title of the generated graph.
   * @return title
  **/
  @Schema(example = "My Test", description = "The main title of the generated graph.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public TestResultRasterConfiguration rasterType(RasterTypeEnum rasterType) {
    this.rasterType = rasterType;
    return this;
  }

   /**
   * The type of the generated graph. Can be PNG, TIFF or JPEG. Default is PNG.
   * @return rasterType
  **/
  @Schema(example = "PNG", description = "The type of the generated graph. Can be PNG, TIFF or JPEG. Default is PNG.")
  public RasterTypeEnum getRasterType() {
    return rasterType;
  }

  public void setRasterType(RasterTypeEnum rasterType) {
    this.rasterType = rasterType;
  }

  public TestResultRasterConfiguration xAxisLabel(String xAxisLabel) {
    this.xAxisLabel = xAxisLabel;
    return this;
  }

   /**
   * The xAxis label of the generated graph.
   * @return xAxisLabel
  **/
  @Schema(example = "X Axis", description = "The xAxis label of the generated graph.")
  public String getXAxisLabel() {
    return xAxisLabel;
  }

  public void setXAxisLabel(String xAxisLabel) {
    this.xAxisLabel = xAxisLabel;
  }

  public TestResultRasterConfiguration yAxisLabel(String yAxisLabel) {
    this.yAxisLabel = yAxisLabel;
    return this;
  }

   /**
   * The yAxis label of the generated graph.
   * @return yAxisLabel
  **/
  @Schema(example = "Y Axis", description = "The yAxis label of the generated graph.")
  public String getYAxisLabel() {
    return yAxisLabel;
  }

  public void setYAxisLabel(String yAxisLabel) {
    this.yAxisLabel = yAxisLabel;
  }

  public TestResultRasterConfiguration legend(Boolean legend) {
    this.legend = legend;
    return this;
  }

   /**
   * If true the legend is displayed. Default is true.
   * @return legend
  **/
  @Schema(example = "true", description = "If true the legend is displayed. Default is true.")
  public Boolean isLegend() {
    return legend;
  }

  public void setLegend(Boolean legend) {
    this.legend = legend;
  }

  public TestResultRasterConfiguration multiYAxis(Boolean multiYAxis) {
    this.multiYAxis = multiYAxis;
    return this;
  }

   /**
   * If true, display one axis per serie. Default is false.
   * @return multiYAxis
  **/
  @Schema(example = "true", description = "If true, display one axis per serie. Default is false.")
  public Boolean isMultiYAxis() {
    return multiYAxis;
  }

  public void setMultiYAxis(Boolean multiYAxis) {
    this.multiYAxis = multiYAxis;
  }

  public TestResultRasterConfiguration theme(ThemeEnum theme) {
    this.theme = theme;
    return this;
  }

   /**
   * The theme of the graph. Default is TRANSPARENT.
   * @return theme
  **/
  @Schema(example = "DARK", description = "The theme of the graph. Default is TRANSPARENT.")
  public ThemeEnum getTheme() {
    return theme;
  }

  public void setTheme(ThemeEnum theme) {
    this.theme = theme;
  }

  public TestResultRasterConfiguration elementIds(List<ElementIdDefinition> elementIds) {
    this.elementIds = elementIds;
    return this;
  }

  public TestResultRasterConfiguration addElementIdsItem(ElementIdDefinition elementIdsItem) {
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
  @Schema(example = "[{\"id\":\"all-requests\",\"statistics\":[\"AVG_DURATION\"]}]", description = "The list of elements.")
  public List<ElementIdDefinition> getElementIds() {
    return elementIds;
  }

  public void setElementIds(List<ElementIdDefinition> elementIds) {
    this.elementIds = elementIds;
  }

  public TestResultRasterConfiguration counterIds(List<String> counterIds) {
    this.counterIds = counterIds;
    return this;
  }

  public TestResultRasterConfiguration addCounterIdsItem(String counterIdsItem) {
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
  @Schema(example = "[\"a4bed45a-06b2-48e1-94fd-3ea979e4f360\",\"b5be82ff-3563-4812-93a5-4ea888e4e254\"]", description = "The list of counters.")
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
    TestResultRasterConfiguration testResultRasterConfiguration = (TestResultRasterConfiguration) o;
    return Objects.equals(this.width, testResultRasterConfiguration.width) &&
        Objects.equals(this.height, testResultRasterConfiguration.height) &&
        Objects.equals(this.title, testResultRasterConfiguration.title) &&
        Objects.equals(this.rasterType, testResultRasterConfiguration.rasterType) &&
        Objects.equals(this.xAxisLabel, testResultRasterConfiguration.xAxisLabel) &&
        Objects.equals(this.yAxisLabel, testResultRasterConfiguration.yAxisLabel) &&
        Objects.equals(this.legend, testResultRasterConfiguration.legend) &&
        Objects.equals(this.multiYAxis, testResultRasterConfiguration.multiYAxis) &&
        Objects.equals(this.theme, testResultRasterConfiguration.theme) &&
        Objects.equals(this.elementIds, testResultRasterConfiguration.elementIds) &&
        Objects.equals(this.counterIds, testResultRasterConfiguration.counterIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, title, rasterType, xAxisLabel, yAxisLabel, legend, multiYAxis, theme, elementIds, counterIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultRasterConfiguration {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rasterType: ").append(toIndentedString(rasterType)).append("\n");
    sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
    sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    multiYAxis: ").append(toIndentedString(multiYAxis)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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
