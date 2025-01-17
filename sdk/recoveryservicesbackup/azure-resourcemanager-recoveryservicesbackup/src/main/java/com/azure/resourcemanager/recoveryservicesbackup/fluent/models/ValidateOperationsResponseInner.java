// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ValidateOperationsResponse model. */
@Fluent
public final class ValidateOperationsResponseInner {
    /*
     * Base class for validate operation response.
     */
    @JsonProperty(value = "validateOperationResponse")
    private ValidateOperationResponse validateOperationResponse;

    /**
     * Get the validateOperationResponse property: Base class for validate operation response.
     *
     * @return the validateOperationResponse value.
     */
    public ValidateOperationResponse validateOperationResponse() {
        return this.validateOperationResponse;
    }

    /**
     * Set the validateOperationResponse property: Base class for validate operation response.
     *
     * @param validateOperationResponse the validateOperationResponse value to set.
     * @return the ValidateOperationsResponseInner object itself.
     */
    public ValidateOperationsResponseInner withValidateOperationResponse(
        ValidateOperationResponse validateOperationResponse) {
        this.validateOperationResponse = validateOperationResponse;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validateOperationResponse() != null) {
            validateOperationResponse().validate();
        }
    }
}
