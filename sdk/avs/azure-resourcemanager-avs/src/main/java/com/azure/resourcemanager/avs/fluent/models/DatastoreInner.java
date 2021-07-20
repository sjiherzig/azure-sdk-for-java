// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.DatastoreProvisioningState;
import com.azure.resourcemanager.avs.models.DiskPoolVolume;
import com.azure.resourcemanager.avs.models.NetAppVolume;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A datastore resource. */
@JsonFlatten
@Fluent
public class DatastoreInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatastoreInner.class);

    /*
     * The state of the datastore provisioning
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DatastoreProvisioningState provisioningState;

    /*
     * An Azure NetApp Files volume
     */
    @JsonProperty(value = "properties.netAppVolume")
    private NetAppVolume netAppVolume;

    /*
     * An iSCSI volume
     */
    @JsonProperty(value = "properties.diskPoolVolume")
    private DiskPoolVolume diskPoolVolume;

    /**
     * Get the provisioningState property: The state of the datastore provisioning.
     *
     * @return the provisioningState value.
     */
    public DatastoreProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the netAppVolume property: An Azure NetApp Files volume.
     *
     * @return the netAppVolume value.
     */
    public NetAppVolume netAppVolume() {
        return this.netAppVolume;
    }

    /**
     * Set the netAppVolume property: An Azure NetApp Files volume.
     *
     * @param netAppVolume the netAppVolume value to set.
     * @return the DatastoreInner object itself.
     */
    public DatastoreInner withNetAppVolume(NetAppVolume netAppVolume) {
        this.netAppVolume = netAppVolume;
        return this;
    }

    /**
     * Get the diskPoolVolume property: An iSCSI volume.
     *
     * @return the diskPoolVolume value.
     */
    public DiskPoolVolume diskPoolVolume() {
        return this.diskPoolVolume;
    }

    /**
     * Set the diskPoolVolume property: An iSCSI volume.
     *
     * @param diskPoolVolume the diskPoolVolume value to set.
     * @return the DatastoreInner object itself.
     */
    public DatastoreInner withDiskPoolVolume(DiskPoolVolume diskPoolVolume) {
        this.diskPoolVolume = diskPoolVolume;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (netAppVolume() != null) {
            netAppVolume().validate();
        }
        if (diskPoolVolume() != null) {
            diskPoolVolume().validate();
        }
    }
}