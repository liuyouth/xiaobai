package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Model;

import java.util.List;

public interface ModelMapper extends Mapper<Model> {
    List<Model> findAllRely();
}