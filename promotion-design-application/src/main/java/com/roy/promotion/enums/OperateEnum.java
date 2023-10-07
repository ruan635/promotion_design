package com.roy.promotion.enums;

public enum OperateEnum {

    GREATER_THAN(">", "大于"),

    GREATER_EQUAL_THAN(">=", "大于等于"),

    LESS_THAN("<", "小于"),

    LESS_EQUAL_THAN("<=", "小于等于"),

    EQUALS("=", "等于"),

    CONTAINS("contains", "包含");

    private String op;

    private String desc;

    OperateEnum(String op, String desc) {
        this.op = op;
        this.desc = desc;
    }
}
