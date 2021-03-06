/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.ActionRunWorkflowWorkflowRunActionRepetitionDefinition;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.RunActionCorrelation;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.ContentLink;
import java.util.List;
import com.microsoft.azure.management.logic.v2016_06_01.RepetitionIndex;
import com.microsoft.azure.management.logic.v2016_06_01.RetryHistory;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;
import java.util.Map;

class ActionRunWorkflowWorkflowRunActionRepetitionDefinitionImpl extends IndexableRefreshableWrapperImpl<ActionRunWorkflowWorkflowRunActionRepetitionDefinition, WorkflowRunActionRepetitionDefinitionInner> implements ActionRunWorkflowWorkflowRunActionRepetitionDefinition {
    private final LogicManager manager;
    private String resourceGroupName;
    private String workflowName;
    private String runName;
    private String actionName;
    private String repetitionName;

    ActionRunWorkflowWorkflowRunActionRepetitionDefinitionImpl(WorkflowRunActionRepetitionDefinitionInner inner,  LogicManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workflowName = IdParsingUtils.getValueFromIdByName(inner.id(), "workflows");
        this.runName = IdParsingUtils.getValueFromIdByName(inner.id(), "runs");
        this.actionName = IdParsingUtils.getValueFromIdByName(inner.id(), "actions");
        this.repetitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "repetitions");
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<WorkflowRunActionRepetitionDefinitionInner> getInnerAsync() {
        WorkflowRunActionRepetitionsInner client = this.manager().inner().workflowRunActionRepetitions();
        return client.getAsync(this.resourceGroupName, this.workflowName, this.runName, this.actionName, this.repetitionName);
    }



    @Override
    public String code() {
        return this.inner().code();
    }

    @Override
    public RunActionCorrelation correlation() {
        return this.inner().correlation();
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public Object error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Object inputs() {
        return this.inner().inputs();
    }

    @Override
    public ContentLink inputsLink() {
        return this.inner().inputsLink();
    }

    @Override
    public Integer iterationCount() {
        return this.inner().iterationCount();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object outputs() {
        return this.inner().outputs();
    }

    @Override
    public ContentLink outputsLink() {
        return this.inner().outputsLink();
    }

    @Override
    public List<RepetitionIndex> repetitionIndexes() {
        return this.inner().repetitionIndexes();
    }

    @Override
    public List<RetryHistory> retryHistory() {
        return this.inner().retryHistory();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public WorkflowStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Object trackedProperties() {
        return this.inner().trackedProperties();
    }

    @Override
    public String trackingId() {
        return this.inner().trackingId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
