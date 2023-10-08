package com.roy.promotion.engine;

import java.lang.annotation.Annotation;


import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;

import com.roy.promotion.enums.OperateEnum;

/**
 * @ClassName ConditionRule
 * @Author roy
 * @Date 2023/10/7 3:08 PM
 * @Version v1.0
 **/
public class ConditionRule implements Rule {

    private OperateEnum operate;

    private String value;

    private String factValue;

    public OperateEnum getOperate() {
        return operate;
    }

    public void setOperate(OperateEnum operate) {
        this.operate = operate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFactValue() {
        return factValue;
    }

    public void setFactValue(String factValue) {
        this.factValue = factValue;
    }

    @Override
    public boolean evaluate(Facts facts) {
        return false;
    }

    @Override
    public void execute(Facts facts) throws Exception {

    }

    @Override
    public int compareTo(Rule o) {
        return 0;
    }
}
