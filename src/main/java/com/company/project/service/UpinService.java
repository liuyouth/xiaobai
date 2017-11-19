package com.company.project.service;
import com.company.project.model.Upin;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/19.
 */
public interface UpinService extends Service<Upin> {
     List<Upin> findAllRely();
}
