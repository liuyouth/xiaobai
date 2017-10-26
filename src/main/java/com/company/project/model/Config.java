package com.company.project.model;

import javax.persistence.*;

public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer parameter;

    private String name;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return parameter
     */
    public Integer getParameter() {
        return parameter;
    }

    /**
     * @param parameter
     */
    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}