// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents server restart parameters. */
@Fluent
public final class RestartParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestartParameter.class);

    /*
     * Indicates whether to restart the server with failover.
     */
    @JsonProperty(value = "restartWithFailover")
    private Boolean restartWithFailover;

    /*
     * Failover mode.
     */
    @JsonProperty(value = "failoverMode")
    private String failoverMode;

    /**
     * Get the restartWithFailover property: Indicates whether to restart the server with failover.
     *
     * @return the restartWithFailover value.
     */
    public Boolean restartWithFailover() {
        return this.restartWithFailover;
    }

    /**
     * Set the restartWithFailover property: Indicates whether to restart the server with failover.
     *
     * @param restartWithFailover the restartWithFailover value to set.
     * @return the RestartParameter object itself.
     */
    public RestartParameter withRestartWithFailover(Boolean restartWithFailover) {
        this.restartWithFailover = restartWithFailover;
        return this;
    }

    /**
     * Get the failoverMode property: Failover mode.
     *
     * @return the failoverMode value.
     */
    public String failoverMode() {
        return this.failoverMode;
    }

    /**
     * Set the failoverMode property: Failover mode.
     *
     * @param failoverMode the failoverMode value to set.
     * @return the RestartParameter object itself.
     */
    public RestartParameter withFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}