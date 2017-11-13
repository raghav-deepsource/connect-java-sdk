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
import com.squareup.connect.models.AdditionalRecipient;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.TenderCardDetails;
import com.squareup.connect.models.TenderCashDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a tender (i.e., a method of payment) used in a Square transaction.
 */
@ApiModel(description = "Represents a tender (i.e., a method of payment) used in a Square transaction.")

public class Tender {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("tip_money")
  private Money tipMoney = null;

  @JsonProperty("processing_fee_money")
  private Money processingFeeMoney = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  /**
   * The type of tender, such as `CARD` or `CASH`.
   */
  public enum TypeEnum {
    CARD("CARD"),
    
    CASH("CASH"),
    
    THIRD_PARTY_CARD("THIRD_PARTY_CARD"),
    
    SQUARE_GIFT_CARD("SQUARE_GIFT_CARD"),
    
    NO_SALE("NO_SALE"),
    
    OTHER("OTHER");

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

  @JsonProperty("card_details")
  private TenderCardDetails cardDetails = null;

  @JsonProperty("cash_details")
  private TenderCashDetails cashDetails = null;

  @JsonProperty("additional_recipients")
  private List<AdditionalRecipient> additionalRecipients = new ArrayList<AdditionalRecipient>();

  public Tender id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The tender's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The tender's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Tender locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The ID of the transaction's associated location.
   * @return locationId
  **/
  @ApiModelProperty(value = "The ID of the transaction's associated location.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Tender transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The ID of the tender's associated transaction.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The ID of the tender's associated transaction.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Tender createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the tender was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the tender was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Tender note(String note) {
    this.note = note;
    return this;
  }

   /**
   * An optional note associated with the tender at the time of payment.
   * @return note
  **/
  @ApiModelProperty(value = "An optional note associated with the tender at the time of payment.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Tender amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of the tender.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The amount of the tender.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public Tender tipMoney(Money tipMoney) {
    this.tipMoney = tipMoney;
    return this;
  }

   /**
   * The tip's amount of the tender.
   * @return tipMoney
  **/
  @ApiModelProperty(value = "The tip's amount of the tender.")
  public Money getTipMoney() {
    return tipMoney;
  }

  public void setTipMoney(Money tipMoney) {
    this.tipMoney = tipMoney;
  }

  public Tender processingFeeMoney(Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
    return this;
  }

   /**
   * The amount of any Square processing fees applied to the tender.  This field is not immediately populated when a new transaction is created. It is usually available after about ten seconds.
   * @return processingFeeMoney
  **/
  @ApiModelProperty(value = "The amount of any Square processing fees applied to the tender.  This field is not immediately populated when a new transaction is created. It is usually available after about ten seconds.")
  public Money getProcessingFeeMoney() {
    return processingFeeMoney;
  }

  public void setProcessingFeeMoney(Money processingFeeMoney) {
    this.processingFeeMoney = processingFeeMoney;
  }

  public Tender customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * If the tender is associated with a customer or represents a customer's card on file, this is the ID of the associated customer.
   * @return customerId
  **/
  @ApiModelProperty(value = "If the tender is associated with a customer or represents a customer's card on file, this is the ID of the associated customer.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Tender type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tender, such as `CARD` or `CASH`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of tender, such as `CARD` or `CASH`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Tender cardDetails(TenderCardDetails cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

   /**
   * The details of the card tender.  This value is present only if the value of `type` is `CARD`.
   * @return cardDetails
  **/
  @ApiModelProperty(value = "The details of the card tender.  This value is present only if the value of `type` is `CARD`.")
  public TenderCardDetails getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(TenderCardDetails cardDetails) {
    this.cardDetails = cardDetails;
  }

  public Tender cashDetails(TenderCashDetails cashDetails) {
    this.cashDetails = cashDetails;
    return this;
  }

   /**
   * The details of the cash tender.  This value is present only if the value of `type` is `CASH`.
   * @return cashDetails
  **/
  @ApiModelProperty(value = "The details of the cash tender.  This value is present only if the value of `type` is `CASH`.")
  public TenderCashDetails getCashDetails() {
    return cashDetails;
  }

  public void setCashDetails(TenderCashDetails cashDetails) {
    this.cashDetails = cashDetails;
  }

  public Tender additionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
    return this;
  }

  public Tender addAdditionalRecipientsItem(AdditionalRecipient additionalRecipientsItem) {
    this.additionalRecipients.add(additionalRecipientsItem);
    return this;
  }

   /**
   * Additional recipients (other than the merchant) receiving a portion of this tender. For example, fees assessed on the purchase by a third party integration.
   * @return additionalRecipients
  **/
  @ApiModelProperty(value = "Additional recipients (other than the merchant) receiving a portion of this tender. For example, fees assessed on the purchase by a third party integration.")
  public List<AdditionalRecipient> getAdditionalRecipients() {
    return additionalRecipients;
  }

  public void setAdditionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tender tender = (Tender) o;
    return Objects.equals(this.id, tender.id) &&
        Objects.equals(this.locationId, tender.locationId) &&
        Objects.equals(this.transactionId, tender.transactionId) &&
        Objects.equals(this.createdAt, tender.createdAt) &&
        Objects.equals(this.note, tender.note) &&
        Objects.equals(this.amountMoney, tender.amountMoney) &&
        Objects.equals(this.tipMoney, tender.tipMoney) &&
        Objects.equals(this.processingFeeMoney, tender.processingFeeMoney) &&
        Objects.equals(this.customerId, tender.customerId) &&
        Objects.equals(this.type, tender.type) &&
        Objects.equals(this.cardDetails, tender.cardDetails) &&
        Objects.equals(this.cashDetails, tender.cashDetails) &&
        Objects.equals(this.additionalRecipients, tender.additionalRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, locationId, transactionId, createdAt, note, amountMoney, tipMoney, processingFeeMoney, customerId, type, cardDetails, cashDetails, additionalRecipients);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tender {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    tipMoney: ").append(toIndentedString(tipMoney)).append("\n");
    sb.append("    processingFeeMoney: ").append(toIndentedString(processingFeeMoney)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    cashDetails: ").append(toIndentedString(cashDetails)).append("\n");
    sb.append("    additionalRecipients: ").append(toIndentedString(additionalRecipients)).append("\n");
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

