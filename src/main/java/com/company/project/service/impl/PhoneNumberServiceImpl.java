package com.company.project.service.impl;

import com.company.project.dao.PhoneNumberMapper;
import com.company.project.model.PhoneNumber;
import com.company.project.service.PhoneNumberService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/01/16.
 */
@Service
@Transactional
public class PhoneNumberServiceImpl extends AbstractService<PhoneNumber> implements PhoneNumberService {
    @Resource
    private PhoneNumberMapper phoneNumberMapper;

    @Override
    public List<PhoneNumber> findAllRely(){
        return phoneNumberMapper.findAllRely();
    }
}
