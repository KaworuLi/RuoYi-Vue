package com.ruoyi.psychology.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.psychology.constant.ConsultConstant;
import com.ruoyi.psychology.domain.PsyConsultOrderItem;
import com.ruoyi.psychology.mapper.PsyConsultOrderItemMapper;
import com.ruoyi.psychology.service.IPsyConsultOrderItemService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 咨询订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-26
 */
@Service
public class PsyConsultOrderItemServiceImpl extends ServiceImpl<PsyConsultOrderItemMapper, PsyConsultOrderItem> implements IPsyConsultOrderItemService
{

    @Resource
    private PsyConsultOrderItemMapper psyConsultOrderItemMapper;

    @Override
    public void del(Long id) {
        psyConsultOrderItemMapper.deleteById(id);
    }

    @Override
    public void add(PsyConsultOrderItem item) {
        psyConsultOrderItemMapper.insert(item);
    }

    @Override
    public void update(PsyConsultOrderItem item) {
        psyConsultOrderItemMapper.updateById(item);
    }

    @Override
    public PsyConsultOrderItem getOne(Long id) {
        return psyConsultOrderItemMapper.selectById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateBatch(List<PsyConsultOrderItem> entities) {
        return this.saveOrUpdateBatch(entities);
    }

    @Override
    public List<PsyConsultOrderItem> getList(Long orderId) {
        LambdaQueryWrapper<PsyConsultOrderItem> wp = new LambdaQueryWrapper<>();
        wp.eq(PsyConsultOrderItem::getOrderId, orderId);
        wp.between(PsyConsultOrderItem::getStatus, ConsultConstant.ONSULT_ORDER_ITEM_CREATED, ConsultConstant.ONSULT_ORDER_ITEM_FINISHED);
        return psyConsultOrderItemMapper.selectList(wp);
    }

    @Override
    public PsyConsultOrderItem getOneByOrderId(Long orderId) {
        LambdaQueryWrapper<PsyConsultOrderItem> wp = new LambdaQueryWrapper<>();
        wp.eq(PsyConsultOrderItem::getOrderId, orderId);
        wp.eq(PsyConsultOrderItem::getStatus, ConsultConstant.ONSULT_ORDER_ITEM_CREATED);
        List<PsyConsultOrderItem> items = psyConsultOrderItemMapper.selectList(wp);
        return CollectionUtils.isNotEmpty(items) ? items.get(0) : null;
    }
}