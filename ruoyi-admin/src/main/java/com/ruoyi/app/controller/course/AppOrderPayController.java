package com.ruoyi.app.controller.course;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.course.domain.CourOrder;
import com.ruoyi.course.service.ICourOrderService;
import com.ruoyi.gauge.domain.PsyOrderPay;
import com.ruoyi.gauge.service.IPsyOrderPayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/app/order/pay")
@Api(value = "AppOrderPayController" ,tags = {"通用订单支付api"})
public class AppOrderPayController extends BaseController {

    @Autowired
    private IPsyOrderPayService orderPayService;

    @Autowired
    private ICourOrderService courOrderService;

    /**
     * 根据支付信息生成支付对象
     */
    @PutMapping("/add")
    @ApiOperation("根据支付信息生成支付对象")
    public AjaxResult generateOrderPay(@RequestBody PsyOrderPay orderPay)
    {

        orderPay.setPayStatus(1); // 1表示当前支付对象处于待支付状态
        orderPay.setPayId(UUID.randomUUID().toString()); // 当前使用随机生成的支付ID，后续使用第三方支付平台返回的
        orderPay.setCreateTime(new Date());

        return AjaxResult.success(orderPayService.insertPsyOrderPay(orderPay));
    }

    /**
     * 完成支付
     */
    @PostMapping ("/finish")
    @ApiOperation("完成支付")
    public AjaxResult finishPay(@RequestBody PsyOrderPay orderPay)
    {

        // 修改订单表的订单状态
        CourOrder courOrder = new CourOrder();
        courOrder.setId(orderPay.getOrderId());
        courOrder.setStatus(1); // 1表示订单处于完成状态
        courOrderService.updateCourOrder(courOrder);

        orderPay.setPayStatus(2); // 1表示当前支付对象处于已支付状态
        orderPay.setPayTime(new Date()); // 支付时间

        return AjaxResult.success(orderPayService.updatePsyOrderPay(orderPay));
    }

    /**
     * 取消支付
     */
    @PostMapping ("/cancel")
    @ApiOperation("取消支付")
    public AjaxResult cancelPay(@RequestBody PsyOrderPay orderPay)
    {
        // 修改订单表的订单状态
        CourOrder courOrder = new CourOrder();
        courOrder.setId(orderPay.getOrderId());
        courOrder.setStatus(2); // 2表示订单处于关闭状态
        courOrderService.updateCourOrder(courOrder);

        orderPay.setPayStatus(3); // 3表示当前支付对象处于取消支付状态

        return AjaxResult.success(orderPayService.updatePsyOrderPay(orderPay));
    }
}