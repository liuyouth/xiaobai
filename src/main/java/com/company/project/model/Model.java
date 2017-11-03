package com.company.project.model;

import javax.persistence.*;

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "model_id")
    private Integer modelId;

    @Column(name = "memory_id")
    private Integer memoryId;

    @Column(name = "color_id")
    private Integer colorId;

    @Column(name = "support_network_id")
    private Integer supportNetworkId;

    @Column(name = "network_lock_id")
    private Integer networkLockId;

    private Integer price;

    @Column(name = "form_id")
    private Integer formId;

    @Column(name = "create_time")
    private String createTime;
    @Transient
    private Config model;
    @Transient
    private Config memory;
    @Transient
    private Config color;
    @Transient
    private Config supportNetwork;
    @Transient
    private Config networkLock;
    @Transient
    private Business business ;

    public Config getModel() {
        return model;
    }

    public void setModel(Config model) {
        this.model = model;
    }

    public Config getMemory() {
        return memory;
    }

    public void setMemory(Config memory) {
        this.memory = memory;
    }

    public Config getColor() {
        return color;
    }

    public void setColor(Config color) {
        this.color = color;
    }

    public Config getSupportNetwork() {
        return supportNetwork;
    }

    public void setSupportNetwork(Config supportNetwork) {
        this.supportNetwork = supportNetwork;
    }

    public Config getNetworkLock() {
        return networkLock;
    }

    public void setNetworkLock(Config networkLock) {
        this.networkLock = networkLock;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
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
     * @return memory_id
     */
    public Integer getMemoryId() {
        return memoryId;
    }

    /**
     * @param memoryId
     */
    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
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
     * @return support_network_id
     */
    public Integer getSupportNetworkId() {
        return supportNetworkId;
    }

    /**
     * @param supportNetworkId
     */
    public void setSupportNetworkId(Integer supportNetworkId) {
        this.supportNetworkId = supportNetworkId;
    }

    /**
     * @return network_lock_id
     */
    public Integer getNetworkLockId() {
        return networkLockId;
    }

    /**
     * @param networkLockId
     */
    public void setNetworkLockId(Integer networkLockId) {
        this.networkLockId = networkLockId;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return form_id
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * @param formId
     */
    public void setFormId(Integer formId) {
        this.formId = formId;
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
}