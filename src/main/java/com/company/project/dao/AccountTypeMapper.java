package com.company.project.dao;
import com.company.project.model.AccountType;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/02/19.
 */
public interface AccountTypeMapper extends Mapper<AccountType> {
     List<AccountType> findAllRely();
}
