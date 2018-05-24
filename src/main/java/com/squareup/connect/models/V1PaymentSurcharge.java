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
import com.squareup.connect.models.V1PaymentTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * V1PaymentSurcharge
 */

public class V1PaymentSurcharge {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("applied_money")
  private V1Money appliedMoney = null;

  @JsonProperty("rate")
  private String rate = null;

  @JsonProperty("amount_money")
  private V1Money amountMoney = null;

  /**
   * Indicates the source of the surcharge. For example, if it was applied as an automatic gratuity for a large group.
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    AUTO_GRATUITY("AUTO_GRATUITY"),
    
    CUSTOM("CUSTOM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("taxable")
  private Boolean taxable = null;

  @JsonProperty("taxes")
  private List<V1PaymentTax> taxes = new ArrayList<V1PaymentTax>();

  @JsonProperty("surcharge_id")
  private String surchargeId = null;

  public V1PaymentSurcharge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the surcharge.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the surcharge.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PaymentSurcharge appliedMoney(V1Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of money applied to the order as a result of the surcharge.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of money applied to the order as a result of the surcharge.")
  public V1Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(V1Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public V1PaymentSurcharge rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The amount of the surcharge as a percentage. The percentage is provided as a string representing the decimal equivalent of the percentage. For example, \"0.7\" corresponds to a 7% surcharge. Exactly one of rate or amount_money should be set.
   * @return rate
  **/
  @ApiModelProperty(value = "The amount of the surcharge as a percentage. The percentage is provided as a string representing the decimal equivalent of the percentage. For example, \"0.7\" corresponds to a 7% surcharge. Exactly one of rate or amount_money should be set.")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public V1PaymentSurcharge amountMoney(V1Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of the surcharge as a Money object. Exactly one of rate or amount_money should be set.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The amount of the surcharge as a Money object. Exactly one of rate or amount_money should be set.")
  public V1Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(V1Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public V1PaymentSurcharge type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the source of the surcharge. For example, if it was applied as an automatic gratuity for a large group.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the source of the surcharge. For example, if it was applied as an automatic gratuity for a large group.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1PaymentSurcharge taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Indicates whether the surcharge is taxable.
   * @return taxable
  **/
  @ApiModelProperty(value = "Indicates whether the surcharge is taxable.")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public V1PaymentSurcharge taxes(List<V1PaymentTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public V1PaymentSurcharge addTaxesItem(V1PaymentTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * The list of taxes that should be applied to the surcharge.
   * @return taxes
  **/
  @ApiModelProperty(value = "The list of taxes that should be applied to the surcharge.")
  public List<V1PaymentTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<V1PaymentTax> taxes) {
    this.taxes = taxes;
  }

  public V1PaymentSurcharge surchargeId(String surchargeId) {
    this.surchargeId = surchargeId;
    return this;
  }

   /**
   * Get surchargeId
   * @return surchargeId
  **/
  @ApiModelProperty(value = "")
  public String getSurchargeId() {
    return surchargeId;
  }

  public void setSurchargeId(String surchargeId) {
    this.surchargeId = surchargeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PaymentSurcharge v1PaymentSurcharge = (V1PaymentSurcharge) o;
    return Objects.equals(this.name, v1PaymentSurcharge.name) &&
        Objects.equals(this.appliedMoney, v1PaymentSurcharge.appliedMoney) &&
        Objects.equals(this.rate, v1PaymentSurcharge.rate) &&
        Objects.equals(this.amountMoney, v1PaymentSurcharge.amountMoney) &&
        Objects.equals(this.type, v1PaymentSurcharge.type) &&
        Objects.equals(this.taxable, v1PaymentSurcharge.taxable) &&
        Objects.equals(this.taxes, v1PaymentSurcharge.taxes) &&
        Objects.equals(this.surchargeId, v1PaymentSurcharge.surchargeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appliedMoney, rate, amountMoney, type, taxable, taxes, surchargeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PaymentSurcharge {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    surchargeId: ").append(toIndentedString(surchargeId)).append("\n");
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
