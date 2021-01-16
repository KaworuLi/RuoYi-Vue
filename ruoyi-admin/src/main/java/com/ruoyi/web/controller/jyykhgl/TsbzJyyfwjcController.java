package com.ruoyi.web.controller.jyykhgl;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.jyykhgl.domain.TsbzJyyfwjc;
import com.ruoyi.jyykhgl.service.ITsbzJyyfwjcService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 服务基层（教研员）Controller
 *
 * @author tsbz
 * @date 2021-01-16
 */
@RestController
@RequestMapping("/jyykhgl/jyyfwjc")
public class TsbzJyyfwjcController extends BaseController {
    @Autowired
    private ITsbzJyyfwjcService tsbzJyyfwjcService;

    /**
     * 查询服务基层（教研员）列表
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:list')")
    @GetMapping("/list")
    public TableDataInfo list(TsbzJyyfwjc tsbzJyyfwjc) {
        startPage();
        List<TsbzJyyfwjc> list = tsbzJyyfwjcService.selectTsbzJyyfwjcList(tsbzJyyfwjc);
        return getDataTable(list);
    }

    /**
     * 导出服务基层（教研员）列表
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:export')")
    @Log(title = "服务基层（教研员）", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TsbzJyyfwjc tsbzJyyfwjc) {
        List<TsbzJyyfwjc> list = tsbzJyyfwjcService.selectTsbzJyyfwjcList(tsbzJyyfwjc);
        ExcelUtil<TsbzJyyfwjc> util = new ExcelUtil<TsbzJyyfwjc>(TsbzJyyfwjc.class);
        return util.exportExcel(list, "jyyfwjc");
    }

    /**
     * 获取服务基层（教研员）详细信息
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(tsbzJyyfwjcService.selectTsbzJyyfwjcById(id));
    }

    /**
     * 新增服务基层（教研员）
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:add')")
    @Log(title = "服务基层（教研员）", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TsbzJyyfwjc tsbzJyyfwjc) {
        return toAjax(tsbzJyyfwjcService.insertTsbzJyyfwjc(tsbzJyyfwjc));
    }

    /**
     * 修改服务基层（教研员）
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:edit')")
    @Log(title = "服务基层（教研员）", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TsbzJyyfwjc tsbzJyyfwjc) {
        return toAjax(tsbzJyyfwjcService.updateTsbzJyyfwjc(tsbzJyyfwjc));
    }

    /**
     * 删除服务基层（教研员）
     */
    @PreAuthorize("@ss.hasPermi('jyykhgl:jyyfwjc:remove')")
    @Log(title = "服务基层（教研员）", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(tsbzJyyfwjcService.deleteTsbzJyyfwjcByIds(ids));
    }
}
