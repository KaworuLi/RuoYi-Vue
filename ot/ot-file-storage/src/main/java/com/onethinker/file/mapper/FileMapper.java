package com.onethinker.file.mapper;

import java.util.List;

import com.onethinker.common.enums.FileRealtionStatusEnum;
import com.onethinker.file.domain.FileInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 文件信息Mapper接口
 *
 * @author yangyouqi
 * @date 2024-05-18
 */
public interface FileMapper extends BaseMapper<FileInfo> {
    /**
     * 查询文件信息
     *
     * @param id 文件信息主键
     * @return 文件信息
     */
    public FileInfo selectFileById(String id);

    /**
     * 查询文件信息列表
     *
     * @param file 文件信息
     * @return 文件信息集合
     */
    public List<FileInfo> selectFileList(FileInfo file);

    /**
     * 新增文件信息
     *
     * @param file 文件信息
     * @return 结果
     */
    public int insertFile(FileInfo file);

    /**
     * 修改文件信息
     *
     * @param file 文件信息
     * @return 结果
     */
    public int updateFile(FileInfo file);

    /**
     * 删除文件信息
     *
     * @param id 文件信息主键
     * @return 结果
     */
    public int deleteFileById(String id);

    /**
     * 批量删除文件信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFileByIds(String[] ids);
}
