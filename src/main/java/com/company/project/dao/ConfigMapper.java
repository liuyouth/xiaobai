package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Config;

import java.util.LinkedHashMap;
import java.util.List;

public interface ConfigMapper extends Mapper<Config> {
    List<Config> findAllRely();
}