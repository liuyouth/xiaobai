package com.company.project.model;

import javax.persistence.*;

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer model;

    private Integer memory;

    private Integer color;

    @Column(name = "support_network")
    private Integer supportNetwork;

    @Column(name = "network_lock")
    private Integer networkLock;

    @Column(name = "create_time")
    private Integer createTime;

    private Integer price;

    private Integer form;

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
     * @return model
     */
    public Integer getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(Integer model) {
        this.model = model;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * @param memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * @return color
     */
    public Integer getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(Integer color) {
        this.color = color;
    }

    /**
     * @return support_network
     */
    public Integer getSupportNetwork() {
        return supportNetwork;
    }

    /**
     * @param supportNetwork
     */
    public void setSupportNetwork(Integer supportNetwork) {
        this.supportNetwork = supportNetwork;
    }

    /**
     * @return network_lock
     */
    public Integer getNetworkLock() {
        return networkLock;
    }

    /**
     * @param networkLock
     */
    public void setNetworkLock(Integer networkLock) {
        this.networkLock = networkLock;
    }

    /**
     * @return create_time
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
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
     * @return form
     */
    public Integer getForm() {
        return form;
    }

    /**
     * @param form
     */
    public void setForm(Integer form) {
        this.form = form;
    }
}