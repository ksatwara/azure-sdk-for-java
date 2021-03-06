/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewall;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallApplicationRuleCollection;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallNatRuleCollection;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallNetworkRuleCollection;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallIPConfiguration;
import com.microsoft.azure.management.network.v2020_05_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallThreatIntelMode;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_05_01.HubIPAddresses;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallIpGroups;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallSku;
import java.util.Map;

class AzureFirewallImpl extends GroupableResourceCoreImpl<AzureFirewall, AzureFirewallInner, AzureFirewallImpl, NetworkManager> implements AzureFirewall, AzureFirewall.Definition, AzureFirewall.Update {
    AzureFirewallImpl(String name, AzureFirewallInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<AzureFirewall> createResourceAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AzureFirewall> updateResourceAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AzureFirewallInner> getInnerAsync() {
        AzureFirewallsInner client = this.manager().inner().azureFirewalls();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Map<String, String> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.inner().applicationRuleCollections();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource firewallPolicy() {
        return this.inner().firewallPolicy();
    }

    @Override
    public HubIPAddresses hubIPAddresses() {
        return this.inner().hubIPAddresses();
    }

    @Override
    public List<AzureFirewallIPConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public List<AzureFirewallIpGroups> ipGroups() {
        return this.inner().ipGroups();
    }

    @Override
    public AzureFirewallIPConfiguration managementIpConfiguration() {
        return this.inner().managementIpConfiguration();
    }

    @Override
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.inner().natRuleCollections();
    }

    @Override
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.inner().networkRuleCollections();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public AzureFirewallSku sku() {
        return this.inner().sku();
    }

    @Override
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.inner().threatIntelMode();
    }

    @Override
    public SubResource virtualHub() {
        return this.inner().virtualHub();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public AzureFirewallImpl withAdditionalProperties(Map<String, String> additionalProperties) {
        this.inner().withAdditionalProperties(additionalProperties);
        return this;
    }

    @Override
    public AzureFirewallImpl withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.inner().withApplicationRuleCollections(applicationRuleCollections);
        return this;
    }

    @Override
    public AzureFirewallImpl withFirewallPolicy(SubResource firewallPolicy) {
        this.inner().withFirewallPolicy(firewallPolicy);
        return this;
    }

    @Override
    public AzureFirewallImpl withHubIPAddresses(HubIPAddresses hubIPAddresses) {
        this.inner().withHubIPAddresses(hubIPAddresses);
        return this;
    }

    @Override
    public AzureFirewallImpl withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

    @Override
    public AzureFirewallImpl withManagementIpConfiguration(AzureFirewallIPConfiguration managementIpConfiguration) {
        this.inner().withManagementIpConfiguration(managementIpConfiguration);
        return this;
    }

    @Override
    public AzureFirewallImpl withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.inner().withNatRuleCollections(natRuleCollections);
        return this;
    }

    @Override
    public AzureFirewallImpl withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.inner().withNetworkRuleCollections(networkRuleCollections);
        return this;
    }

    @Override
    public AzureFirewallImpl withSku(AzureFirewallSku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public AzureFirewallImpl withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.inner().withThreatIntelMode(threatIntelMode);
        return this;
    }

    @Override
    public AzureFirewallImpl withVirtualHub(SubResource virtualHub) {
        this.inner().withVirtualHub(virtualHub);
        return this;
    }

    @Override
    public AzureFirewallImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
