package com.ruoyi.common.core.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @User hogan
 * @Time 2022/11/1 14:37
 * @e-mail hkcugwh@163.com
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("量表提交结果入参")
public class GaugeCommitResultDTO {

    @ApiModelProperty("订单id")
    @NotNull(message = "订单id不能为空")
    private Integer orderId;

    @ApiModelProperty("用户id")
    private Integer userId;


}