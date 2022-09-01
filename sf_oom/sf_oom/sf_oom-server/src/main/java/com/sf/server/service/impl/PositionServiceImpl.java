package com.sf.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sf.server.mapper.PositionMapper;
import com.sf.server.pojo.Position;
import com.sf.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
