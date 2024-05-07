package com.ruoyi.system.price.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.price.domain.TPrice;
import com.ruoyi.system.price.service.ITPriceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品价格Controller
 * 
 * @author ruoyi
 * @date 2024-04-19
 */
@RestController
@RequestMapping("/system/price")
public class TPriceController extends BaseController
{
    @Autowired
    private ITPriceService tPriceService;

    /**
     * 查询商品价格列表
     */
    @PreAuthorize("@ss.hasPermi('system:price:list')")
    @GetMapping("/list")
    public TableDataInfo list(TPrice tPrice)
    {
        startPage();
        List<TPrice> list = tPriceService.selectTPriceList(tPrice);
        return getDataTable(list);
    }

    /**
     * 导出商品价格列表
     */
    @PreAuthorize("@ss.hasPermi('system:price:export')")
    @Log(title = "商品价格", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TPrice tPrice)
    {
        List<TPrice> list = tPriceService.selectTPriceList(tPrice);
        ExcelUtil<TPrice> util = new ExcelUtil<TPrice>(TPrice.class);
        util.exportExcel(response, list, "商品价格数据");
    }

    /**
     * 获取商品价格详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:price:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tPriceService.selectTPriceById(id));
    }

    /**
     * 新增商品价格
     */
    @PreAuthorize("@ss.hasPermi('system:price:add')")
    @Log(title = "商品价格", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TPrice tPrice)
    {
        return toAjax(tPriceService.insertTPrice(tPrice));
    }

    /**
     * 修改商品价格
     */
    @PreAuthorize("@ss.hasPermi('system:price:edit')")
    @Log(title = "商品价格", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TPrice tPrice)
    {
        return toAjax(tPriceService.updateTPrice(tPrice));
    }

    /**
     * 删除商品价格
     */
    @PreAuthorize("@ss.hasPermi('system:price:remove')")
    @Log(title = "商品价格", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tPriceService.deleteTPriceByIds(ids));
    }
}
