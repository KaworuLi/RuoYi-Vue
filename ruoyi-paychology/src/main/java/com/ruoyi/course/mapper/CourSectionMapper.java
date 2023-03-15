package com.ruoyi.course.mapper;

import com.ruoyi.course.domain.CourSection;

import java.util.List;

/**
 * 章节Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-14
 */
public interface CourSectionMapper 
{
    /**
     * 查询章节
     * 
     * @param id 章节主键
     * @return 章节
     */
    public CourSection selectCourSectionById(Long id);

    /**
     * 查询章节列表
     * 
     * @param courSection 章节
     * @return 章节集合
     */
    public List<CourSection> selectCourSectionList(CourSection courSection);

    /**
     * 新增章节
     * 
     * @param courSection 章节
     * @return 结果
     */
    public int insertCourSection(CourSection courSection);

    /**
     * 修改章节
     * 
     * @param courSection 章节
     * @return 结果
     */
    public int updateCourSection(CourSection courSection);

    /**
     * 删除章节
     * 
     * @param id 章节主键
     * @return 结果
     */
    public int deleteCourSectionById(Long id);

    /**
     * 批量删除章节
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourSectionByIds(Long[] ids);
}
