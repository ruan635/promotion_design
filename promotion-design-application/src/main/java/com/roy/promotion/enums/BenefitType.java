package com.roy.promotion.enums;

/**
 * @ClassName BenefitType
 * @Author roy
 * @Date 2023/10/7 11:22 AM
 * @Version v1.0
 **/
public enum BenefitType {

    MONEY(1), CERTIFICATION(2);

    private int type;
    BenefitType(int type) {
        this.type = type;
    }

}
