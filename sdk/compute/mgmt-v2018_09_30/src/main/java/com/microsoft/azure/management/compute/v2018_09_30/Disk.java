/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_09_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2018_09_30.implementation.ComputeManager;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2018_09_30.implementation.DiskInner;

/**
 * Type representing Disk.
 */
public interface Disk extends HasInner<DiskInner>, Resource, GroupableResourceCore<ComputeManager, DiskInner>, HasResourceGroup, Refreshable<Disk>, Updatable<Disk.Update>, HasManager<ComputeManager> {
    /**
     * @return the creationData value.
     */
    CreationData creationData();

    /**
     * @return the diskIOPSReadWrite value.
     */
    Long diskIOPSReadWrite();

    /**
     * @return the diskMBpsReadWrite value.
     */
    Integer diskMBpsReadWrite();

    /**
     * @return the diskSizeGB value.
     */
    Integer diskSizeGB();

    /**
     * @return the diskState value.
     */
    DiskState diskState();

    /**
     * @return the encryptionSettingsCollection value.
     */
    EncryptionSettingsCollection encryptionSettingsCollection();

    /**
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sku value.
     */
    DiskSku sku();

    /**
     * @return the timeCreated value.
     */
    DateTime timeCreated();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the Disk definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreationData, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Disk definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Disk definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Disk definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreationData> {
        }

        /**
         * The stage of the disk definition allowing to specify CreationData.
         */
        interface WithCreationData {
           /**
            * Specifies creationData.
            * @param creationData Disk source information. CreationData information cannot be changed after the disk has been created
            * @return the next definition stage
*/
            WithCreate withCreationData(CreationData creationData);
        }

        /**
         * The stage of the disk definition allowing to specify DiskIOPSReadWrite.
         */
        interface WithDiskIOPSReadWrite {
            /**
             * Specifies diskIOPSReadWrite.
             * @param diskIOPSReadWrite The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes
             * @return the next definition stage
             */
            WithCreate withDiskIOPSReadWrite(Long diskIOPSReadWrite);
        }

        /**
         * The stage of the disk definition allowing to specify DiskMBpsReadWrite.
         */
        interface WithDiskMBpsReadWrite {
            /**
             * Specifies diskMBpsReadWrite.
             * @param diskMBpsReadWrite The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10
             * @return the next definition stage
             */
            WithCreate withDiskMBpsReadWrite(Integer diskMBpsReadWrite);
        }

        /**
         * The stage of the disk definition allowing to specify DiskSizeGB.
         */
        interface WithDiskSizeGB {
            /**
             * Specifies diskSizeGB.
             * @param diskSizeGB If creationData.createOption is Empty, this field is mandatory and it indicates the size of the VHD to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size
             * @return the next definition stage
             */
            WithCreate withDiskSizeGB(Integer diskSizeGB);
        }

        /**
         * The stage of the disk definition allowing to specify EncryptionSettingsCollection.
         */
        interface WithEncryptionSettingsCollection {
            /**
             * Specifies encryptionSettingsCollection.
             * @param encryptionSettingsCollection Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot
             * @return the next definition stage
             */
            WithCreate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection);
        }

        /**
         * The stage of the disk definition allowing to specify HyperVGeneration.
         */
        interface WithHyperVGeneration {
            /**
             * Specifies hyperVGeneration.
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'
             * @return the next definition stage
             */
            WithCreate withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }

        /**
         * The stage of the disk definition allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType The Operating System type. Possible values include: 'Windows', 'Linux'
             * @return the next definition stage
             */
            WithCreate withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the disk definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(DiskSku sku);
        }

        /**
         * The stage of the disk definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones The Logical zone list for Disk
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Disk>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDiskIOPSReadWrite, DefinitionStages.WithDiskMBpsReadWrite, DefinitionStages.WithDiskSizeGB, DefinitionStages.WithEncryptionSettingsCollection, DefinitionStages.WithHyperVGeneration, DefinitionStages.WithOsType, DefinitionStages.WithSku, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a Disk update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Disk>, Resource.UpdateWithTags<Update>, UpdateStages.WithDiskIOPSReadWrite, UpdateStages.WithDiskMBpsReadWrite, UpdateStages.WithDiskSizeGB, UpdateStages.WithEncryptionSettingsCollection, UpdateStages.WithOsType, UpdateStages.WithSku {
    }

    /**
     * Grouping of Disk update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the disk update allowing to specify DiskIOPSReadWrite.
         */
        interface WithDiskIOPSReadWrite {
            /**
             * Specifies diskIOPSReadWrite.
             * @param diskIOPSReadWrite The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes
             * @return the next update stage
             */
            Update withDiskIOPSReadWrite(Long diskIOPSReadWrite);
        }

        /**
         * The stage of the disk update allowing to specify DiskMBpsReadWrite.
         */
        interface WithDiskMBpsReadWrite {
            /**
             * Specifies diskMBpsReadWrite.
             * @param diskMBpsReadWrite The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10
             * @return the next update stage
             */
            Update withDiskMBpsReadWrite(Integer diskMBpsReadWrite);
        }

        /**
         * The stage of the disk update allowing to specify DiskSizeGB.
         */
        interface WithDiskSizeGB {
            /**
             * Specifies diskSizeGB.
             * @param diskSizeGB If creationData.createOption is Empty, this field is mandatory and it indicates the size of the VHD to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size
             * @return the next update stage
             */
            Update withDiskSizeGB(Integer diskSizeGB);
        }

        /**
         * The stage of the disk update allowing to specify EncryptionSettingsCollection.
         */
        interface WithEncryptionSettingsCollection {
            /**
             * Specifies encryptionSettingsCollection.
             * @param encryptionSettingsCollection Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot
             * @return the next update stage
             */
            Update withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection);
        }

        /**
         * The stage of the disk update allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType the Operating System type. Possible values include: 'Windows', 'Linux'
             * @return the next update stage
             */
            Update withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the disk update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next update stage
             */
            Update withSku(DiskSku sku);
        }

    }
}
