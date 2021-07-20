// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;

/** Samples for EventsOperation List. */
public final class EventsOperationListSamples {
    /**
     * Sample code: EventsList-Modern.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void eventsListModern(com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .eventsOperations()
            .list(
                "2019-09-01",
                "2019-10-31",
                "providers/Microsoft.Billing/billingAccounts/1234:5678/customers/4268",
                Context.NONE);
    }

    /**
     * Sample code: EventsListByBillingProfile.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void eventsListByBillingProfile(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .eventsOperations()
            .list(
                "2019-09-01",
                "2019-10-31",
                "providers/Microsoft.Billing/billingAccounts/1234:5678/billingProfiles/4268",
                Context.NONE);
    }
}