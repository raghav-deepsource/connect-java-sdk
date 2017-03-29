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
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Error;
import com.squareup.connect.models.V1Money;
import com.squareup.connect.models.V1OrderHistoryEntry;
import com.squareup.connect.models.V1Tender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * V1Order
 */

public class V1Order {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("buyer_email")
  private String buyerEmail = null;

  @JsonProperty("recipient_name")
  private String recipientName = null;

  @JsonProperty("recipient_phone_number")
  private String recipientPhoneNumber = null;

  /**
   * Whether the tax is an ADDITIVE tax or an INCLUSIVE tax.
   */
  public enum StateEnum {
    PENDING("PENDING"),
    
    OPEN("OPEN"),
    
    COMPLETED("COMPLETED"),
    
    CANCELED("CANCELED"),
    
    REFUNDED("REFUNDED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("subtotal_money")
  private V1Money subtotalMoney = null;

  @JsonProperty("total_shipping_money")
  private V1Money totalShippingMoney = null;

  @JsonProperty("total_tax_money")
  private V1Money totalTaxMoney = null;

  @JsonProperty("total_price_money")
  private V1Money totalPriceMoney = null;

  @JsonProperty("total_discount_money")
  private V1Money totalDiscountMoney = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("payment_id")
  private String paymentId = null;

  @JsonProperty("buyer_note")
  private String buyerNote = null;

  @JsonProperty("completed_note")
  private String completedNote = null;

  @JsonProperty("refunded_note")
  private String refundedNote = null;

  @JsonProperty("canceled_note")
  private String canceledNote = null;

  @JsonProperty("tender")
  private V1Tender tender = null;

  @JsonProperty("order_history")
  private List<V1OrderHistoryEntry> orderHistory = new ArrayList<V1OrderHistoryEntry>();

  @JsonProperty("promo_code")
  private String promoCode = null;

  @JsonProperty("btc_receive_address")
  private String btcReceiveAddress = null;

  @JsonProperty("btc_price_satoshi")
  private BigDecimal btcPriceSatoshi = null;

  public V1Order errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public V1Order addErrorsItem(Error errorsItem) {
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

  public V1Order id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The order's unique identifier.
   * @return id
  **/
  @ApiModelProperty(value = "The order's unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Order buyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }

   /**
   * The email address of the order's buyer.
   * @return buyerEmail
  **/
  @ApiModelProperty(value = "The email address of the order's buyer.")
  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public V1Order recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

   /**
   * The name of the order's buyer.
   * @return recipientName
  **/
  @ApiModelProperty(value = "The name of the order's buyer.")
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public V1Order recipientPhoneNumber(String recipientPhoneNumber) {
    this.recipientPhoneNumber = recipientPhoneNumber;
    return this;
  }

   /**
   * The phone number to use for the order's delivery.
   * @return recipientPhoneNumber
  **/
  @ApiModelProperty(value = "The phone number to use for the order's delivery.")
  public String getRecipientPhoneNumber() {
    return recipientPhoneNumber;
  }

  public void setRecipientPhoneNumber(String recipientPhoneNumber) {
    this.recipientPhoneNumber = recipientPhoneNumber;
  }

  public V1Order state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Whether the tax is an ADDITIVE tax or an INCLUSIVE tax.
   * @return state
  **/
  @ApiModelProperty(value = "Whether the tax is an ADDITIVE tax or an INCLUSIVE tax.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public V1Order shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The address to ship the order to.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The address to ship the order to.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public V1Order subtotalMoney(V1Money subtotalMoney) {
    this.subtotalMoney = subtotalMoney;
    return this;
  }

   /**
   * The amount of all items purchased in the order, before taxes and shipping.
   * @return subtotalMoney
  **/
  @ApiModelProperty(value = "The amount of all items purchased in the order, before taxes and shipping.")
  public V1Money getSubtotalMoney() {
    return subtotalMoney;
  }

  public void setSubtotalMoney(V1Money subtotalMoney) {
    this.subtotalMoney = subtotalMoney;
  }

  public V1Order totalShippingMoney(V1Money totalShippingMoney) {
    this.totalShippingMoney = totalShippingMoney;
    return this;
  }

   /**
   * The shipping cost for the order.
   * @return totalShippingMoney
  **/
  @ApiModelProperty(value = "The shipping cost for the order.")
  public V1Money getTotalShippingMoney() {
    return totalShippingMoney;
  }

  public void setTotalShippingMoney(V1Money totalShippingMoney) {
    this.totalShippingMoney = totalShippingMoney;
  }

  public V1Order totalTaxMoney(V1Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
    return this;
  }

   /**
   * The total of all taxes applied to the order.
   * @return totalTaxMoney
  **/
  @ApiModelProperty(value = "The total of all taxes applied to the order.")
  public V1Money getTotalTaxMoney() {
    return totalTaxMoney;
  }

  public void setTotalTaxMoney(V1Money totalTaxMoney) {
    this.totalTaxMoney = totalTaxMoney;
  }

  public V1Order totalPriceMoney(V1Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
    return this;
  }

   /**
   * The total cost of the order.
   * @return totalPriceMoney
  **/
  @ApiModelProperty(value = "The total cost of the order.")
  public V1Money getTotalPriceMoney() {
    return totalPriceMoney;
  }

  public void setTotalPriceMoney(V1Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
  }

  public V1Order totalDiscountMoney(V1Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
    return this;
  }

   /**
   * The total of all discounts applied to the order.
   * @return totalDiscountMoney
  **/
  @ApiModelProperty(value = "The total of all discounts applied to the order.")
  public V1Money getTotalDiscountMoney() {
    return totalDiscountMoney;
  }

  public void setTotalDiscountMoney(V1Money totalDiscountMoney) {
    this.totalDiscountMoney = totalDiscountMoney;
  }

  public V1Order createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the order was created, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the order was created, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1Order updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time when the order was last modified, in ISO 8601 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time when the order was last modified, in ISO 8601 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public V1Order expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The time when the order expires if no action is taken, in ISO 8601 format.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The time when the order expires if no action is taken, in ISO 8601 format.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public V1Order paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The unique identifier of the payment associated with the order.
   * @return paymentId
  **/
  @ApiModelProperty(value = "The unique identifier of the payment associated with the order.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public V1Order buyerNote(String buyerNote) {
    this.buyerNote = buyerNote;
    return this;
  }

   /**
   * A note provided by the buyer when the order was created, if any.
   * @return buyerNote
  **/
  @ApiModelProperty(value = "A note provided by the buyer when the order was created, if any.")
  public String getBuyerNote() {
    return buyerNote;
  }

  public void setBuyerNote(String buyerNote) {
    this.buyerNote = buyerNote;
  }

  public V1Order completedNote(String completedNote) {
    this.completedNote = completedNote;
    return this;
  }

   /**
   * A note provided by the merchant when the order's state was set to COMPLETED, if any
   * @return completedNote
  **/
  @ApiModelProperty(value = "A note provided by the merchant when the order's state was set to COMPLETED, if any")
  public String getCompletedNote() {
    return completedNote;
  }

  public void setCompletedNote(String completedNote) {
    this.completedNote = completedNote;
  }

  public V1Order refundedNote(String refundedNote) {
    this.refundedNote = refundedNote;
    return this;
  }

   /**
   * A note provided by the merchant when the order's state was set to REFUNDED, if any.
   * @return refundedNote
  **/
  @ApiModelProperty(value = "A note provided by the merchant when the order's state was set to REFUNDED, if any.")
  public String getRefundedNote() {
    return refundedNote;
  }

  public void setRefundedNote(String refundedNote) {
    this.refundedNote = refundedNote;
  }

  public V1Order canceledNote(String canceledNote) {
    this.canceledNote = canceledNote;
    return this;
  }

   /**
   * A note provided by the merchant when the order's state was set to CANCELED, if any.
   * @return canceledNote
  **/
  @ApiModelProperty(value = "A note provided by the merchant when the order's state was set to CANCELED, if any.")
  public String getCanceledNote() {
    return canceledNote;
  }

  public void setCanceledNote(String canceledNote) {
    this.canceledNote = canceledNote;
  }

  public V1Order tender(V1Tender tender) {
    this.tender = tender;
    return this;
  }

   /**
   * The tender used to pay for the order.
   * @return tender
  **/
  @ApiModelProperty(value = "The tender used to pay for the order.")
  public V1Tender getTender() {
    return tender;
  }

  public void setTender(V1Tender tender) {
    this.tender = tender;
  }

  public V1Order orderHistory(List<V1OrderHistoryEntry> orderHistory) {
    this.orderHistory = orderHistory;
    return this;
  }

  public V1Order addOrderHistoryItem(V1OrderHistoryEntry orderHistoryItem) {
    this.orderHistory.add(orderHistoryItem);
    return this;
  }

   /**
   * The history of actions associated with the order.
   * @return orderHistory
  **/
  @ApiModelProperty(value = "The history of actions associated with the order.")
  public List<V1OrderHistoryEntry> getOrderHistory() {
    return orderHistory;
  }

  public void setOrderHistory(List<V1OrderHistoryEntry> orderHistory) {
    this.orderHistory = orderHistory;
  }

  public V1Order promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

   /**
   * The promo code provided by the buyer, if any.
   * @return promoCode
  **/
  @ApiModelProperty(value = "The promo code provided by the buyer, if any.")
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public V1Order btcReceiveAddress(String btcReceiveAddress) {
    this.btcReceiveAddress = btcReceiveAddress;
    return this;
  }

   /**
   * For Bitcoin transactions, the address that the buyer sent Bitcoin to.
   * @return btcReceiveAddress
  **/
  @ApiModelProperty(value = "For Bitcoin transactions, the address that the buyer sent Bitcoin to.")
  public String getBtcReceiveAddress() {
    return btcReceiveAddress;
  }

  public void setBtcReceiveAddress(String btcReceiveAddress) {
    this.btcReceiveAddress = btcReceiveAddress;
  }

  public V1Order btcPriceSatoshi(BigDecimal btcPriceSatoshi) {
    this.btcPriceSatoshi = btcPriceSatoshi;
    return this;
  }

   /**
   * For Bitcoin transactions, the price of the buyer's order in satoshi (100 million satoshi equals 1 BTC).
   * @return btcPriceSatoshi
  **/
  @ApiModelProperty(value = "For Bitcoin transactions, the price of the buyer's order in satoshi (100 million satoshi equals 1 BTC).")
  public BigDecimal getBtcPriceSatoshi() {
    return btcPriceSatoshi;
  }

  public void setBtcPriceSatoshi(BigDecimal btcPriceSatoshi) {
    this.btcPriceSatoshi = btcPriceSatoshi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Order v1Order = (V1Order) o;
    return Objects.equals(this.errors, v1Order.errors) &&
        Objects.equals(this.id, v1Order.id) &&
        Objects.equals(this.buyerEmail, v1Order.buyerEmail) &&
        Objects.equals(this.recipientName, v1Order.recipientName) &&
        Objects.equals(this.recipientPhoneNumber, v1Order.recipientPhoneNumber) &&
        Objects.equals(this.state, v1Order.state) &&
        Objects.equals(this.shippingAddress, v1Order.shippingAddress) &&
        Objects.equals(this.subtotalMoney, v1Order.subtotalMoney) &&
        Objects.equals(this.totalShippingMoney, v1Order.totalShippingMoney) &&
        Objects.equals(this.totalTaxMoney, v1Order.totalTaxMoney) &&
        Objects.equals(this.totalPriceMoney, v1Order.totalPriceMoney) &&
        Objects.equals(this.totalDiscountMoney, v1Order.totalDiscountMoney) &&
        Objects.equals(this.createdAt, v1Order.createdAt) &&
        Objects.equals(this.updatedAt, v1Order.updatedAt) &&
        Objects.equals(this.expiresAt, v1Order.expiresAt) &&
        Objects.equals(this.paymentId, v1Order.paymentId) &&
        Objects.equals(this.buyerNote, v1Order.buyerNote) &&
        Objects.equals(this.completedNote, v1Order.completedNote) &&
        Objects.equals(this.refundedNote, v1Order.refundedNote) &&
        Objects.equals(this.canceledNote, v1Order.canceledNote) &&
        Objects.equals(this.tender, v1Order.tender) &&
        Objects.equals(this.orderHistory, v1Order.orderHistory) &&
        Objects.equals(this.promoCode, v1Order.promoCode) &&
        Objects.equals(this.btcReceiveAddress, v1Order.btcReceiveAddress) &&
        Objects.equals(this.btcPriceSatoshi, v1Order.btcPriceSatoshi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, id, buyerEmail, recipientName, recipientPhoneNumber, state, shippingAddress, subtotalMoney, totalShippingMoney, totalTaxMoney, totalPriceMoney, totalDiscountMoney, createdAt, updatedAt, expiresAt, paymentId, buyerNote, completedNote, refundedNote, canceledNote, tender, orderHistory, promoCode, btcReceiveAddress, btcPriceSatoshi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Order {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientPhoneNumber: ").append(toIndentedString(recipientPhoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    subtotalMoney: ").append(toIndentedString(subtotalMoney)).append("\n");
    sb.append("    totalShippingMoney: ").append(toIndentedString(totalShippingMoney)).append("\n");
    sb.append("    totalTaxMoney: ").append(toIndentedString(totalTaxMoney)).append("\n");
    sb.append("    totalPriceMoney: ").append(toIndentedString(totalPriceMoney)).append("\n");
    sb.append("    totalDiscountMoney: ").append(toIndentedString(totalDiscountMoney)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    buyerNote: ").append(toIndentedString(buyerNote)).append("\n");
    sb.append("    completedNote: ").append(toIndentedString(completedNote)).append("\n");
    sb.append("    refundedNote: ").append(toIndentedString(refundedNote)).append("\n");
    sb.append("    canceledNote: ").append(toIndentedString(canceledNote)).append("\n");
    sb.append("    tender: ").append(toIndentedString(tender)).append("\n");
    sb.append("    orderHistory: ").append(toIndentedString(orderHistory)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    btcReceiveAddress: ").append(toIndentedString(btcReceiveAddress)).append("\n");
    sb.append("    btcPriceSatoshi: ").append(toIndentedString(btcPriceSatoshi)).append("\n");
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

