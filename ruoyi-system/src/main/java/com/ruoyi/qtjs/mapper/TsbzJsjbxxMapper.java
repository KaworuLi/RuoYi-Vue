package com.ruoyi.qtjs.mapper;

import java.util.List;

import com.ruoyi.qtjs.domain.TsbzJsjbxx;

/**
 * 教师基本信息Mapper接口
 *
 * @author ruoyi
 * @date 2020-09-14
 */
public interface TsbzJsjbxxMapper {
    /**
     * 查询教师基本信息
     *
     * @param id 教师基本信息ID
     * @return 教师基本信息
     */
    public TsbzJsjbxx selectTsbzJsjbxxById(String id);

    /**
     * 查询教师基本信息列表
     *
     * @param tsbzJsjbxx 教师基本信息
     * @return 教师基本信息集合
     */
    public List<TsbzJsjbxx> selectTsbzJsjbxxList(TsbzJsjbxx tsbzJsjbxx);

    /**
     * 新增教师基本信息
     *
     * @param tsbzJsjbxx 教师基本信息
     * @return 结果
     */
    public int insertTsbzJsjbxx(TsbzJsjbxx tsbzJsjbxx);

    /**
     * 修改教师基本信息
     *
     * @param tsbzJsjbxx 教师基本信息
     * @return 结果
     */
    public int updateTsbzJsjbxx(TsbzJsjbxx tsbzJsjbxx);

    /**
     * 删除教师基本信息
     *
     * @param id 教师基本信息ID
     * @return 结果
     */
    public int deleteTsbzJsjbxxById(String id);

    /**
     * 批量删除教师基本信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTsbzJsjbxxByIds(String[] ids);
}
