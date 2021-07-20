// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for RegulatoryComplianceControls Get. */
public final class RegulatoryComplianceControlsGetSamples {
    /**
     * Sample code: Get selected regulatory compliance control details and state.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void getSelectedRegulatoryComplianceControlDetailsAndState(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.regulatoryComplianceControls().getWithResponse("PCI-DSS-3.2", "1.1", Context.NONE);
    }
}