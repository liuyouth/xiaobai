package com.company.project.dao;
import com.company.project.model.PhoneNumber;
import com.company.project.core.Mapper;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/01/16.
 */
public interface PhoneNumberMapper extends Mapper<PhoneNumber> {
     List<PhoneNumber> findAllRely();
}
