// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;

/** Samples for Location CheckNameAvailability. */
public final class LocationCheckNameAvailabilitySamples {
    /**
     * Sample code: LocationCheckNameAvailability_AlreadyExists.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void locationCheckNameAvailabilityAlreadyExists(
        com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager
            .locations()
            .checkNameAvailabilityWithResponse(
                "japaneast", new CheckNameAvailabilityParameters().withName("existingaccountname"), Context.NONE);
    }

    /**
     * Sample code: LocationCheckNameAvailability_Available.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void locationCheckNameAvailabilityAvailable(
        com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager
            .locations()
            .checkNameAvailabilityWithResponse(
                "japaneast", new CheckNameAvailabilityParameters().withName("newaccountname"), Context.NONE);
    }
}