package com.sf.service.impl;

import com.sf.pojo.Oplog;
import com.sf.mapper.OplogMapper;
import com.sf.service.IOplogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
