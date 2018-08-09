package com.company.project.service;
import com.company.project.model.AccountType;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/02/19.
 */
public interface AccountTypeService extends Service<AccountType> {
     List<AccountType> findAllRely();
}
