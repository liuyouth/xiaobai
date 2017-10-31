package com.company.project.service.impl;

import com.company.project.dao.ConfigMapper;
import com.company.project.model.Config;
import com.company.project.service.ConfigService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/10/31.
 */
@Service
@Transactional
public class ConfigServiceImpl extends AbstractService<Config> implements ConfigService {
    @Resource
    private ConfigMapper configMapper;

    @Override
    public List<Config> findAllRely(){
        return configMapper.findAllRely();
    }
}
