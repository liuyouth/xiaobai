package com.company.project.service;
import com.company.project.model.Business;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/11/01.
 */
public interface BusinessService extends Service<Business> {
     List<Business> findAllRely();
}
