package com.company.project.dao;
import com.company.project.model.UpinType;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/04.
 */
public interface UpinTypeMapper extends Mapper<UpinType> {
     List<UpinType> findAllRely();
}
