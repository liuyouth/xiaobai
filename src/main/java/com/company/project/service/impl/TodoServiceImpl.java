package com.company.project.service.impl;

import com.company.project.dao.TodoMapper;
import com.company.project.model.Todo;
import com.company.project.service.TodoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/11/08.
 */
@Service
@Transactional
public class TodoServiceImpl extends AbstractService<Todo> implements TodoService {
    @Resource
    private TodoMapper todoMapper;

    @Override
    public List<Todo> findAllRely(){
        return todoMapper.findAllRely();
    }
}
