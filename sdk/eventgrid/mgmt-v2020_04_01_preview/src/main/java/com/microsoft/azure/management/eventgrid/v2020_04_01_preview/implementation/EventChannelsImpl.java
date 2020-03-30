/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.EventChannels;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.EventChannel;

class EventChannelsImpl extends WrapperImpl<EventChannelsInner> implements EventChannels {
    private final EventGridManager manager;

    EventChannelsImpl(EventGridManager manager) {
        super(manager.inner().eventChannels());
        this.manager = manager;
    }

    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public EventChannelImpl define(String name) {
        return wrapModel(name);
    }

    private EventChannelImpl wrapModel(EventChannelInner inner) {
        return  new EventChannelImpl(inner, manager());
    }

    private EventChannelImpl wrapModel(String name) {
        return new EventChannelImpl(name, this.manager());
    }

    @Override
    public Observable<EventChannel> listByPartnerNamespaceAsync(final String resourceGroupName, final String partnerNamespaceName) {
        EventChannelsInner client = this.inner();
        return client.listByPartnerNamespaceAsync(resourceGroupName, partnerNamespaceName)
        .flatMapIterable(new Func1<Page<EventChannelInner>, Iterable<EventChannelInner>>() {
            @Override
            public Iterable<EventChannelInner> call(Page<EventChannelInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventChannelInner, EventChannel>() {
            @Override
            public EventChannel call(EventChannelInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<EventChannel> getAsync(String resourceGroupName, String partnerNamespaceName, String eventChannelName) {
        EventChannelsInner client = this.inner();
        return client.getAsync(resourceGroupName, partnerNamespaceName, eventChannelName)
        .flatMap(new Func1<EventChannelInner, Observable<EventChannel>>() {
            @Override
            public Observable<EventChannel> call(EventChannelInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((EventChannel)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String partnerNamespaceName, String eventChannelName) {
        EventChannelsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, partnerNamespaceName, eventChannelName).toCompletable();
    }

}