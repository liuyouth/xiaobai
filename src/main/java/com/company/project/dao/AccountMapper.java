package com.company.project.dao;
import com.company.project.model.Account;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/02/19.
 */
public interface AccountMapper extends Mapper<Account> {
     List<Account> findAllRely();
}
