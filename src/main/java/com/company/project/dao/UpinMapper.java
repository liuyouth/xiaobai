package com.company.project.dao;
import com.company.project.model.Upin;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/19.
 */
public interface UpinMapper extends Mapper<Upin> {
     List<Upin> findAllRely();
}
