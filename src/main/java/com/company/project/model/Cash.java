package com.company.project.model;

import javax.persistence.*;

public class Cash {
    @Id
    @Column(name = "cash_id")
    private Integer cashId;

    private Integer money;

    /**
     * 1 结婚 2 升学 3 白事 4 孩子12天   
     */
    @Column(name = "cash_type")
    private Integer cashType;

    /**
     * 1 发出去 2 收回来
     */
    @Column(name = "cash_state")
    private Integer cashState;

    @Column(name = "for_person_id")
    private Integer forPersonId;

    /**
     * @return cash_id
     */
    public Integer getCashId() {
        return cashId;
    }

    /**
     * @param cashId
     */
    public void setCashId(Integer cashId) {
        this.cashId = cashId;
    }

    /**
     * @return money
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * 获取1 结婚 2 升学 3 白事 4 孩子12天   
     *
     * @return cash_type - 1 结婚 2 升学 3 白事 4 孩子12天   
     */
    public Integer getCashType() {
        return cashType;
    }

    /**
     * 设置1 结婚 2 升学 3 白事 4 孩子12天   
     *
     * @param cashType 1 结婚 2 升学 3 白事 4 孩子12天   
     */
    public void setCashType(Integer cashType) {
        this.cashType = cashType;
    }

    /**
     * 获取1 发出去 2 收回来
     *
     * @return cash_state - 1 发出去 2 收回来
     */
    public Integer getCashState() {
        return cashState;
    }

    /**
     * 设置1 发出去 2 收回来
     *
     * @param cashState 1 发出去 2 收回来
     */
    public void setCashState(Integer cashState) {
        this.cashState = cashState;
    }

    /**
     * @return for_person_id
     */
    public Integer getForPersonId() {
        return forPersonId;
    }

    /**
     * @param forPersonId
     */
    public void setForPersonId(Integer forPersonId) {
        this.forPersonId = forPersonId;
    }
}