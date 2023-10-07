package com.roy.promotion.engine;

import java.util.List;

/**
 * @ClassName RuleContext
 * @Author roy
 * @Date 2023/10/7 2:31 PM
 * @Version v1.0
 **/
public class RuleContext {

    private long inviterId;

    private long inviteeId;

    private List<ConditionRule> conditions;

    private List<ActionRule> actions;

    public long getInviterId() {
        return inviterId;
    }

    public void setInviterId(long inviterId) {
        this.inviterId = inviterId;
    }

    public long getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(long inviteeId) {
        this.inviteeId = inviteeId;
    }

    public List<ConditionRule> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionRule> conditions) {
        this.conditions = conditions;
    }

    public List<ActionRule> getActions() {
        return actions;
    }

    public void setActions(List<ActionRule> actions) {
        this.actions = actions;
    }
}
