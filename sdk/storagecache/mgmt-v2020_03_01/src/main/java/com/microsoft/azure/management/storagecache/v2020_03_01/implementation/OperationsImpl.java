/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.storagecache.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagecache.v2020_03_01.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storagecache.v2020_03_01.ApiOperation;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final StorageCacheManager manager;

    OperationsImpl(StorageCacheManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public StorageCacheManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiOperation> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApiOperationInner>, Iterable<ApiOperationInner>>() {
            @Override
            public Iterable<ApiOperationInner> call(Page<ApiOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiOperationInner, ApiOperation>() {
            @Override
            public ApiOperation call(ApiOperationInner inner) {
                return new ApiOperationImpl(inner, manager());
            }
        });
    }

}
