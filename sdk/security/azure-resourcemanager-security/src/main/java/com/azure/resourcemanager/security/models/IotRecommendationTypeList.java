// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.IotRecommendationTypeListInner;
import java.util.List;

/** An immutable client-side representation of IotRecommendationTypeList. */
public interface IotRecommendationTypeList {
    /**
     * Gets the value property: List data.
     *
     * @return the value value.
     */
    List<IotRecommendationType> value();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.IotRecommendationTypeListInner object.
     *
     * @return the inner object.
     */
    IotRecommendationTypeListInner innerModel();
}