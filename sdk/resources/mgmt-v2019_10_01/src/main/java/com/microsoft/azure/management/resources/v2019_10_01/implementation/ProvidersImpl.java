/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_10_01.Providers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_10_01.Provider;

class ProvidersImpl extends WrapperImpl<ProvidersInner> implements Providers {
    private final ResourcesManager manager;

    ProvidersImpl(ResourcesManager manager) {
        super(manager.inner().providers());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private ProviderImpl wrapModel(ProviderInner inner) {
        return  new ProviderImpl(inner, manager());
    }

    @Override
    public Observable<Provider> unregisterAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.unregisterAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> registerAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.registerAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> getAtTenantScopeAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.getAtTenantScopeAsync(resourceProviderNamespace)
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> listAtTenantScopeAsync() {
        ProvidersInner client = this.inner();
        return client.listAtTenantScopeAsync()
        .flatMapIterable(new Func1<Page<ProviderInner>, Iterable<ProviderInner>>() {
            @Override
            public Iterable<ProviderInner> call(Page<ProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return new ProviderImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Provider> listAsync() {
        ProvidersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ProviderInner>, Iterable<ProviderInner>>() {
            @Override
            public Iterable<ProviderInner> call(Page<ProviderInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProviderInner, Provider>() {
            @Override
            public Provider call(ProviderInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Provider> getAsync(String resourceProviderNamespace) {
        ProvidersInner client = this.inner();
        return client.getAsync(resourceProviderNamespace)
        .flatMap(new Func1<ProviderInner, Observable<Provider>>() {
            @Override
            public Observable<Provider> call(ProviderInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Provider)wrapModel(inner));
                }
            }
       });
    }

}
