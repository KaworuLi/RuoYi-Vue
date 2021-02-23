package com.ruoyi.business.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.business.domain.BusCbsxx;
import com.ruoyi.business.domain.vo.BusCbsxxSaveVO;
import com.ruoyi.business.domain.vo.BusCbsxxVO;
import com.ruoyi.business.service.IBusCbsxxService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;

import io.swagger.annotations.ApiOperation;

/**
 * 承包商信息Controller
 * 
 * @author yaowei
 * @date 2021-02-21
 */
@RestController
@RequestMapping("/business/cbsxx")
public class BusCbsxxController extends BaseController {
	@Autowired
	private IBusCbsxxService busCbsxxService;

	/**
	 * 查询承包商信息列表
	 * 
	 * @param busCbsxx
	 *            查询条件
	 * @param year
	 *            承包年份
	 * @return
	 */
	@ApiOperation("承包商列表信息")
	@GetMapping("/list")
	public TableDataInfo list(BusCbsxx busCbsxx, String year) {
		startPage();
		List<BusCbsxxVO> list = busCbsxxService.selectBusCbsxxList(busCbsxx, year);
		return getDataTable(list);
	}

	/**
	 * 根据承包商ID获取承包商详情
	 * 
	 * @param id
	 *            承包商ID
	 * @param year
	 *            承包年份
	 * @return
	 */
	@ApiOperation("根据承包商ID获取承包商详情")
	@GetMapping(value = "/{id}")
	public AjaxResult getInfo(@PathVariable("id") Long id, String year) {
		return AjaxResult.success(busCbsxxService.selectBusCbsxxById(id, year));
	}

	/**
	 * 新增承包商信息
	 * 
	 * @throws IOException
	 */
	@ApiOperation("新增/修改承包商")
	@Log(title = "承包商信息", businessType = BusinessType.UPDATE)
	@PostMapping
	public AjaxResult add(@RequestBody BusCbsxxSaveVO busCbsxxSaveVO) throws IOException {
		Long id = busCbsxxSaveVO.getId();
		BusCbsxx busCbsxx = busCbsxxService.selectById(id);
		if (busCbsxx == null) {
			return toAjax(busCbsxxService.insertBusCbsxx(busCbsxxSaveVO));
		} else {
			return toAjax(busCbsxxService.updateBusCbsxx(busCbsxxSaveVO));
		}
	}

	/**
	 * 删除承包商信息
	 */
	@Log(title = "承包商信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable Long[] ids) {
		return toAjax(busCbsxxService.deleteBusCbsxxByIds(ids));
	}
}
