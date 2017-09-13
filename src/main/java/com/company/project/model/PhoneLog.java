package com.company.project.model;

import javax.persistence.*;

@Table(name = "phone_log")
public class PhoneLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double price;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "in_price")
    private Double inPrice;

    @Column(name = "is_Intact")
    private Boolean isIntact;

    private Integer version;

    @Column(name = "phone_id")
    private Integer phoneId;

    @Transient
    private Phone phone;

    public Boolean getIntact() {
        return isIntact;
    }

    public void setIntact(Boolean intact) {
        isIntact = intact;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

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
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
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
     * @return in_price
     */
    public Double getInPrice() {
        return inPrice;
    }

    /**
     * @param inPrice
     */
    public void setInPrice(Double inPrice) {
        this.inPrice = inPrice;
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
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return phone_id
     */
    public Integer getPhoneId() {
        return phoneId;
    }

    /**
     * @param phoneId
     */
    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }
}