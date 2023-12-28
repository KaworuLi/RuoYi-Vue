package com.ruoyi.system.extend.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Jing.Zhang
 */
@Data
@ApiModel("保存素材内容")
public class SaveMaterialContentNewData {

    @ApiModelProperty(hidden = true)
    private String userCode;

    @ApiModelProperty(hidden = true)
    private String materialContentId;

    @ApiModelProperty("素材Id")
    private String materialGroupId;

    @ApiModelProperty("素材类型")
    private Integer materialType;

    @ApiModelProperty("消息")
    private List<MaterialContentArg> materialContents;

}