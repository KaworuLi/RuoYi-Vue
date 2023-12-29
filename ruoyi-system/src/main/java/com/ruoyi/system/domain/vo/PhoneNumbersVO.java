package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Jing.Zhang
 */
@Data
public class PhoneNumbersVO {

    @ApiModelProperty("手机号码列表")
    private List<String> phoneNumbers;

}