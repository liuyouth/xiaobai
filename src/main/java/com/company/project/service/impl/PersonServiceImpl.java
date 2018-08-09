package com.company.project.service.impl;

import com.company.project.dao.PersonMapper;
import com.company.project.model.Person;
import com.company.project.service.PersonService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
@Service
@Transactional
public class PersonServiceImpl extends AbstractService<Person> implements PersonService {
    @Resource
    private PersonMapper personMapper;

    @Override
    public List<Person> findAllRely(){
        return personMapper.findAllRely();
    }
}
