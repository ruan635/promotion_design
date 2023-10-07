package com.roy.promotion.benefits;

import java.util.List;

import com.roy.promotion.engine.ActionRule;
import com.roy.promotion.engine.RuleContext;
import com.roy.promotion.enums.BenefitType;

/**
 * @ClassName BenefitsHandler
 * @Author roy
 * @Date 2023/10/4 11:06 PM
 * @Version v1.0
 **/
public interface BenefitsHandler {

    boolean handleBenefits(RuleContext ruleContext, ActionRule action);

    BenefitType getBenefitType();

}
