package com.company.project.service.impl;

import com.company.project.dao.AccountMapper;
import com.company.project.model.Account;
import com.company.project.service.AccountService;
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
public class AccountServiceImpl extends AbstractService<Account> implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAllRely(){
        return accountMapper.findAllRely();
    }
}
