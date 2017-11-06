package com.company.project.service;
import com.company.project.model.Todo;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/06.
 */
public interface TodoService extends Service<Todo> {
     List<Todo> findAllRely();
}
