/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Error;
import com.squareup.connect.models.WorkweekConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The response to a request for a set of &#x60;WorkweekConfig&#x60; objects. Contains the requested &#x60;WorkweekConfig&#x60; objects. May contain a set of &#x60;Error&#x60; objects if the request resulted in errors.
 */
@ApiModel(description = "The response to a request for a set of `WorkweekConfig` objects. Contains the requested `WorkweekConfig` objects. May contain a set of `Error` objects if the request resulted in errors.")

public class ListWorkweekConfigsResponse {
  @JsonProperty("workweek_configs")
  private List<WorkweekConfig> workweekConfigs = new ArrayList<WorkweekConfig>();

  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public ListWorkweekConfigsResponse workweekConfigs(List<WorkweekConfig> workweekConfigs) {
    this.workweekConfigs = workweekConfigs;
    return this;
  }

  public ListWorkweekConfigsResponse addWorkweekConfigsItem(WorkweekConfig workweekConfigsItem) {
    this.workweekConfigs.add(workweekConfigsItem);
    return this;
  }

   /**
   * A page of Employee Wage results.
   * @return workweekConfigs
  **/
  @ApiModelProperty(value = "A page of Employee Wage results.")
  public List<WorkweekConfig> getWorkweekConfigs() {
    return workweekConfigs;
  }

  public void setWorkweekConfigs(List<WorkweekConfig> workweekConfigs) {
    this.workweekConfigs = workweekConfigs;
  }

  public ListWorkweekConfigsResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Value supplied in the subsequent request to fetch the next page of Employee Wage results.
   * @return cursor
  **/
  @ApiModelProperty(value = "Value supplied in the subsequent request to fetch the next page of Employee Wage results.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ListWorkweekConfigsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ListWorkweekConfigsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWorkweekConfigsResponse listWorkweekConfigsResponse = (ListWorkweekConfigsResponse) o;
    return Objects.equals(this.workweekConfigs, listWorkweekConfigsResponse.workweekConfigs) &&
        Objects.equals(this.cursor, listWorkweekConfigsResponse.cursor) &&
        Objects.equals(this.errors, listWorkweekConfigsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workweekConfigs, cursor, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWorkweekConfigsResponse {\n");
    
    sb.append("    workweekConfigs: ").append(toIndentedString(workweekConfigs)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

