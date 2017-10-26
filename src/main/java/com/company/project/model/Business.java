package com.company.project.model;

import javax.persistence.*;

public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String phone;

    @Column(name = "on_behalf")
    private Boolean onBehalf;

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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return on_behalf
     */
    public Boolean getOnBehalf() {
        return onBehalf;
    }

    /**
     * @param onBehalf
     */
    public void setOnBehalf(Boolean onBehalf) {
        this.onBehalf = onBehalf;
    }
}