package com.ruoyi.app.controller.wechat.constant;

/**
 * 微信相关接口请求地址
 */
public class WechatUrlConstants {
 
    //小程序code获取openid
    public final static String CODE_2_SESSION = "https://api.weixin.qq.com/sns/jscode2session";
 
    //微信支付v3 jsapi下单
    public final static String PAY_V3_JSAPI = "https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi";
 
    //微信支付v3 申请退款
    public final static String PAY_V3_REFUND = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds";
 
    //微信支付v3 通过商户订单号查询订单
    public final static String PAY_V3_QUERY_OUT = "https://api.mch.weixin.qq.com/v3/pay/transactions/out-trade-no/%s?mchid=%s";
 
    //微信支付v3 查询单笔退款
    public final static String PAY_V3_QUERY_REFUND = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds/%s";
 
    //微信支付v2 支付通知接口地址
    public final static String PAY_V2_NOTIFY = "https://xxx.com/api/wechatPay/wechatPayNotify";
 
    //微信支付v2 退款通知接口地址
    public final static String PAY_V2_REFUND_NOTIFY = "https://xxx.com/api/wechatPay/wechatRefundNotify";
 
    //微信支付v3 支付通知接口地址
    public final static String PAY_V3_NOTIFY = "https://wx.ssgpsy.com/app/api/wechatPay/v3/wechatPayNotify";
 
    //微信支付v3 退款通知接口地址
    public final static String PAY_V3_REFUND_NOTIFY = "https://wx.ssgpsy.com/app/api/wechatPay/v3/wechatRefundNotify";
}