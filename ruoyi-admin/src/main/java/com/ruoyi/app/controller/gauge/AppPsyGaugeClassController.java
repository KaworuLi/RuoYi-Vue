package com.ruoyi.app.controller.gauge;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.gauge.domain.PsyGaugeClass;
import com.ruoyi.gauge.service.IPsyGaugeClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测评分类Controller
 * 
 * @author ruoyi
 * @date 2022-08-30
 */
@RestController
@RequestMapping("/app/gauge/class")
@Api(value = "AppPsyGaugeClassController" ,tags = {"测评分类api"})
public class AppPsyGaugeClassController extends BaseController
{
    @Autowired
    private IPsyGaugeClassService psyGaugeClassService;

    /**
     * 查询测评分类列表
     */
//    @PreAuthorize("@ss.hasPermi('psychology:gaugeClass:list')")
    @GetMapping("/list")
    @ApiOperation("查询测评分类列表")
    public TableDataInfo list(@RequestBody PsyGaugeClass psyGaugeClass)
    {
        startPage();
        List<PsyGaugeClass> list = psyGaugeClassService.selectPsyGaugeClassList(psyGaugeClass);
        return getDataTable(list);
    }


}
