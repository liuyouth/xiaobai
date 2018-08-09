package com.company.project.service;
import com.company.project.model.PhoneNumber;
import com.company.project.core.Service;
import java.util.List;

/**
 * Created by GitHub Id = liuyouth on 2018/01/16.
 */
public interface PhoneNumberService extends Service<PhoneNumber> {
     List<PhoneNumber> findAllRely();
}
