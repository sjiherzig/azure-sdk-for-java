// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.TopologyResourceInner;

/** An instance of this class provides access to all the operations defined in TopologiesClient. */
public interface TopologiesClient {
    /**
     * Gets a list that allows to build a topology view of a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list that allows to build a topology view of a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopologyResourceInner> list();

    /**
     * Gets a list that allows to build a topology view of a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list that allows to build a topology view of a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopologyResourceInner> list(Context context);

    /**
     * Gets a list that allows to build a topology view of a subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list that allows to build a topology view of a subscription and location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopologyResourceInner> listByHomeRegion(String ascLocation);

    /**
     * Gets a list that allows to build a topology view of a subscription and location.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list that allows to build a topology view of a subscription and location.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopologyResourceInner> listByHomeRegion(String ascLocation, Context context);

    /**
     * Gets a specific topology component.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param topologyResourceName Name of a topology resources collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific topology component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopologyResourceInner get(String resourceGroupName, String ascLocation, String topologyResourceName);

    /**
     * Gets a specific topology component.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param topologyResourceName Name of a topology resources collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific topology component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TopologyResourceInner> getWithResponse(
        String resourceGroupName, String ascLocation, String topologyResourceName, Context context);
}