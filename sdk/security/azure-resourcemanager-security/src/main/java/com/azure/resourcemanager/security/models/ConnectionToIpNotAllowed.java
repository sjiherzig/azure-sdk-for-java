// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Outbound connection to an ip that isn't allowed. Allow list consists of ipv4 or ipv6 range in CIDR notation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("ConnectionToIpNotAllowed")
@Fluent
public final class ConnectionToIpNotAllowed extends AllowlistCustomAlertRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionToIpNotAllowed.class);

    /** {@inheritDoc} */
    @Override
    public ConnectionToIpNotAllowed withAllowlistValues(List<String> allowlistValues) {
        super.withAllowlistValues(allowlistValues);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionToIpNotAllowed withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}