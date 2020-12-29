package com.gox.system.domain;

import com.gox.common.annotation.Excel;
import com.gox.common.core.domain.BaseEntity;
import com.gox.common.utils.uuid.SnowflakesTools;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.ibatis.type.Alias;


/**
 * 单json存储对象 form_json
 * @author gox
 * @date 2020-12-25
 */
@Alias(value = "FormJson")
public class FormJson extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    public FormJson() {
        setId(SnowflakesTools.WORKER.nextId());
    }

    /** id */
    private Long id;

    /** 表单名字 */
    @Excel(name = "表单名字")
    private String formName;

    /** 表单json */
    @Excel(name = "表单json")
    private String formData;
    @Excel(name = "所属节点")
    private String node;
    /** 删除标志 */
    private String delFlag;

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFormName(String formName) 
    {
        this.formName = formName;
    }

    public String getFormName() 
    {
        return formName;
    }
    public void setFormData(String formData) 
    {
        this.formData = formData;
    }

    public String getFormData() 
    {
        return formData;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .append("formName", getFormName())
            .append("formData", getFormData())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
