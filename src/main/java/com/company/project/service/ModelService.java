package com.company.project.service;
import com.company.project.model.Model;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/11/02.
 */
public interface ModelService extends Service<Model> {
     List<Model> findAllRely();
}
