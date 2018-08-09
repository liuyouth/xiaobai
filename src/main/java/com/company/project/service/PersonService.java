package com.company.project.service;
import com.company.project.model.Person;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2017/12/29.
 */
public interface PersonService extends Service<Person> {
     List<Person> findAllRely();
}
