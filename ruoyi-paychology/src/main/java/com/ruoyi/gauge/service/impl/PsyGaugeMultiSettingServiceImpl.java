package com.ruoyi.gauge.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.gauge.mapper.PsyGaugeMultiSettingMapper;
import com.ruoyi.gauge.domain.PsyGaugeMultiSetting;
import com.ruoyi.gauge.service.IPsyGaugeMultiSettingService;

/**
 * 心理测评多维设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-10
 */
@Service
public class PsyGaugeMultiSettingServiceImpl implements IPsyGaugeMultiSettingService 
{
    @Autowired
    private PsyGaugeMultiSettingMapper psyGaugeMultiSettingMapper;

    /**
     * 查询心理测评多维设置
     * 
     * @param id 心理测评多维设置主键
     * @return 心理测评多维设置
     */
    @Override
    public PsyGaugeMultiSetting selectPsyGaugeMultiSettingById(Integer id)
    {
        return psyGaugeMultiSettingMapper.selectPsyGaugeMultiSettingById(id);
    }

    /**
     * 查询心理测评多维设置列表
     * 
     * @param psyGaugeMultiSetting 心理测评多维设置
     * @return 心理测评多维设置
     */
    @Override
    public List<PsyGaugeMultiSetting> selectPsyGaugeMultiSettingList(PsyGaugeMultiSetting psyGaugeMultiSetting)
    {
        return psyGaugeMultiSettingMapper.selectPsyGaugeMultiSettingList(psyGaugeMultiSetting);
    }

    /**
     * 新增心理测评多维设置
     * 
     * @param psyGaugeMultiSetting 心理测评多维设置
     * @return 结果
     */
    @Override
    public int insertPsyGaugeMultiSetting(PsyGaugeMultiSetting psyGaugeMultiSetting)
    {
        return psyGaugeMultiSettingMapper.insertPsyGaugeMultiSetting(psyGaugeMultiSetting);
    }

    /**
     * 修改心理测评多维设置
     * 
     * @param psyGaugeMultiSetting 心理测评多维设置
     * @return 结果
     */
    @Override
    public int updatePsyGaugeMultiSetting(PsyGaugeMultiSetting psyGaugeMultiSetting)
    {
        return psyGaugeMultiSettingMapper.updatePsyGaugeMultiSetting(psyGaugeMultiSetting);
    }

    /**
     * 批量删除心理测评多维设置
     * 
     * @param ids 需要删除的心理测评多维设置主键
     * @return 结果
     */
    @Override
    public int deletePsyGaugeMultiSettingByIds(Integer[] ids)
    {
        return psyGaugeMultiSettingMapper.deletePsyGaugeMultiSettingByIds(ids);
    }

    /**
     * 删除心理测评多维设置信息
     * 
     * @param id 心理测评多维设置主键
     * @return 结果
     */
    @Override
    public int deletePsyGaugeMultiSettingById(Integer id)
    {
        return psyGaugeMultiSettingMapper.deletePsyGaugeMultiSettingById(id);
    }
}
