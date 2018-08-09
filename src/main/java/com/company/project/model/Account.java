package com.company.project.model;

import javax.persistence.*;

public class Account {
    @Id
    @Column(name = "account_number_id")
    private Integer accountNumberId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_psw")
    private String accountPsw;

    /**
     * 默认关联手机号0
     */
    @Column(name = "account_phone_id")
    private Integer accountPhoneId;

    @Column(name = "account_answer")
    private String accountAnswer;

    @Column(name = "account_question")
    private String accountQuestion;

    @Column(name = "account_email")
    private String accountEmail;

    @Column(name = "account_type_id")
    private Integer accountTypeId;

    @Transient
    private AccountType accountType;
    @Transient
    private PhoneNumber accountPhone;


    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public PhoneNumber getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(PhoneNumber accountPhone) {
        this.accountPhone = accountPhone;
    }

    /**
     * @return account_number_id
     */
    public Integer getAccountNumberId() {
        return accountNumberId;
    }

    /**
     * @param accountNumberId
     */
    public void setAccountNumberId(Integer accountNumberId) {
        this.accountNumberId = accountNumberId;
    }

    /**
     * @return account_name
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return account_psw
     */
    public String getAccountPsw() {
        return accountPsw;
    }

    /**
     * @param accountPsw
     */
    public void setAccountPsw(String accountPsw) {
        this.accountPsw = accountPsw;
    }

    /**
     * 获取默认关联手机号0
     *
     * @return account_phone_id - 默认关联手机号0
     */
    public Integer getAccountPhoneId() {
        return accountPhoneId;
    }

    /**
     * 设置默认关联手机号0
     *
     * @param accountPhoneId 默认关联手机号0
     */
    public void setAccountPhoneId(Integer accountPhoneId) {
        this.accountPhoneId = accountPhoneId;
    }

    /**
     * @return account_answer
     */
    public String getAccountAnswer() {
        return accountAnswer;
    }

    /**
     * @param accountAnswer
     */
    public void setAccountAnswer(String accountAnswer) {
        this.accountAnswer = accountAnswer;
    }

    /**
     * @return account_question
     */
    public String getAccountQuestion() {
        return accountQuestion;
    }

    /**
     * @param accountQuestion
     */
    public void setAccountQuestion(String accountQuestion) {
        this.accountQuestion = accountQuestion;
    }

    /**
     * @return account_email
     */
    public String getAccountEmail() {
        return accountEmail;
    }

    /**
     * @param accountEmail
     */
    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    /**
     * @return account_type_id
     */
    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * @param accountTypeId
     */
    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }
}