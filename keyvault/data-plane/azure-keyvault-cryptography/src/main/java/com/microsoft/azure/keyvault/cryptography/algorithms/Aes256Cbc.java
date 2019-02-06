// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.keyvault.cryptography.algorithms;

public class Aes256Cbc extends AesCbc {

    private static final int KEY_SIZE = 256;
    public static final String ALGORITHM_NAME = "A256CBC";

    public Aes256Cbc() {
        super(ALGORITHM_NAME, KEY_SIZE);
    }
}
