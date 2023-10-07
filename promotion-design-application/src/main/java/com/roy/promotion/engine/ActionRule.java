package com.roy.promotion.engine;

import com.roy.promotion.enums.BenefitType;

/**
 * @ClassName ActionRule
 * @Author roy
 * @Date 2023/10/7 3:08 PM
 * @Version v1.0
 **/
public class ActionRule {

    private BenefitType benefitType;

    private String value;

    public BenefitType getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(BenefitType benefitType) {
        this.benefitType = benefitType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
