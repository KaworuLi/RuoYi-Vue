package com.ruoyi.gauge.mapper;

import com.ruoyi.gauge.domain.PsyConsultantManagement;

import java.util.List;


/**
 * 咨询师管理Mapper接口
 * 
 * @author yangchuang
 * @date 2023-01-29
 */
public interface PsyConsultantManagementMapper 
{
    /**
     * 查询咨询师管理
     * 
     * @param id 咨询师管理主键
     * @return 咨询师管理
     */
    public PsyConsultantManagement selectPsyConsultantManagementById(Integer id);

    /**
     * 查询咨询师管理列表
     * 
     * @param psyConsultantManagement 咨询师管理
     * @return 咨询师管理集合
     */
    public List<PsyConsultantManagement> selectPsyConsultantManagementList(PsyConsultantManagement psyConsultantManagement);

    /**
     * 新增咨询师管理
     * 
     * @param psyConsultantManagement 咨询师管理
     * @return 结果
     */
    public int insertPsyConsultantManagement(PsyConsultantManagement psyConsultantManagement);

    /**
     * 修改咨询师管理
     * 
     * @param psyConsultantManagement 咨询师管理
     * @return 结果
     */
    public int updatePsyConsultantManagement(PsyConsultantManagement psyConsultantManagement);

    /**
     * 删除咨询师管理
     * 
     * @param id 咨询师管理主键
     * @return 结果
     */
    public int deletePsyConsultantManagementById(Integer id);

    /**
     * 批量删除咨询师管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePsyConsultantManagementByIds(Integer[] ids);
}
