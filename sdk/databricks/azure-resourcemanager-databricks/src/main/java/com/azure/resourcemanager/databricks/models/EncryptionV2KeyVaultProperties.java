// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key Vault input properties for encryption. */
@Fluent
public final class EncryptionV2KeyVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionV2KeyVaultProperties.class);

    /*
     * The Uri of KeyVault.
     */
    @JsonProperty(value = "keyVaultUri", required = true)
    private String keyVaultUri;

    /*
     * The name of KeyVault key.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /*
     * The version of KeyVault key.
     */
    @JsonProperty(value = "keyVersion", required = true)
    private String keyVersion;

    /**
     * Get the keyVaultUri property: The Uri of KeyVault.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The Uri of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the EncryptionV2KeyVaultProperties object itself.
     */
    public EncryptionV2KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the keyName property: The name of KeyVault key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of KeyVault key.
     *
     * @param keyName the keyName value to set.
     * @return the EncryptionV2KeyVaultProperties object itself.
     */
    public EncryptionV2KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of KeyVault key.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of KeyVault key.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the EncryptionV2KeyVaultProperties object itself.
     */
    public EncryptionV2KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultUri in model EncryptionV2KeyVaultProperties"));
        }
        if (keyName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyName in model EncryptionV2KeyVaultProperties"));
        }
        if (keyVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVersion in model EncryptionV2KeyVaultProperties"));
        }
    }
}