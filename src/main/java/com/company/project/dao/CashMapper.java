package com.company.project.dao;
import com.company.project.model.Cash;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
public interface CashMapper extends Mapper<Cash> {
     List<Cash> findAllRely();
}
