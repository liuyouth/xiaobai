package com.company.project.service.impl;

import com.company.project.dao.BusinessMapper;
import com.company.project.model.Business;
import com.company.project.service.BusinessService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/11/01.
 */
@Service
@Transactional
public class BusinessServiceImpl extends AbstractService<Business> implements BusinessService {
    @Resource
    private BusinessMapper businessMapper;

    @Override
    public List<Business> findAllRely(){
        return businessMapper.findAllRely();
    }
}
