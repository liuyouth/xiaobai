package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "phone_name")
    private String phoneName;

    @Column(name = "phone_color")
    private String phoneColor;

    @Column(name = "phone_version")
    private String phoneVersion;

    @Column(name = "is_new")
    private Integer isNew;

    @Column(name = "created_date")
    private Date createdDate;

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
     * @return phone_name
     */
    public String getPhoneName() {
        return phoneName;
    }

    /**
     * @param phoneName
     */
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    /**
     * @return phone_color
     */
    public String getPhoneColor() {
        return phoneColor;
    }

    /**
     * @param phoneColor
     */
    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    /**
     * @return phone_version
     */
    public String getPhoneVersion() {
        return phoneVersion;
    }

    /**
     * @param phoneVersion
     */
    public void setPhoneVersion(String phoneVersion) {
        this.phoneVersion = phoneVersion;
    }

    /**
     * @return is_new
     */
    public Integer getIsNew() {
        return isNew;
    }

    /**
     * @param isNew
     */
    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    /**
     * @return created_date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}