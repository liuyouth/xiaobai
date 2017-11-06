package com.company.project.dao;
import com.company.project.model.Todo;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/06.
 */
public interface TodoMapper extends Mapper<Todo> {
     List<Todo> findAllRely();
}
