package com.company.project.service.impl;

import com.company.project.dao.PhoneColorMapper;
import com.company.project.model.PhoneColor;
import com.company.project.service.PhoneColorService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/09/17.
 */
@Service
@Transactional
public class PhoneColorServiceImpl extends AbstractService<PhoneColor> implements PhoneColorService {
    @Resource
    private PhoneColorMapper phoneColorMapper;

}
