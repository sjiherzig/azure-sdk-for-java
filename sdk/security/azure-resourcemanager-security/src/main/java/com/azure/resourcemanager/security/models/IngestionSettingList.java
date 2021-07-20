// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of ingestion settings. */
@Immutable
public final class IngestionSettingList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IngestionSettingList.class);

    /*
     * List of ingestion settings
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<IngestionSettingInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of ingestion settings.
     *
     * @return the value value.
     */
    public List<IngestionSettingInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}