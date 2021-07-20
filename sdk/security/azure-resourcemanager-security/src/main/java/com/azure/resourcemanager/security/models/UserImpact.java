// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UserImpact. */
public final class UserImpact extends ExpandableStringEnum<UserImpact> {
    /** Static value Low for UserImpact. */
    public static final UserImpact LOW = fromString("Low");

    /** Static value Moderate for UserImpact. */
    public static final UserImpact MODERATE = fromString("Moderate");

    /** Static value High for UserImpact. */
    public static final UserImpact HIGH = fromString("High");

    /**
     * Creates or finds a UserImpact from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserImpact.
     */
    @JsonCreator
    public static UserImpact fromString(String name) {
        return fromString(name, UserImpact.class);
    }

    /** @return known UserImpact values. */
    public static Collection<UserImpact> values() {
        return values(UserImpact.class);
    }
}