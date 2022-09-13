package com.sf.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sf.server.pojo.Admin;
import com.sf.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author shifeng
 * @since 2022-08-31
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
