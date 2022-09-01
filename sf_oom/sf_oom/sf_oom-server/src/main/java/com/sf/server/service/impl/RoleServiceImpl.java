package com.sf.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sf.server.mapper.RoleMapper;
import com.sf.server.pojo.Role;
import com.sf.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shifeng
 * @since 2022-08-31
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
