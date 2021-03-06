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
import com.squareup.connect.models.Money;
import com.squareup.connect.models.OrderLineItemAppliedTax;
import com.squareup.connect.models.OrderLineItemTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a service charge applied to an order.
 */
@ApiModel(description = "Represents a service charge applied to an order.")

public class OrderServiceCharge {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  @JsonProperty("total_money")
  private Money totalMoney = null;

  @JsonProperty("total_tax_money")
  private Money totalTaxMoney = null;

  @JsonProperty("calculation_phase")
  private String calculationPhase = null;

  @JsonProperty("taxable")
  private Boolean taxable = null;

  @JsonProperty("taxes")
  private List<OrderLineItemTax> taxes = new ArrayList<OrderLineItemTax>();

  @JsonProperty("applied_taxes")
  private List<OrderLineItemAppliedTax> appliedTaxes = new ArrayList<OrderLineItemAppliedTax>();

  @JsonProperty("metadata")
  private Map<String, String> metadata = new HashMap<String, String>();

  public OrderServiceCharge uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the service charge only within this order.
   * Note: This model is in beta.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the service charge only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderServiceCharge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the service charge.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the service charge.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderServiceCharge catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object ID referencing the service charge `CatalogObject`.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object ID referencing the service charge `CatalogObject`.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderServiceCharge percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The service charge percentage as a string representation of a decimal number. For example, `\"7.25\"` indicates a service charge of 7.25%.  Exactly 1 of `percentage` or `amount_money` should be set.
   * @return percentage
  **/
  @ApiModelProperty(value = "The service charge percentage as a string representation of a decimal number. For example, `\"7.25\"` indicates a service charge of 7.25%.  Exactly 1 of `percentage` or `amount_money` should be set.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderServiceCharge amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of a non-percentage based service charge.  Exactly one of `percentage` or `amount_money` should be set.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The amount of a non-percentage based service charge.  Exactly one of `percentage` or `amount_money` should be set.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public OrderServiceCharge appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of money applied to the order by the service charge, including any inclusive tax amounts, as calculated by Square.  - For fixed-amount service charges, `applied_money` is equal to `amount_money`. - For percentage-based service charges, `applied_money` is the money calculated using the percentage.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of money applied to the order by the service charge, including any inclusive tax amounts, as calculated by Square.  - For fixed-amount service charges, `applied_money` is equal to `amount_money`. - For percentage-based service charges, `applied_money` is the money calculated using the percentage.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderServiceCharge totalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total amount of money to collect for the service charge.  __Note__: if an inclusive tax is applied to the service charge, `total_money` __does not__ equal `applied_money` plus `total_tax_money` since the inclusive tax amount will already be included in both `applied_money` and `total_tax_money`.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total amount of money to collect for the service charge.  __Note__: if an inclusive tax is applied to the service charge, `total_money` __does not__ equal `applied_money` plus `total_tax_money` since the inclusive tax amount will already be included in both `applied_money` and `total_tax_money`.")
  public Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
  }

  public OrderServiceCharge totalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
    return this;
  }

   /**
   * The total amount of tax money to collect for the service charge.
   * @return totalTaxMoney
  **/
  @ApiModelProperty(value = "The total amount of tax money to collect for the service charge.")
  public Money getTotalTaxMoney() {
    return totalTaxMoney;
  }

  public void setTotalTaxMoney(Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
  }

  public OrderServiceCharge calculationPhase(String calculationPhase) {
    this.calculationPhase = calculationPhase;
    return this;
  }

   /**
   * The calculation phase at which to apply the service charge. See [OrderServiceChargeCalculationPhase](#type-orderservicechargecalculationphase) for possible values
   * @return calculationPhase
  **/
  @ApiModelProperty(value = "The calculation phase at which to apply the service charge. See [OrderServiceChargeCalculationPhase](#type-orderservicechargecalculationphase) for possible values")
  public String getCalculationPhase() {
    return calculationPhase;
  }

  public void setCalculationPhase(String calculationPhase) {
    this.calculationPhase = calculationPhase;
  }

  public OrderServiceCharge taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Indicates whether the service charge can be taxed. If set to `true`, order-level taxes automatically apply to the service charge. Note that service charges calculated in the `TOTAL_PHASE` cannot be marked as taxable.
   * @return taxable
  **/
  @ApiModelProperty(value = "Indicates whether the service charge can be taxed. If set to `true`, order-level taxes automatically apply to the service charge. Note that service charges calculated in the `TOTAL_PHASE` cannot be marked as taxable.")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public OrderServiceCharge taxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public OrderServiceCharge addTaxesItem(OrderLineItemTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * A list of taxes applied to this service charge. On read or retrieve, this list includes both item-level taxes and any order-level taxes apportioned to this service charge. When creating an Order, set your service charge-level taxes in this list. By default, order-level taxes apply to service charges calculated in the `SUBTOTAL_PHASE` if `taxable` is set to `true`.  This field has been deprecated in favour of `applied_taxes`. Usage of both this field and `applied_taxes` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.
   * @return taxes
  **/
  @ApiModelProperty(value = "A list of taxes applied to this service charge. On read or retrieve, this list includes both item-level taxes and any order-level taxes apportioned to this service charge. When creating an Order, set your service charge-level taxes in this list. By default, order-level taxes apply to service charges calculated in the `SUBTOTAL_PHASE` if `taxable` is set to `true`.  This field has been deprecated in favour of `applied_taxes`. Usage of both this field and `applied_taxes` when creating an order will result in an error. Usage of this field when sending requests to the UpdateOrder endpoint will result in an error.")

  @Deprecated
  public List<OrderLineItemTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<OrderLineItemTax> taxes) {
    this.taxes = taxes;
  }

  public OrderServiceCharge appliedTaxes(List<OrderLineItemAppliedTax> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
    return this;
  }

  public OrderServiceCharge addAppliedTaxesItem(OrderLineItemAppliedTax appliedTaxesItem) {
    this.appliedTaxes.add(appliedTaxesItem);
    return this;
  }

   /**
   * The list of references to taxes applied to this service charge. Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderLineItemTax` that is being applied to this service charge. On reads, the amount applied is populated.  An `OrderLineItemAppliedTax` will be automatically created on every taxable service charge for all `ORDER` scoped taxes that are added to the order. `OrderLineItemAppliedTax` records for `LINE_ITEM` scoped taxes must be added in requests for the tax to apply to any taxable service charge.  Taxable service charges have the `taxable` field set to true and calculated in the `SUBTOTAL_PHASE`.  To change the amount of a tax, modify the referenced top-level tax.
   * Note: This model is in beta.
   * @return appliedTaxes
  **/
  @ApiModelProperty(value = "The list of references to taxes applied to this service charge. Each `OrderLineItemAppliedTax` has a `tax_uid` that references the `uid` of a top-level `OrderLineItemTax` that is being applied to this service charge. On reads, the amount applied is populated.  An `OrderLineItemAppliedTax` will be automatically created on every taxable service charge for all `ORDER` scoped taxes that are added to the order. `OrderLineItemAppliedTax` records for `LINE_ITEM` scoped taxes must be added in requests for the tax to apply to any taxable service charge.  Taxable service charges have the `taxable` field set to true and calculated in the `SUBTOTAL_PHASE`.  To change the amount of a tax, modify the referenced top-level tax.")
  public List<OrderLineItemAppliedTax> getAppliedTaxes() {
    return appliedTaxes;
  }

  public void setAppliedTaxes(List<OrderLineItemAppliedTax> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }

  public OrderServiceCharge metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OrderServiceCharge putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Application-defined data attached to this service charge. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.
   * Note: This model is in beta.
   * @return metadata
  **/
  @ApiModelProperty(value = "Application-defined data attached to this service charge. Metadata fields are intended to store descriptive references or associations with an entity in another system or store brief information about the object. Square does not process this field; it only stores and returns it in relevant API calls. Do not use metadata to store any sensitive information (personally identifiable information, card details, etc.).  Keys written by applications must be 60 characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include metadata generated by Square. These keys are prefixed with a namespace, separated from the key with a ':' character.  Values have a max length of 255 characters.  An application may have up to 10 entries per metadata field.  Entries written by applications are private and can only be read or modified by the same application.  See [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderServiceCharge orderServiceCharge = (OrderServiceCharge) o;
    return Objects.equals(this.uid, orderServiceCharge.uid) &&
        Objects.equals(this.name, orderServiceCharge.name) &&
        Objects.equals(this.catalogObjectId, orderServiceCharge.catalogObjectId) &&
        Objects.equals(this.percentage, orderServiceCharge.percentage) &&
        Objects.equals(this.amountMoney, orderServiceCharge.amountMoney) &&
        Objects.equals(this.appliedMoney, orderServiceCharge.appliedMoney) &&
        Objects.equals(this.totalMoney, orderServiceCharge.totalMoney) &&
        Objects.equals(this.totalTaxMoney, orderServiceCharge.totalTaxMoney) &&
        Objects.equals(this.calculationPhase, orderServiceCharge.calculationPhase) &&
        Objects.equals(this.taxable, orderServiceCharge.taxable) &&
        Objects.equals(this.taxes, orderServiceCharge.taxes) &&
        Objects.equals(this.appliedTaxes, orderServiceCharge.appliedTaxes) &&
        Objects.equals(this.metadata, orderServiceCharge.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, catalogObjectId, percentage, amountMoney, appliedMoney, totalMoney, totalTaxMoney, calculationPhase, taxable, taxes, appliedTaxes, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderServiceCharge {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    totalTaxMoney: ").append(toIndentedString(totalTaxMoney)).append("\n");
    sb.append("    calculationPhase: ").append(toIndentedString(calculationPhase)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    appliedTaxes: ").append(toIndentedString(appliedTaxes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

