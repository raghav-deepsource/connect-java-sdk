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
import com.squareup.connect.models.Employee;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class RetrieveEmployeeResponse {
  @JsonProperty("employee")
  private Employee employee = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public RetrieveEmployeeResponse employee(Employee employee) {
    this.employee = employee;
    return this;
  }

   /**
   * The response object.
   * @return employee
  **/
  @ApiModelProperty(value = "The response object.")
  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public RetrieveEmployeeResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveEmployeeResponse addErrorsItem(Error errorsItem) {
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
    RetrieveEmployeeResponse retrieveEmployeeResponse = (RetrieveEmployeeResponse) o;
    return Objects.equals(this.employee, retrieveEmployeeResponse.employee) &&
        Objects.equals(this.errors, retrieveEmployeeResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEmployeeResponse {\n");
    
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
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

