package com.company.project.service.impl;

import com.company.project.dao.ParameterMapper;
import com.company.project.model.Parameter;
import com.company.project.service.ParameterService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/11/03.
 */
@Service
@Transactional
public class ParameterServiceImpl extends AbstractService<Parameter> implements ParameterService {
    @Resource
    private ParameterMapper parameterMapper;

    @Override
    public List<Parameter> findAllRely(){
        return parameterMapper.findAllRely();
    }
}
