// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ConnectionType. */
public enum ConnectionType {
    /** Enum value Public. */
    PUBLIC("Public"),

    /** Enum value Private. */
    PRIVATE("Private"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ConnectionType instance. */
    private final String value;

    ConnectionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ConnectionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ConnectionType object, or null if unable to parse.
     */
    @JsonCreator
    public static ConnectionType fromString(String value) {
        ConnectionType[] items = ConnectionType.values();
        for (ConnectionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
