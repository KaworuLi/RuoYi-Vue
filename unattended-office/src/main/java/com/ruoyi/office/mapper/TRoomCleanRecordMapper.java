package com.ruoyi.office.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.ruoyi.office.domain.TRoomCleanRecord;
import com.ruoyi.office.domain.vo.CleanRecordH5Vo;

/**
 * 房间打扫记录Mapper接口
 *
 * @author ruoyi
 * @date 2023-09-30
 */
public interface TRoomCleanRecordMapper extends BaseMapper<TRoomCleanRecord> {
    /**
     * 查询房间打扫记录
     *
     * @param id 房间打扫记录主键
     * @return 房间打扫记录
     */
    public TRoomCleanRecord selectTRoomCleanRecordById(Long id);

    /**
     * 查询房间打扫记录列表
     *
     * @param tRoomCleanRecord 房间打扫记录
     * @return 房间打扫记录集合
     */
    public List<TRoomCleanRecord> selectTRoomCleanRecordList(TRoomCleanRecord tRoomCleanRecord);

    /**
     * 新增房间打扫记录
     *
     * @param tRoomCleanRecord 房间打扫记录
     * @return 结果
     */
    public int insertTRoomCleanRecord(TRoomCleanRecord tRoomCleanRecord);

    /**
     * 修改房间打扫记录
     *
     * @param tRoomCleanRecord 房间打扫记录
     * @return 结果
     */
    public int updateTRoomCleanRecord(TRoomCleanRecord tRoomCleanRecord);

    /**
     * 删除房间打扫记录
     *
     * @param id 房间打扫记录主键
     * @return 结果
     */
    public int deleteTRoomCleanRecordById(Long id);

    /**
     * 批量删除房间打扫记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTRoomCleanRecordByIds(Long[] ids);

    List<CleanRecordH5Vo> selectTRoomCleanRecordH5List(TRoomCleanRecord tRoomCleanRecord);
}