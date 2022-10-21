package com.ruoyi.common.core.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @User hogan
 * @Time 2022/10/21 14:43
 * @e-mail hkcugwh@163.com
 **/
@ApiModel("登录成功返回信息")
@Data
@Builder
public class LoginVO {

    @ApiModelProperty("令牌")
    private String token;
    @ApiModelProperty("头像")
    private String avatar;
    @ApiModelProperty("昵称")
    private String name;

}
