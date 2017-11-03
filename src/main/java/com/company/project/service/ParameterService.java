package com.company.project.service;
import com.company.project.model.Parameter;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/11/03.
 */
public interface ParameterService extends Service<Parameter> {
     List<Parameter> findAllRely();
}
