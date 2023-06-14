package com.ruoyi.psychology.service;

import java.util.List;
import com.ruoyi.psychology.domain.PsyConsultant;

/**
 * 心理咨询师Service接口
 * 
 * @author ruoyi
 * @date 2022-08-26
 */
public interface IPsyConsultantService 
{
    /**
     * 查询心理咨询师
     * 
     * @param id 心理咨询师主键
     * @return 心理咨询师
     */
    public PsyConsultant selectPsyConsultantById(Integer id);

    /**
     * 查询心理咨询师列表
     * 
     * @param psyConsultant 心理咨询师
     * @return 心理咨询师集合
     */
    public List<PsyConsultant> selectPsyConsultantList(PsyConsultant psyConsultant);

    /**
     * 新增心理咨询师
     * 
     * @param psyConsultant 心理咨询师
     * @return 结果
     */
    public int insertPsyConsultant(PsyConsultant psyConsultant);

    /**
     * 修改心理咨询师
     * 
     * @param psyConsultant 心理咨询师
     * @return 结果
     */
    public int updatePsyConsultant(PsyConsultant psyConsultant);

    /**
     * 批量删除心理咨询师
     * 
     * @param ids 需要删除的心理咨询师主键集合
     * @return 结果
     */
    public int deletePsyConsultantByIds(Integer[] ids);

    /**
     * 删除心理咨询师信息
     * 
     * @param id 心理咨询师主键
     * @return 结果
     */
    public int deletePsyConsultantById(Integer id);
}
