/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DataUserItemResponseData
 */

public class DataUserItemResponseData {
  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("total_play")
  private String totalPlay = null;

  @SerializedName("new_play")
  private String newPlay = null;

  @SerializedName("date_new_play")
  private String dateNewPlay = null;

  public DataUserItemResponseData errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public DataUserItemResponseData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DataUserItemResponseData totalPlay(String totalPlay) {
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 视频播放vv
   * @return totalPlay
  **/
  public String getTotalPlay() {
    return totalPlay;
  }

  public void setTotalPlay(String totalPlay) {
    this.totalPlay = totalPlay;
  }

  public DataUserItemResponseData newPlay(String newPlay) {
    this.newPlay = newPlay;
    return this;
  }

   /**
   * 新增视频播放
   * @return newPlay
  **/
  public String getNewPlay() {
    return newPlay;
  }

  public void setNewPlay(String newPlay) {
    this.newPlay = newPlay;
  }

  public DataUserItemResponseData dateNewPlay(String dateNewPlay) {
    this.dateNewPlay = dateNewPlay;
    return this;
  }

   /**
   * 每天新增视频播放
   * @return dateNewPlay
  **/
  public String getDateNewPlay() {
    return dateNewPlay;
  }

  public void setDateNewPlay(String dateNewPlay) {
    this.dateNewPlay = dateNewPlay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataUserItemResponseData dataUserItemResponseData = (DataUserItemResponseData) o;
    return Objects.equals(this.errorCode, dataUserItemResponseData.errorCode) &&
        Objects.equals(this.description, dataUserItemResponseData.description) &&
        Objects.equals(this.totalPlay, dataUserItemResponseData.totalPlay) &&
        Objects.equals(this.newPlay, dataUserItemResponseData.newPlay) &&
        Objects.equals(this.dateNewPlay, dataUserItemResponseData.dateNewPlay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, totalPlay, newPlay, dateNewPlay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataUserItemResponseData {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
    sb.append("    newPlay: ").append(toIndentedString(newPlay)).append("\n");
    sb.append("    dateNewPlay: ").append(toIndentedString(dateNewPlay)).append("\n");
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