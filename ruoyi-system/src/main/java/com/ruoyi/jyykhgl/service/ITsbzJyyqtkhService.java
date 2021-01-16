package com.ruoyi.jyykhgl.service;

import java.util.List;

import com.ruoyi.jyykhgl.domain.TsbzJyyqtkh;

/**
 * 其他考核（教研员）Service接口
 *
 * @author tsbz
 * @date 2021-01-16
 */
public interface ITsbzJyyqtkhService {
    /**
     * 查询其他考核（教研员）
     *
     * @param id 其他考核（教研员）ID
     * @return 其他考核（教研员）
     */
    public TsbzJyyqtkh selectTsbzJyyqtkhById(Long id);

    /**
     * 查询其他考核（教研员）列表
     *
     * @param tsbzJyyqtkh 其他考核（教研员）
     * @return 其他考核（教研员）集合
     */
    public List<TsbzJyyqtkh> selectTsbzJyyqtkhList(TsbzJyyqtkh tsbzJyyqtkh);

    /**
     * 新增其他考核（教研员）
     *
     * @param tsbzJyyqtkh 其他考核（教研员）
     * @return 结果
     */
    public int insertTsbzJyyqtkh(TsbzJyyqtkh tsbzJyyqtkh);

    /**
     * 修改其他考核（教研员）
     *
     * @param tsbzJyyqtkh 其他考核（教研员）
     * @return 结果
     */
    public int updateTsbzJyyqtkh(TsbzJyyqtkh tsbzJyyqtkh);

    /**
     * 批量删除其他考核（教研员）
     *
     * @param ids 需要删除的其他考核（教研员）ID
     * @return 结果
     */
    public int deleteTsbzJyyqtkhByIds(Long[] ids);

    /**
     * 删除其他考核（教研员）信息
     *
     * @param id 其他考核（教研员）ID
     * @return 结果
     */
    public int deleteTsbzJyyqtkhById(Long id);
}
