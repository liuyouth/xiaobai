package com.company.project.model;

import javax.persistence.*;

@Table(name = "phone_model")
public class PhoneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "is_lock")
    private Boolean isLock;

    @Column(name = "is_Intact")
    private Boolean isIntact;

    private String version;

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

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return is_lock
     */
    public Boolean getIsLock() {
        return isLock;
    }

    /**
     * @param isLock
     */
    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    /**
     * @return is_Intact
     */
    public Boolean getIsIntact() {
        return isIntact;
    }

    /**
     * @param isIntact
     */
    public void setIsIntact(Boolean isIntact) {
        this.isIntact = isIntact;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }
}