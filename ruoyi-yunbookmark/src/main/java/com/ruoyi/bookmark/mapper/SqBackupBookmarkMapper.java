package com.ruoyi.bookmark.mapper;

import java.util.List;
import com.ruoyi.bookmark.domain.SqBackupBookmark;
import com.ruoyi.bookmark.domain.SqBookmark;
import com.ruoyi.common.mybatisMapper.MyMapper;

/**
 * 备份书签Mapper接口
 *
 * @author ruoyi
 * @date 2021-11-22
 */
public interface SqBackupBookmarkMapper extends MyMapper<SqBackupBookmarkMapper>
{
    /**
     * 查询备份书签
     *
     * @param id 备份书签ID
     * @return 备份书签
     */
    public SqBackupBookmark selectSqBackupBookmarkById(Long id);

    /**
     * 查询备份书签列表
     *
     * @param sqBackupBookmark 备份书签
     * @return 备份书签集合
     */
    public List<SqBackupBookmark> selectSqBackupBookmarkList(SqBackupBookmark sqBackupBookmark);

    /**
     * 新增备份书签
     *
     * @param sqBackupBookmark 备份书签
     * @return 结果
     */
    public int insertSqBackupBookmark(SqBackupBookmark sqBackupBookmark);

    /**
     * 修改备份书签
     *
     * @param sqBackupBookmark 备份书签
     * @return 结果
     */
    public int updateSqBackupBookmark(SqBackupBookmark sqBackupBookmark);

    /**
     * 删除备份书签
     *
     * @param id 备份书签ID
     * @return 结果
     */
    public int deleteSqBackupBookmarkById(Long id);

    /**
     * 批量删除备份书签
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSqBackupBookmarkByIds(Long[] ids);
}
