package com.company.project.service;
import com.company.project.model.Account;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/02/19.
 */
public interface AccountService extends Service<Account> {
     List<Account> findAllRely();
}
