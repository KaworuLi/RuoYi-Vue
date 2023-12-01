package com.ruoyi.psychology.vo;

import com.ruoyi.common.core.domain.BaseValObj;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 咨询服务对象 psy_consult
 *
 * @author ruoyi
 * @date 2023-06-25
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PsyConsultVO extends BaseValObj implements Serializable
{
    private static final long serialVersionUID = 5172540262606370812L;

    /** 登录名 */
    private Long userId;

    /** 登录名 */
    private String userName;
    private String nickName;

    /** 头像 */
    private String avatar;
    private String img;

    /** 用户邮箱 */
    private String email;

    /** 手机号码 */
    private String phonenumber;

    /** 用户性别（0男 1女 2未知） */
    private String sex;

    /** 标签 */
    private String tabs;

    /** 咨询方向 */
    private String way;
    private String wayStr;

    /** 介绍文案 */
    private String info;

    /** 图文详情 */
    private String detail;

    /** 服务数量 */
    private Integer serve;

    /** 咨询人数 */
    private Integer workNum;

    /** 服务时长 */
    private Integer workTime;

    /** 从业时间 */
    private Integer workHours;

    /** 企业微信名片 */
    private String wxCard;

    /** 咨询寄语 */
    private String zxWord;

    /** 咨询风格 */
    private String zxStyle;

    /** 咨询须知 */
    private String notice;

    /** 受训经历 */
    private String experience;

    /** 执业资格 */
    private String qualification;

    /** 咨询方式 */
    private String mode;

    /** 城市 */
    private String city;

    /** 省份 */
    private String province;

    private String openId;

    private String share;

    /** 咨询流派 */
    private String genre;

    /** 首页展示的执业资格 */
    private String indexQualification;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    /** 状态（0正常 1停用） */
    private String status;

    private String lang;
    
}