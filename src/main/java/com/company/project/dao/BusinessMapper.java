package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Business;

import java.util.List;

public interface BusinessMapper extends Mapper<Business> {
    List<Business> findAllRely();
}