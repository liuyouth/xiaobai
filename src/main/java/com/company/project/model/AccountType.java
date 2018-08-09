package com.company.project.model;

import javax.persistence.*;

@Table(name = "account_type")
public class AccountType {
    @Id
    @Column(name = "account_type_id")
    private Integer accountTypeId;

    @Column(name = "account_type_name")
    private String accountTypeName;

    @Column(name = "account_type_home")
    private String accountTypeHome;

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

    /**
     * @return account_type_name
     */
    public String getAccountTypeName() {
        return accountTypeName;
    }

    /**
     * @param accountTypeName
     */
    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    /**
     * @return account_type_home
     */
    public String getAccountTypeHome() {
        return accountTypeHome;
    }

    /**
     * @param accountTypeHome
     */
    public void setAccountTypeHome(String accountTypeHome) {
        this.accountTypeHome = accountTypeHome;
    }
}