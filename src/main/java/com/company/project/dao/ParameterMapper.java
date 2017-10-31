package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Parameter;

import java.util.List;

public interface ParameterMapper extends Mapper<Parameter> {
    List<Parameter> findAllRely();
}