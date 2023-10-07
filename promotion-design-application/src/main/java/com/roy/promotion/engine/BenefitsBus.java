package com.roy.promotion.engine;

import java.util.List;
import java.util.Optional;

import com.roy.promotion.benefits.BenefitsHandler;

/**
 * @ClassName BenefitsBus
 * @Author roy
 * @Date 2023/10/7 2:30 PM
 * @Version v1.0
 **/
public class BenefitsBus {

    private List<BenefitsHandler> handlers;

    public boolean dispatch(RuleContext context, ActionRule actionRule) {
        Optional<BenefitsHandler> optional =
                handlers.stream().filter(h -> h.getBenefitType() == actionRule.getBenefitType()).findFirst();
        BenefitsHandler handler = null;

        if (optional.isPresent()) {
            handler = optional.get();
        }

        if (handler == null) {
            throw new RuntimeException("benefit handler not exists");
        }
        handler.handleBenefits(context, actionRule);
        return true;
    }

}
