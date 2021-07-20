// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks DeletePortMirroring. */
public final class WorkloadNetworksDeletePortMirroringSamples {
    /**
     * Sample code: WorkloadNetworks_DeletePortMirroring.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksDeletePortMirroring(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().deletePortMirroring("group1", "portMirroring1", "cloud1", Context.NONE);
    }
}