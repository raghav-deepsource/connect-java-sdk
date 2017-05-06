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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates a tender's type.
 */
public enum TenderType {
  
  CARD("CARD"),
  
  CASH("CASH"),
  
  THIRD_PARTY_CARD("THIRD_PARTY_CARD"),
  
  SQUARE_GIFT_CARD("SQUARE_GIFT_CARD"),
  
  NO_SALE("NO_SALE"),
  
  OTHER("OTHER");

  private String value;

  TenderType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TenderType fromValue(String text) {
    for (TenderType b : TenderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
