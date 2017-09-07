package com.company.project.service.impl;

import com.company.project.dao.PhoneLogMapper;
import com.company.project.model.Phone;
import com.company.project.model.PhoneLog;
import com.company.project.service.PhoneLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/06.
 */
@Service
@Transactional
public class PhoneLogServiceImpl extends AbstractService<PhoneLog> implements PhoneLogService {
    @Resource
    private PhoneLogMapper phoneLogMapper;
    @Override
    public void add(PhoneLog phoneLog) {
        phoneLogMapper.add(phoneLog);
    }
}
