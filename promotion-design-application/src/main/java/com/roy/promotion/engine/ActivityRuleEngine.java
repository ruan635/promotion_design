package com.roy.promotion.engine;

import java.util.List;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.RuleListener;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.AbstractRulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.support.composite.ActivationRuleGroup;

/**
 * @ClassName RuleEngine
 * @Author roy
 * @Date 2023/10/4 11:05 PM
 * @Version v1.0
 **/
public class ActivityRuleEngine {

    public void fire(RuleContext ruleContext, RuleListener listener) {
        ActivationRuleGroup ruleGroup = new ActivationRuleGroup();
        Facts facts = new Facts();
        List<ConditionRule> conditions = ruleContext.getConditions();
        if (conditions == null || conditions.size() == 0) {

            conditions.stream().forEach(ruleGroup::addRule);
        }


        Rules rules = new Rules();
        rules.register(ruleGroup);

        AbstractRulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.registerRuleListener(listener);
        rulesEngine.fire(rules, facts);
    }


}
