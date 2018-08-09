package com.company.project.service.impl;

import com.company.project.dao.CashMapper;
import com.company.project.model.Cash;
import com.company.project.service.CashService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
@Service
@Transactional
public class CashServiceImpl extends AbstractService<Cash> implements CashService {
    @Resource
    private CashMapper cashMapper;

    @Override
    public List<Cash> findAllRely(){
        return cashMapper.findAllRely();
    }
}
