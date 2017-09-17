package com.company.project.service.impl;

import com.company.project.dao.PhoneModelMapper;
import com.company.project.model.PhoneModel;
import com.company.project.service.PhoneModelService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/17.
 */
@Service
@Transactional
public class PhoneModelServiceImpl extends AbstractService<PhoneModel> implements PhoneModelService {
    @Resource
    private PhoneModelMapper phoneModelMapper;

}
