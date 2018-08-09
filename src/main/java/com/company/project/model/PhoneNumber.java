package com.company.project.model;

import javax.persistence.*;

@Table(name = "phone_number")
public class PhoneNumber {
    @Id
    @Column(name = "phone_number_id")
    private Integer phoneNumberId;

    /**
     * 手机号
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 运营商
     */
    @Column(name = "phone_number_operator")
    private String phoneNumberOperator;

    /**
     * 月租
     */
    @Column(name = "phone_number_monthly")
    private Integer phoneNumberMonthly;

    /**
     * 余额
     */
    @Column(name = "phone_number_balance")
    private Double phoneNumberBalance;

    /**
     * 手机卡名字
     */
    @Column(name = "phone_number_name")
    private String phoneNumberName;

    /**
     * 合约期
     */
    @Column(name = "contract_period")
    private String contractPeriod;

    /**
     * 注册地
     */
    @Column(name = "phone_number_address")
    private String phoneNumberAddress;

    /**
     * 认证身份证
     */
    @Column(name = "phone_authentication_card_id")
    private String phoneAuthenticationCardId;

    /**
     * 认证名字
     */
    @Column(name = "phone_authentication_name")
    private String phoneAuthenticationName;

    /**
     * 合约每月返回金额
     */
    @Column(name = "contract_amount")
    private Double contractAmount;

    /**
     * 用户id
     */
    @Column(name = "person_id")
    private Integer personId;

    /**
     * @return phone_number_id
     */
    public Integer getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * @param phoneNumberId
     */
    public void setPhoneNumberId(Integer phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * 获取手机号
     *
     * @return phone_number - 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号
     *
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取运营商
     *
     * @return phone_number_operator - 运营商
     */
    public String getPhoneNumberOperator() {
        return phoneNumberOperator;
    }

    /**
     * 设置运营商
     *
     * @param phoneNumberOperator 运营商
     */
    public void setPhoneNumberOperator(String phoneNumberOperator) {
        this.phoneNumberOperator = phoneNumberOperator;
    }

    /**
     * 获取月租
     *
     * @return phone_number_monthly - 月租
     */
    public Integer getPhoneNumberMonthly() {
        return phoneNumberMonthly;
    }

    /**
     * 设置月租
     *
     * @param phoneNumberMonthly 月租
     */
    public void setPhoneNumberMonthly(Integer phoneNumberMonthly) {
        this.phoneNumberMonthly = phoneNumberMonthly;
    }

    /**
     * 获取余额
     *
     * @return phone_number_balance - 余额
     */
    public Double getPhoneNumberBalance() {
        return phoneNumberBalance;
    }

    /**
     * 设置余额
     *
     * @param phoneNumberBalance 余额
     */
    public void setPhoneNumberBalance(Double phoneNumberBalance) {
        this.phoneNumberBalance = phoneNumberBalance;
    }

    /**
     * 获取手机卡名字
     *
     * @return phone_number_name - 手机卡名字
     */
    public String getPhoneNumberName() {
        return phoneNumberName;
    }

    /**
     * 设置手机卡名字
     *
     * @param phoneNumberName 手机卡名字
     */
    public void setPhoneNumberName(String phoneNumberName) {
        this.phoneNumberName = phoneNumberName;
    }

    /**
     * 获取合约期
     *
     * @return contract_period - 合约期
     */
    public String getContractPeriod() {
        return contractPeriod;
    }

    /**
     * 设置合约期
     *
     * @param contractPeriod 合约期
     */
    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    /**
     * 获取注册地
     *
     * @return phone_number_address - 注册地
     */
    public String getPhoneNumberAddress() {
        return phoneNumberAddress;
    }

    /**
     * 设置注册地
     *
     * @param phoneNumberAddress 注册地
     */
    public void setPhoneNumberAddress(String phoneNumberAddress) {
        this.phoneNumberAddress = phoneNumberAddress;
    }

    /**
     * 获取认证身份证
     *
     * @return phone_authentication_card_id - 认证身份证
     */
    public String getPhoneAuthenticationCardId() {
        return phoneAuthenticationCardId;
    }

    /**
     * 设置认证身份证
     *
     * @param phoneAuthenticationCardId 认证身份证
     */
    public void setPhoneAuthenticationCardId(String phoneAuthenticationCardId) {
        this.phoneAuthenticationCardId = phoneAuthenticationCardId;
    }

    /**
     * 获取认证名字
     *
     * @return phone_authentication_name - 认证名字
     */
    public String getPhoneAuthenticationName() {
        return phoneAuthenticationName;
    }

    /**
     * 设置认证名字
     *
     * @param phoneAuthenticationName 认证名字
     */
    public void setPhoneAuthenticationName(String phoneAuthenticationName) {
        this.phoneAuthenticationName = phoneAuthenticationName;
    }

    /**
     * 获取合约每月返回金额
     *
     * @return contract_amount - 合约每月返回金额
     */
    public Double getContractAmount() {
        return contractAmount;
    }

    /**
     * 设置合约每月返回金额
     *
     * @param contractAmount 合约每月返回金额
     */
    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * 获取用户id
     *
     * @return person_id - 用户id
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * 设置用户id
     *
     * @param personId 用户id
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}