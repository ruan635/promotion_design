package com.roy.promotion.benefits;

import com.roy.promotion.engine.ActionRule;
import com.roy.promotion.engine.RuleContext;
import com.roy.promotion.enums.BenefitType;

/**
 * @ClassName MoneyBenefitsHandler
 * @Author roy
 * @Date 2023/10/7 5:12 PM
 * @Version v1.0
 **/
public class MoneyBenefitsHandler implements BenefitsHandler {
    @Override
    public boolean handleBenefits(RuleContext ruleContext, ActionRule action) {
        return false;
    }

    @Override
    public BenefitType getBenefitType() {
        return BenefitType.MONEY;
    }
}
