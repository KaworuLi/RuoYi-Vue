package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.BusOrderAssignments;
import com.ruoyi.system.domain.BusPostOrder;
import com.ruoyi.system.service.BusOrderAssignmentsExtraService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Description:
 * Copyright:   Copyright (c)2024
 * Company:
 *
 * @author: 张李鑫
 * @version: 1.0
 * Create at:   2024-06-19 15:55:50
 * <p>
 * Modification History:
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2024-06-19     张李鑫                     1.0         1.0 Version
 */
@Primary
@Service("BusOrderAssignmentsExtraServiceImpl")
public class BusOrderAssignmentsExtraServiceImpl extends BusOrderAssignmentsServiceImpl implements BusOrderAssignmentsExtraService {
    /**
     * 在生成订单的时候同时生成接单数据 行锁保证线程安全
     * @param busPostOrder
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createByOrder(BusPostOrder busPostOrder) {
        BusOrderAssignments busOrderAssignments = new BusOrderAssignments();
        busOrderAssignments.setOrderId(busOrderAssignments.getOrderId());
        return 0;
    }


    @Override
    public int insertBusOrderAssignments(BusOrderAssignments busOrderAssignments) {
        busOrderAssignments.setCreatedAt(new Date());
        busOrderAssignments.setCreateTime(new Date());
        return super.insertBusOrderAssignments(busOrderAssignments);
    }

    @Override
    public int updateBusOrderAssignments(BusOrderAssignments busOrderAssignments) {
        busOrderAssignments.setCreateTime(new Date());
        return super.updateBusOrderAssignments(busOrderAssignments);
    }
}