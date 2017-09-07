package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Phone;
import com.company.project.model.PhoneLog;

public interface PhoneMapper extends Mapper<Phone> {
    void add (Phone phone);
}