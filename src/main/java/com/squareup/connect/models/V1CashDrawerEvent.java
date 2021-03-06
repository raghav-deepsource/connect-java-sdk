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
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1CashDrawerEvent
 */
@ApiModel(description = "V1CashDrawerEvent")

public class V1CashDrawerEvent {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("event_type")
  private String eventType = null;

  @JsonProperty("event_money")
  private V1Money eventMoney = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("description")
  private String description = null;

  public V1CashDrawerEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The event's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The event's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1CashDrawerEvent employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee that created the event.
   * @return employeeId
  **/
  @ApiModelProperty(value = "The ID of the employee that created the event.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public V1CashDrawerEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event that occurred. See [V1CashDrawerEventEventType](#type-v1cashdrawereventeventtype) for possible values
   * @return eventType
  **/
  @ApiModelProperty(value = "The type of event that occurred. See [V1CashDrawerEventEventType](#type-v1cashdrawereventeventtype) for possible values")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public V1CashDrawerEvent eventMoney(V1Money eventMoney) {
    this.eventMoney = eventMoney;
    return this;
  }

   /**
   * The amount of money that was added to or removed from the cash drawer because of the event. This value can be positive (for added money) or negative (for removed money).
   * @return eventMoney
  **/
  @ApiModelProperty(value = "The amount of money that was added to or removed from the cash drawer because of the event. This value can be positive (for added money) or negative (for removed money).")
  public V1Money getEventMoney() {
    return eventMoney;
  }

  public void setEventMoney(V1Money eventMoney) {
    this.eventMoney = eventMoney;
  }

  public V1CashDrawerEvent createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the event occurred, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the event occurred, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1CashDrawerEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An optional description of the event, entered by the employee that created it.
   * @return description
  **/
  @ApiModelProperty(value = "An optional description of the event, entered by the employee that created it.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CashDrawerEvent v1CashDrawerEvent = (V1CashDrawerEvent) o;
    return Objects.equals(this.id, v1CashDrawerEvent.id) &&
        Objects.equals(this.employeeId, v1CashDrawerEvent.employeeId) &&
        Objects.equals(this.eventType, v1CashDrawerEvent.eventType) &&
        Objects.equals(this.eventMoney, v1CashDrawerEvent.eventMoney) &&
        Objects.equals(this.createdAt, v1CashDrawerEvent.createdAt) &&
        Objects.equals(this.description, v1CashDrawerEvent.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, eventType, eventMoney, createdAt, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CashDrawerEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventMoney: ").append(toIndentedString(eventMoney)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

