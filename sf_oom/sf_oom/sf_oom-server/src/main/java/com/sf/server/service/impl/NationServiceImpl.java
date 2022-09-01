package com.sf.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sf.server.mapper.NationMapper;
import com.sf.server.pojo.Nation;
import com.sf.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
