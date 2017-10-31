package com.company.project.model;

import javax.persistence.*;

public class Parameter {
    @Id
    @Column(name = "parameter_id")
    private Integer parameterId;

    @Column(name = "parameter_name")
    private String parameterName;

    /**
     * @return parameter_id
     */
    public Integer getParameterId() {
        return parameterId;
    }

    /**
     * @param parameterId
     */
    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    /**
     * @return parameter_name
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * @param parameterName
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
}