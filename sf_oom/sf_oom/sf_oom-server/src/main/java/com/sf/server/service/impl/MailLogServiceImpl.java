package com.sf.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sf.server.mapper.MailLogMapper;
import com.sf.server.pojo.MailLog;
import com.sf.server.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
