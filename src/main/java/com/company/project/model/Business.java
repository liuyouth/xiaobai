package com.company.project.model;

import javax.persistence.*;

public class Business {
    @Id
    @Column(name = "business_id")
    private Integer businessId;

    @Column(name = "business_name")
    private String businessName;

    private String phone;

    /**
     * ä»£å‘
     */
    @Column(name = "on_behalf")
    private Boolean onBehalf;

    /**
     * @return business_id
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * @param businessId
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * @return business_name
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * @param businessName
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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
     * 获取ä»£å‘
     *
     * @return on_behalf - ä»£å‘
     */
    public Boolean getOnBehalf() {
        return onBehalf;
    }

    /**
     * 设置ä»£å‘
     *
     * @param onBehalf ä»£å‘
     */
    public void setOnBehalf(Boolean onBehalf) {
        this.onBehalf = onBehalf;
    }
}