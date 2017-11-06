package com.company.project.service.impl;

import com.company.project.dao.UpinMapper;
import com.company.project.model.Upin;
import com.company.project.service.UpinService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/05.
 */
@Service
@Transactional
public class UpinServiceImpl extends AbstractService<Upin> implements UpinService {
    @Resource
    private UpinMapper upinMapper;

    @Override
    public List<Upin> findAllRely(){
        return upinMapper.findAllRely();
    }
}
