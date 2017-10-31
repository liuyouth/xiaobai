package com.company.project.service;
import com.company.project.model.Config;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by CodeGenerator on 2017/10/31.
 */
public interface ConfigService extends Service<Config> {
     List<Config> findAllRely();
}
