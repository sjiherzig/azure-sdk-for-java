// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.GroupIdInformationInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * List private link resources for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupIdInformationInner> list(String resourceGroupName, String workspaceName);

    /**
     * List private link resources for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a workspace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupIdInformationInner> list(String resourceGroupName, String workspaceName, Context context);

    /**
     * Get the specified private link resource for the given group id (sub-resource).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param groupId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given group id (sub-resource).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupIdInformationInner get(String resourceGroupName, String workspaceName, String groupId);

    /**
     * Get the specified private link resource for the given group id (sub-resource).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param groupId The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.databricks.models.ErrorInfoException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given group id (sub-resource).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GroupIdInformationInner> getWithResponse(
        String resourceGroupName, String workspaceName, String groupId, Context context);
}