// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;

/** Samples for WorkloadNetworks DeleteDnsZone. */
public final class WorkloadNetworksDeleteDnsZoneSamples {
    /**
     * Sample code: WorkloadNetworks_DeleteDnsZone.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksDeleteDnsZone(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager.workloadNetworks().deleteDnsZone("group1", "dnsZone1", "cloud1", Context.NONE);
    }
}