package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * @Author : XGF（徐桂烽）
 * @create 2023/12/26/026 10:08
 * @Description :
 */
@Data
public class QueryAmountDetailPageVO {
    @ApiModelProperty("主键ID")
    private String detailId;

    @ApiModelProperty("商家ID")
    private String merchantId;

    @ApiModelProperty("操作类型 1-划拨 2-消费 3-退款 4-扣款 5-回收")
    private Integer operationType;

    @ApiModelProperty("资金变动前")
    private Double changeBefore;

    @ApiModelProperty("变动金额")
    private Double changeAmount;

    @ApiModelProperty("资金变动后")
    private Double changeAfter;

    @ApiModelProperty("资金类型 1-支出 2-收入")
    private Integer amountType;

    @ApiModelProperty("订单编号")
    private String orderId;

    @ApiModelProperty("描述")
    private String describe;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date modifyTime;

    public Double getChangeBefore() {
        if (changeBefore == null) {
            return 0d;
        }
        return BigDecimal.valueOf(changeBefore).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).doubleValue();
    }

    public Double getChangeAmount() {
        if (changeAmount == null) {
            return 0d;
        }
        return BigDecimal.valueOf(changeAmount).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).doubleValue();
    }

    public Double getChangeAfter() {
        if (changeAfter == null) {
            return 0d;
        }
        return BigDecimal.valueOf(changeAfter).divide(BigDecimal.valueOf(100L), 2, RoundingMode.HALF_UP).doubleValue();
    }
}
