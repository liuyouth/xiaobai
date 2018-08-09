package com.company.project.service.impl;

import com.company.project.dao.AccountTypeMapper;
import com.company.project.model.AccountType;
import com.company.project.service.AccountTypeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/02/19.
 */
@Service
@Transactional
public class AccountTypeServiceImpl extends AbstractService<AccountType> implements AccountTypeService {
    @Resource
    private AccountTypeMapper accountTypeMapper;

    @Override
    public List<AccountType> findAllRely(){
        return accountTypeMapper.findAllRely();
    }
}
