package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a threshold level.
 */
@ApiModel(description = "Represents a threshold level.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class ThresholdLevel   {
  @JsonProperty("congLevel")
  private Integer congLevel;

  @JsonProperty("nfLoadLevel")
  private Integer nfLoadLevel;

  @JsonProperty("nfCpuUsage")
  private Integer nfCpuUsage;

  @JsonProperty("nfMemoryUsage")
  private Integer nfMemoryUsage;

  @JsonProperty("nfStorageUsage")
  private Integer nfStorageUsage;

  public ThresholdLevel congLevel(Integer congLevel) {
    this.congLevel = congLevel;
    return this;
  }

  /**
   * Get congLevel
   * @return congLevel
  */
  @ApiModelProperty(value = "")


  public Integer getCongLevel() {
    return congLevel;
  }

  public void setCongLevel(Integer congLevel) {
    this.congLevel = congLevel;
  }

  public ThresholdLevel nfLoadLevel(Integer nfLoadLevel) {
    this.nfLoadLevel = nfLoadLevel;
    return this;
  }

  /**
   * Get nfLoadLevel
   * @return nfLoadLevel
  */
  @ApiModelProperty(value = "")


  public Integer getNfLoadLevel() {
    return nfLoadLevel;
  }

  public void setNfLoadLevel(Integer nfLoadLevel) {
    this.nfLoadLevel = nfLoadLevel;
  }

  public ThresholdLevel nfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
    return this;
  }

  /**
   * Get nfCpuUsage
   * @return nfCpuUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfCpuUsage() {
    return nfCpuUsage;
  }

  public void setNfCpuUsage(Integer nfCpuUsage) {
    this.nfCpuUsage = nfCpuUsage;
  }

  public ThresholdLevel nfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
    return this;
  }

  /**
   * Get nfMemoryUsage
   * @return nfMemoryUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfMemoryUsage() {
    return nfMemoryUsage;
  }

  public void setNfMemoryUsage(Integer nfMemoryUsage) {
    this.nfMemoryUsage = nfMemoryUsage;
  }

  public ThresholdLevel nfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
    return this;
  }

  /**
   * Get nfStorageUsage
   * @return nfStorageUsage
  */
  @ApiModelProperty(value = "")


  public Integer getNfStorageUsage() {
    return nfStorageUsage;
  }

  public void setNfStorageUsage(Integer nfStorageUsage) {
    this.nfStorageUsage = nfStorageUsage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdLevel thresholdLevel = (ThresholdLevel) o;
    return Objects.equals(this.congLevel, thresholdLevel.congLevel) &&
        Objects.equals(this.nfLoadLevel, thresholdLevel.nfLoadLevel) &&
        Objects.equals(this.nfCpuUsage, thresholdLevel.nfCpuUsage) &&
        Objects.equals(this.nfMemoryUsage, thresholdLevel.nfMemoryUsage) &&
        Objects.equals(this.nfStorageUsage, thresholdLevel.nfStorageUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(congLevel, nfLoadLevel, nfCpuUsage, nfMemoryUsage, nfStorageUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdLevel {\n");
    
    sb.append("    congLevel: ").append(toIndentedString(congLevel)).append("\n");
    sb.append("    nfLoadLevel: ").append(toIndentedString(nfLoadLevel)).append("\n");
    sb.append("    nfCpuUsage: ").append(toIndentedString(nfCpuUsage)).append("\n");
    sb.append("    nfMemoryUsage: ").append(toIndentedString(nfMemoryUsage)).append("\n");
    sb.append("    nfStorageUsage: ").append(toIndentedString(nfStorageUsage)).append("\n");
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

