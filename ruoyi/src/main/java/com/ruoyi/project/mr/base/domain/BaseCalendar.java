package com.ruoyi.project.mr.base.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 考勤日历对象 base_calendar
 *
 * @author mr
 * @date 2020-01-07
 */
public class BaseCalendar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** UUID */
    private String id;

    /** 日历代码 */
    @Excel(name = "日历代码")
    private String codeid;

    /** 日历简称 */
    @Excel(name = "日历简称")
    private String name;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String enabled;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setCodeid(String codeid)
    {
        this.codeid = codeid;
    }

    public String getCodeid()
    {
        return codeid;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setEnabled(String enabled)
    {
        this.enabled = enabled;
    }

    public String getEnabled()
    {
        return enabled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("codeid", getCodeid())
            .append("name", getName())
            .append("enabled", getEnabled())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
