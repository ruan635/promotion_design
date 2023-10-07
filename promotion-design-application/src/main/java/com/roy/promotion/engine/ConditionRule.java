package com.roy.promotion.engine;

import org.jeasy.rules.annotation.Rule;

import com.roy.promotion.enums.OperateEnum;

/**
 * @ClassName ConditionRule
 * @Author roy
 * @Date 2023/10/7 3:08 PM
 * @Version v1.0
 **/
@Rule
public class ConditionRule {

    private OperateEnum operate;

    private String value;

    private String factValue;

}
