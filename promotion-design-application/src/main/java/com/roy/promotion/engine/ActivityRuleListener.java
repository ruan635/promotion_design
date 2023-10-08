package com.roy.promotion.engine;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;

/**
 * @ClassName ActivityRuleLisenter
 * @Author roy
 * @Date 2023/10/7 5:57 PM
 * @Version v1.0
 **/
public class ActivityRuleListener implements RuleListener {

    private BenefitsBus benefitsBus;

    @Override
    public void onSuccess(Rule rule, Facts facts) {

//        benefitsBus.dispatch()
    }
}
