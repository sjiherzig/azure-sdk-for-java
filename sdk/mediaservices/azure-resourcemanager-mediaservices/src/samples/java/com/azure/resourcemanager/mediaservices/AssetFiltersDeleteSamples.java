// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for AssetFilters Delete. */
public final class AssetFiltersDeleteSamples {
    /**
     * Sample code: Delete an Asset Filter.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void deleteAnAssetFilter(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .assetFilters()
            .deleteWithResponse(
                "contoso", "contosomedia", "ClimbingMountRainer", "assetFilterWithTimeWindowAndTrack", Context.NONE);
    }
}