/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Private Endpoint network resource that is linked to the Private Endpoint
 * connection.
 */
public class PrivateEndpoint {
    /**
     * Gets or sets id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get gets or sets id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
