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
import com.squareup.connect.models.BusinessHoursPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *  Represents the hours of operation for a business location.
 */
@ApiModel(description = " Represents the hours of operation for a business location.")

public class BusinessHours {
  @JsonProperty("periods")
  private List<BusinessHoursPeriod> periods = new ArrayList<BusinessHoursPeriod>();

  public BusinessHours periods(List<BusinessHoursPeriod> periods) {
    this.periods = periods;
    return this;
  }

  public BusinessHours addPeriodsItem(BusinessHoursPeriod periodsItem) {
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * The list of time periods during which the business is open. There may be at most 10 periods per day.
   * @return periods
  **/
  @ApiModelProperty(value = "The list of time periods during which the business is open. There may be at most 10 periods per day.")
  public List<BusinessHoursPeriod> getPeriods() {
    return periods;
  }

  public void setPeriods(List<BusinessHoursPeriod> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHours businessHours = (BusinessHours) o;
    return Objects.equals(this.periods, businessHours.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHours {\n");
    
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
