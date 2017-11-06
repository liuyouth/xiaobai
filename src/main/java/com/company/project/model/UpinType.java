package com.company.project.model;

import javax.persistence.*;

@Table(name = "upin_type")
public class UpinType {
    @Id
    @Column(name = "upin_type_id")
    private Integer upinTypeId;

    @Column(name = "type_name")
    private String typeName;

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
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}