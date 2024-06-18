package com.ruoyi.system.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusPostOrderMapper;
import com.ruoyi.system.domain.BusPostOrder;
import com.ruoyi.system.service.IBusPostOrderService;

/**
 * 订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-06-18
 */
@Service
public class BusPostOrderServiceImpl implements IBusPostOrderService 
{
    @Autowired
    private BusPostOrderMapper busPostOrderMapper;

    /**
     * 查询订单
     * 
     * @param orderId 订单主键
     * @return 订单
     */
    @Override
    public BusPostOrder selectBusPostOrderByOrderId(Long orderId)
    {
        return busPostOrderMapper.selectBusPostOrderByOrderId(orderId);
    }

    /**
     * 查询订单列表
     * 
     * @param busPostOrder 订单
     * @return 订单
     */
    @Override
    public List<BusPostOrder> selectBusPostOrderList(BusPostOrder busPostOrder)
    {
        return busPostOrderMapper.selectBusPostOrderList(busPostOrder);
    }

    /**
     * 新增订单
     * 
     * @param busPostOrder 订单
     * @return 结果
     */
    @Override
    public int insertBusPostOrder(BusPostOrder busPostOrder)
    {
        busPostOrder.setCreatedAt(new Date());
        busPostOrder.setUpdatedAt(new Date());
        return busPostOrderMapper.insertBusPostOrder(busPostOrder);
    }

    /**
     * 修改订单
     * 
     * @param busPostOrder 订单
     * @return 结果
     */
    @Override
    public int updateBusPostOrder(BusPostOrder busPostOrder)
    {
        return busPostOrderMapper.updateBusPostOrder(busPostOrder);
    }

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteBusPostOrderByOrderIds(Long[] orderIds)
    {
        return busPostOrderMapper.deleteBusPostOrderByOrderIds(orderIds);
    }

    /**
     * 删除订单信息
     * 
     * @param orderId 订单主键
     * @return 结果
     */
    @Override
    public int deleteBusPostOrderByOrderId(Long orderId)
    {
        return busPostOrderMapper.deleteBusPostOrderByOrderId(orderId);
    }

    /**
     * 发布订单
     * @param busPostOrder
     */
    @Override
    public void postOrder(BusPostOrder busPostOrder) {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        busPostOrder.setMerchantId(user.getUserId());

    }
}
