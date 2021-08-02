// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement;

import com.azure.core.util.Context;

/** Samples for Exports GetExecutionHistory. */
public final class ExportsGetExecutionHistorySamples {
    /**
     * Sample code: BillingAccountExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void billingAccountExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "providers/Microsoft.Billing/billingAccounts/123456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: DepartmentExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void departmentExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "providers/Microsoft.Billing/billingAccounts/12/departments/1234", "TestExport", Context.NONE);
    }

    /**
     * Sample code: SubscriptionExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void subscriptionExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000", "TestExport", Context.NONE);
    }

    /**
     * Sample code: EnrollmentAccountExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void enrollmentAccountExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "providers/Microsoft.Billing/billingAccounts/100/enrollmentAccounts/456", "TestExport", Context.NONE);
    }

    /**
     * Sample code: ManagementGroupExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void managementGroupExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "providers/Microsoft.Management/managementGroups/TestMG", "TestExport", Context.NONE);
    }

    /**
     * Sample code: ResourceGroupExecutionHistoryExport.
     *
     * @param costManagementManager Entry point to CostManagementManager.
     */
    public static void resourceGroupExecutionHistoryExport(
        com.azure.resourcemanager.costmanagement.CostManagementManager costManagementManager) {
        costManagementManager
            .exports()
            .getExecutionHistoryWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG",
                "TestExport",
                Context.NONE);
    }
}