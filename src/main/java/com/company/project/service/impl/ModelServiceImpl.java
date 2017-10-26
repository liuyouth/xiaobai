package com.company.project.service.impl;

import com.company.project.dao.ModelMapper;
import com.company.project.model.Model;
import com.company.project.service.ModelService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/10/26.
 */
@Service
@Transactional
public class ModelServiceImpl extends AbstractService<Model> implements ModelService {
    @Resource
    private ModelMapper modelMapper;

}
