package com.company.project.service;
import com.company.project.model.Cash;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
public interface CashService extends Service<Cash> {
     List<Cash> findAllRely();
}
