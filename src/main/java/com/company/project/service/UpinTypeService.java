package com.company.project.service;
import com.company.project.model.UpinType;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/04.
 */
public interface UpinTypeService extends Service<UpinType> {
     List<UpinType> findAllRely();
}
