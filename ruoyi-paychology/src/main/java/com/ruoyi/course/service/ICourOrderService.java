package com.ruoyi.course.service;

import com.ruoyi.common.core.domain.dto.LoginDTO;
import com.ruoyi.course.domain.CourOrder;
import com.ruoyi.course.vo.OrderVO;

import java.util.List;

/**
 * 课程订单Service接口
 * 
 * @author ruoyi
 * @date 2023-03-17
 */
public interface ICourOrderService 
{
    /**
     * 查询课程订单
     * 
     * @param id 课程订单主键
     * @return 课程订单
     */
    public CourOrder selectCourOrderById(Integer id);

    /**
     * 查询课程订单
     *
     * @param orderId 课程订单主键
     * @return 课程订单
     */
    public CourOrder selectCourOrderByOrderId(String orderId);

    /**
     * 查询课程订单列表
     * 
     * @param courOrder 课程订单
     * @return 课程订单集合
     */
    public List<CourOrder> selectCourOrderList(CourOrder courOrder);

    /**
     * 新增课程订单
     * 
     * @param courOrder 课程订单
     * @return 结果
     */
    public int insertCourOrder(CourOrder courOrder);

    /**
     * 修改课程订单
     * 
     * @param courOrder 课程订单
     * @return 结果
     */
    public int updateCourOrder(CourOrder courOrder);

    /**
     * 批量删除课程订单
     * 
     * @param ids 需要删除的课程订单主键集合
     * @return 结果
     */
    public int deleteCourOrderByIds(Integer[] ids);

    /**
     * 删除课程订单信息
     * 
     * @param id 课程订单主键
     * @return 结果
     */
    public int deleteCourOrderById(Integer id);

    /**
     * c查询用户是否购买该课程
     *
     * @param userId 用户ID
     * @param courseId 课程订单主键
     * @return 结果
     */
    public List<CourOrder> selectCourOrderByUser(Integer userId, Integer courseId);


    /**
     * 根据订单编号查询课程订单详情
     *
     * @param orderId 课程订单编号
     * @return 课程订单详情
     */
    OrderVO getOrderDetailByOrderId(Integer orderId);


    /**
     * 生成课程订单
     *
     * @param courOrder 课程订单
     * @return 生成的订单对象
     */
    public CourOrder generateCourOrder(CourOrder courOrder);

}