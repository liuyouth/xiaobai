package com.company.project.model;

import javax.persistence.*;

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "phone_name")
    private String phoneName;

    @Column(name = "phone_color")
    private String phoneColor;

    @Column(name = "phone_model")
    private String phoneModel;

    @Column(name = "phone_size")
    private Integer phoneSize;

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
     * @return phone_model
     */
    public String getPhoneModel() {
        return phoneModel;
    }

    /**
     * @param phoneModel
     */
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    /**
     * @return phone_size
     */
    public Integer getPhoneSize() {
        return phoneSize;
    }

    /**
     * @param phoneSize
     */
    public void setPhoneSize(Integer phoneSize) {
        this.phoneSize = phoneSize;
    }
}