package com.jjpt.business.service;

import java.util.List;
import com.jjpt.business.domain.ElUserExam;

/**
 * 考试记录Service接口
 * 
 * @author 卢亚峰
 * @date 2024-05-22
 */
public interface IElUserExamService 
{
    /**
     * 查询考试记录
     * 
     * @param id 考试记录主键
     * @return 考试记录
     */
    public ElUserExam selectElUserExamById(String id);

    /**
     * 查询考试记录列表
     * 
     * @param elUserExam 考试记录
     * @return 考试记录集合
     */
    public List<ElUserExam> selectElUserExamList(ElUserExam elUserExam);

    /**
     * 新增考试记录
     * 
     * @param elUserExam 考试记录
     * @return 结果
     */
    public int insertElUserExam(ElUserExam elUserExam);

    /**
     * 修改考试记录
     * 
     * @param elUserExam 考试记录
     * @return 结果
     */
    public int updateElUserExam(ElUserExam elUserExam);

    /**
     * 批量删除考试记录
     * 
     * @param ids 需要删除的考试记录主键集合
     * @return 结果
     */
    public int deleteElUserExamByIds(String[] ids);

    /**
     * 删除考试记录信息
     * 
     * @param id 考试记录主键
     * @return 结果
     */
    public int deleteElUserExamById(String id);

    void joinResult(Long userId, String examId, int objScore, boolean b);
}