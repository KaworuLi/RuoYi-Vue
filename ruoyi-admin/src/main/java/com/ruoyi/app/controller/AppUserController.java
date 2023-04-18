package com.ruoyi.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.biz.token.LoginUser;
import com.ruoyi.system.biz.token.TokenAuthorize;
import com.ruoyi.system.biz.token.WechatTokenServiceImpl;
import com.ruoyi.system.domain.DataWechatUser;
import com.ruoyi.system.service.IDataWechatUserService;
import com.ruoyi.system.service.impl.ProdOpenApi;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户信息相关接口Controller
 *
 * @author genius
 * @date 2021-07-13
 */
@RestController
@Api(value = "用户接口")
@RequestMapping("/mini/user")
public class AppUserController extends BaseController {

    @Autowired
    private WechatTokenServiceImpl tokenService;

    @Autowired
    private IDataWechatUserService userService;

    @Autowired
    private ProdOpenApi prodOpenApi;

    /**
     * 登录
     *
     * @param code
     * @return
     */
    @GetMapping("/login")
    public AjaxResult login(String code) {
        LoginUser result = userService.login(code);
        return AjaxResult.success(result);
    }

    /**
     * 注册
     *
     * @param user
     * @return
     */
    @PostMapping("/register")
    public AjaxResult register(@Validated @RequestBody DataWechatUser user) {
        LoginUser result = userService.register(user);
        return AjaxResult.success(result);
    }

    /**
     * 注销
     *
     * @return
     */
    @TokenAuthorize
    @GetMapping("/logout")
    public AjaxResult logout() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String token = tokenService.getToken(request);
        userService.loginOut(token);
        return AjaxResult.success();
    }

    @TokenAuthorize
    @GetMapping(value = "/getUser")
    public AjaxResult getUser() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        long userId = (long) request.getAttribute("userId");
        DataWechatUser user = userService.selectDataWechatUserById(userId);

        String userJson = JSONObject.toJSONString(user);
        return AjaxResult.success((Object) userJson);
    }

    /**
     * App 端使用
     */
    @TokenAuthorize
    @PutMapping(value="/edit")
    public AjaxResult editUser(@RequestBody DataWechatUser pbaUser)
    {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        long userId = (long) request.getAttribute("userId");
        pbaUser.setUserId(userId);
        return toAjax(userService.updateDataWechatUser(pbaUser));
    }

    /**
     * 微信小程序企业入驻
     * @return
     */
    @TokenAuthorize
    @PostMapping("/comUserReg")
    public AjaxResult comUserReg() {

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        long userId = (long) request.getAttribute("userId");
        DataWechatUser user = userService.selectDataWechatUserById(userId);

        if (user != null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("USER_NAME",user.getCompanyName());
            jsonObject.put("USER_IDCARD",user.getTyshxydm());
            jsonObject.put("LEGALPERSON_IDCARD",user.getLegalPersonIdcard());
            jsonObject.put("LEGALPERSON_NAME",user.getLegalPersonName());
            jsonObject.put("USER_MOBILE",user.getLegalPersonPhone());
            jsonObject.put("LEGALPERSON_JBRIDCARD",user.getJbrIdcard());
            jsonObject.put("LEGALPERSON_JBRNAME",user.getJbrName());
            jsonObject.put("USER_TYPE",2);// 设置为法人用户
            // jsonObject.put("",user.getJbrPhone()); // 入驻接口不要求经办人手机号码

            return prodOpenApi.comUserReg(jsonObject);
        }else {
            return AjaxResult.error("获取用户信息失败");
        }
    }

}
