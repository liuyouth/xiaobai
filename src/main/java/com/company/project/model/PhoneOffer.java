package com.company.project.model;

import javax.persistence.*;

@Table(name = "phone_offer")
public class PhoneOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "in_name")
    private String inName;

    @Column(name = "create_time")
    private String createTime;

    private Integer size;

    @Column(name = "is_Intact")
    private Boolean isIntact;

    @Column(name = "model_id")
    private Integer modelId;

    @Column(name = "color_id")
    private Integer colorId;

    private Double price;

    @Column(name = "in_price")
    private Double inPrice;

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
     * @return in_name
     */
    public String getInName() {
        return inName;
    }

    /**
     * @param inName
     */
    public void setInName(String inName) {
        this.inName = inName;
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
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
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
     * @return model_id
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * @param modelId
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * @return color_id
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * @param colorId
     */
    public void setColorId(Integer colorId) {
        this.colorId = colorId;
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
}