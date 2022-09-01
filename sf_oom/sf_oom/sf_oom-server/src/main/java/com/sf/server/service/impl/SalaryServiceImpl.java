package com.sf.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sf.server.mapper.SalaryMapper;
import com.sf.server.pojo.Salary;
import com.sf.server.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
