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
import com.squareup.connect.models.CatalogObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A group of variations for a &#x60;CatalogItem&#x60;.
 */
@ApiModel(description = "A group of variations for a `CatalogItem`.")

public class CatalogItemOption {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("show_colors")
  private Boolean showColors = null;

  @JsonProperty("values")
  private List<CatalogObject> values = new ArrayList<CatalogObject>();

  @JsonProperty("item_count")
  private Long itemCount = null;

  public CatalogItemOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item option's display name for the seller. Must be unique across all item options. Searchable.
   * @return name
  **/
  @ApiModelProperty(value = "The item option's display name for the seller. Must be unique across all item options. Searchable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogItemOption displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The item option's display name for the customer. Searchable.
   * @return displayName
  **/
  @ApiModelProperty(value = "The item option's display name for the customer. Searchable.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CatalogItemOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The item option's human-readable description. Displayed in the Square Point of Sale app for the seller and in the Online Store or on receipts for the buyer.
   * @return description
  **/
  @ApiModelProperty(value = "The item option's human-readable description. Displayed in the Square Point of Sale app for the seller and in the Online Store or on receipts for the buyer.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogItemOption showColors(Boolean showColors) {
    this.showColors = showColors;
    return this;
  }

   /**
   * If true, display colors for entries in `values` when present.
   * @return showColors
  **/
  @ApiModelProperty(value = "If true, display colors for entries in `values` when present.")
  public Boolean getShowColors() {
    return showColors;
  }

  public void setShowColors(Boolean showColors) {
    this.showColors = showColors;
  }

  public CatalogItemOption values(List<CatalogObject> values) {
    this.values = values;
    return this;
  }

  public CatalogItemOption addValuesItem(CatalogObject valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * A list of CatalogObjects containing the `CatalogItemOptionValue`s for this item.
   * @return values
  **/
  @ApiModelProperty(value = "A list of CatalogObjects containing the `CatalogItemOptionValue`s for this item.")
  public List<CatalogObject> getValues() {
    return values;
  }

  public void setValues(List<CatalogObject> values) {
    this.values = values;
  }

  public CatalogItemOption itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * The number of `CatalogItem`s currently associated with this item option. Present only if the `include_counts` was specified in the request. Any count over 100 will be returned as `100`.
   * @return itemCount
  **/
  @ApiModelProperty(value = "The number of `CatalogItem`s currently associated with this item option. Present only if the `include_counts` was specified in the request. Any count over 100 will be returned as `100`.")
  public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemOption catalogItemOption = (CatalogItemOption) o;
    return Objects.equals(this.name, catalogItemOption.name) &&
        Objects.equals(this.displayName, catalogItemOption.displayName) &&
        Objects.equals(this.description, catalogItemOption.description) &&
        Objects.equals(this.showColors, catalogItemOption.showColors) &&
        Objects.equals(this.values, catalogItemOption.values) &&
        Objects.equals(this.itemCount, catalogItemOption.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, description, showColors, values, itemCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    showColors: ").append(toIndentedString(showColors)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

