/*  
 * Copyright IBM Corp. 2015
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.g11n.pipeline.client;

import java.util.EnumMap;
import java.util.Map;

/**
 * <code>BundleMetrics</code> provides read access to translation bundle's
 * metrics information.
 * 
 * @see LanguageMetrics
 * @author Yoshito Umaoka
 */
public abstract class BundleMetrics {

    /**
     * Returns the translation status metrics by target language.
     * 
     * @return The translation status metrics by target language.
     */
    public abstract Map<String, EnumMap<TranslationStatus, Integer>> getTranslationStatusMetricsByLanguage();

    /**
     * Returns the review status metrics by target language.
     * 
     * @return The review status metrics by target language.
     */
    public abstract Map<String, ReviewStatusMetrics> getReviewStatusMetricsByLanguage();

    /**
     * Returns the partner maintained status metrics by target language.
     * 
     * @return The partner maintained status metrics by target language.
     */
    public abstract Map<String, Map<String, Integer>> getPartnerStatusMetricsByLanguage();
}
