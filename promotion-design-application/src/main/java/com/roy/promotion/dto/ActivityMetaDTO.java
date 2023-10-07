package com.roy.promotion.dto;

import com.roy.promotion.enums.MetaTypeEnum;
import com.roy.promotion.enums.OperateEnum;

/**
 * @ClassName ActivityMetaDTO
 * @Author roy
 * @Date 2023/10/7 11:22 AM
 * @Version v1.0
 **/
public class ActivityMetaDTO {

    private long id;

    private String metaName;

    private MetaTypeEnum metaType;

    private int unit;

    private OperateEnum operate;
}
