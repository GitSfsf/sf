package com.sf.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sf.server.pojo.Admin;
<<<<<<< HEAD
import com.sf.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 服务类
=======

/**
 * <p>
 *  服务类
>>>>>>> cb36043f543949fb70f6a7ef578812202b138ff6
 * </p>
 *
 * @author shifeng
 * @since 2022-08-31
 */
public interface IAdminService extends IService<Admin> {
<<<<<<< HEAD
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
=======

>>>>>>> cb36043f543949fb70f6a7ef578812202b138ff6
}
