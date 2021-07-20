// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for IotDefenderSettings DownloadManagerActivation. */
public final class IotDefenderSettingsDownloadManagerActivationSamples {
    /**
     * Sample code: Download quota data of the subscription.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void downloadQuotaDataOfTheSubscription(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager.iotDefenderSettings().downloadManagerActivationWithResponse(Context.NONE);
    }
}