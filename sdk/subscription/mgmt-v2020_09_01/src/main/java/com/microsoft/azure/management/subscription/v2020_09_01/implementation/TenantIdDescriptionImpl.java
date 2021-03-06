/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2020_09_01.implementation;

import com.microsoft.azure.management.subscription.v2020_09_01.TenantIdDescription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class TenantIdDescriptionImpl extends WrapperImpl<TenantIdDescriptionInner> implements TenantIdDescription {
    private final SubscriptionManager manager;
    TenantIdDescriptionImpl(TenantIdDescriptionInner inner, SubscriptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SubscriptionManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

}
