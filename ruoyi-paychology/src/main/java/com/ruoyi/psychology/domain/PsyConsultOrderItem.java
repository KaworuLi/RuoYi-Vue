package com.ruoyi.psychology.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BasePlusEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 咨询订单对象 psy_consult_order
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("psy_consult_order_item")
public class PsyConsultOrderItem extends BasePlusEntity implements Serializable
{

    private static final long serialVersionUID = 363008424382081539L;

    /** 订单号 */
    @Excel(name = "订单号")
    private Long orderId;

    /** 排班 */
    @Excel(name = "排班")
    private Long workId;

    private Integer time;

    /** 咨询时段 */
    @Excel(name = "咨询时段")
    private String timeStart;

    /** 咨询时段 */
    @Excel(name = "咨询时段")
    private String timeEnd;

    /** 天 */
    @Excel(name = "天")
    private String day;

    /** 周 */
    @Excel(name = "周")
    private String week;

    @Excel(name = "实际咨询时间")
    private String realTime;

    /** 状态（0待咨询 1咨询完成） */
    @Excel(name = "状态", readConverterExp = "0=待咨询,1=咨询完成")
    private String status;
}