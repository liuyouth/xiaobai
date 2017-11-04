package com.company.project.service.impl;

import com.company.project.dao.UpinTypeMapper;
import com.company.project.model.UpinType;
import com.company.project.service.UpinTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/04.
 */
@Service
@Transactional
public class UpinTypeServiceImpl extends AbstractService<UpinType> implements UpinTypeService {
    @Resource
    private UpinTypeMapper upinTypeMapper;

    @Override
    public List<UpinType> findAllRely(){
        return upinTypeMapper.findAllRely();
    }
}
