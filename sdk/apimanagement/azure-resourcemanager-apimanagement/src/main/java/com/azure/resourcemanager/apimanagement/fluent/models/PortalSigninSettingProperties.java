// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sign-in settings contract properties. */
@Fluent
public final class PortalSigninSettingProperties {
    /*
     * Redirect Anonymous users to the Sign-In page.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled property: Redirect Anonymous users to the Sign-In page.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Redirect Anonymous users to the Sign-In page.
     *
     * @param enabled the enabled value to set.
     * @return the PortalSigninSettingProperties object itself.
     */
    public PortalSigninSettingProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
