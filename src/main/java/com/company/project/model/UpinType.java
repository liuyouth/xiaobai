package com.company.project.model;

import javax.persistence.*;

@Table(name = "upin_type")
public class UpinType {
    @Id
    @Column(name = "upin_type_id")
    private Integer upinTypeId;

    private String name;

    /**
     * @return upin_type_id
     */
    public Integer getUpinTypeId() {
        return upinTypeId;
    }

    /**
     * @param upinTypeId
     */
    public void setUpinTypeId(Integer upinTypeId) {
        this.upinTypeId = upinTypeId;
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