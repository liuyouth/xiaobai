package com.company.project.dao;
import com.company.project.model.Person;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
public interface PersonMapper extends Mapper<Person> {
     List<Person> findAllRely();
}
