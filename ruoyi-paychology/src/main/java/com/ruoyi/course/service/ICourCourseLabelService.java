package com.ruoyi.course.service;

import java.util.List;
import com.ruoyi.course.domain.CourCourseLabel;

/**
 * labelService接口
 * 
 * @author ruoyi
 * @date 2023-03-16
 */
public interface ICourCourseLabelService 
{
    /**
     * 查询label
     * 
     * @param id label主键
     * @return label
     */
    public CourCourseLabel selectCourCourseLabelById(Integer id);

    /**
     * 查询label列表
     * 
     * @param courCourseLabel label
     * @return label集合
     */
    public List<CourCourseLabel> selectCourCourseLabelList(CourCourseLabel courCourseLabel);

    /**
     * 新增label
     * 
     * @param courCourseLabel label
     * @return 结果
     */
    public int insertCourCourseLabel(CourCourseLabel courCourseLabel);

    /**
     * 修改label
     * 
     * @param courCourseLabel label
     * @return 结果
     */
    public int updateCourCourseLabel(CourCourseLabel courCourseLabel);

    /**
     * 批量删除label
     * 
     * @param ids 需要删除的label主键集合
     * @return 结果
     */
    public int deleteCourCourseLabelByIds(Integer[] ids);

    /**
     * 删除label信息
     * 
     * @param id label主键
     * @return 结果
     */
    public int deleteCourCourseLabelById(Integer id);
}