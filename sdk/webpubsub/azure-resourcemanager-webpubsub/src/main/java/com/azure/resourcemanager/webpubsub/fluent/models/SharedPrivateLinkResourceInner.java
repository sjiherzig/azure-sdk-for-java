// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.SharedPrivateLinkResourceStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a Shared Private Link Resource. */
@JsonFlatten
@Fluent
public class SharedPrivateLinkResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedPrivateLinkResourceInner.class);

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The group id from the provider of resource the shared private link
     * resource is for
     */
    @JsonProperty(value = "properties.groupId")
    private String groupId;

    /*
     * The resource id of the resource the shared private link resource is for
     */
    @JsonProperty(value = "properties.privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * Provisioning state of the shared private link resource
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The request message for requesting approval of the shared private link
     * resource
     */
    @JsonProperty(value = "properties.requestMessage")
    private String requestMessage;

    /*
     * Status of the shared private link resource
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private SharedPrivateLinkResourceStatus status;

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the groupId property: The group id from the provider of resource the shared private link resource is for.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group id from the provider of resource the shared private link resource is for.
     *
     * @param groupId the groupId value to set.
     * @return the SharedPrivateLinkResourceInner object itself.
     */
    public SharedPrivateLinkResourceInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the privateLinkResourceId property: The resource id of the resource the shared private link resource is for.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: The resource id of the resource the shared private link resource is for.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the SharedPrivateLinkResourceInner object itself.
     */
    public SharedPrivateLinkResourceInner withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the shared private link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the requestMessage property: The request message for requesting approval of the shared private link resource.
     *
     * @return the requestMessage value.
     */
    public String requestMessage() {
        return this.requestMessage;
    }

    /**
     * Set the requestMessage property: The request message for requesting approval of the shared private link resource.
     *
     * @param requestMessage the requestMessage value to set.
     * @return the SharedPrivateLinkResourceInner object itself.
     */
    public SharedPrivateLinkResourceInner withRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
        return this;
    }

    /**
     * Get the status property: Status of the shared private link resource.
     *
     * @return the status value.
     */
    public SharedPrivateLinkResourceStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}