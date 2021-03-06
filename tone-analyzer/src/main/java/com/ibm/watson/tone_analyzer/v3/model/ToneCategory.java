/*
 * (C) Copyright IBM Corp. 2016, 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.tone_analyzer.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;

/** The category for a tone from the input content. */
public class ToneCategory extends GenericModel {

  protected List<ToneScore> tones;

  @SerializedName("category_id")
  protected String categoryId;

  @SerializedName("category_name")
  protected String categoryName;

  /**
   * Gets the tones.
   *
   * <p>An array of `ToneScore` objects that provides the results for the tones of the category.
   *
   * @return the tones
   */
  public List<ToneScore> getTones() {
    return tones;
  }

  /**
   * Gets the categoryId.
   *
   * <p>The unique, non-localized identifier of the category for the results. The service can return
   * results for the following category IDs: `emotion_tone`, `language_tone`, and `social_tone`.
   *
   * @return the categoryId
   */
  public String getCategoryId() {
    return categoryId;
  }

  /**
   * Gets the categoryName.
   *
   * <p>The user-visible, localized name of the category.
   *
   * @return the categoryName
   */
  public String getCategoryName() {
    return categoryName;
  }
}
