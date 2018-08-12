package com.company.project.model;

import javax.persistence.*;

@Table(name = "home_address")
public class HomeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private Boolean deleted;

    @Column(name = "fork_num")
    private Integer forkNum;

    private String icon;

    @Column(name = "open_all")
    private Boolean openAll;

    @Column(name = "star_num")
    private Integer starNum;

    private String type;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "use_num")
    private Integer useNum;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return fork_num
     */
    public Integer getForkNum() {
        return forkNum;
    }

    /**
     * @param forkNum
     */
    public void setForkNum(Integer forkNum) {
        this.forkNum = forkNum;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return open_all
     */
    public Boolean getOpenAll() {
        return openAll;
    }

    /**
     * @param openAll
     */
    public void setOpenAll(Boolean openAll) {
        this.openAll = openAll;
    }

    /**
     * @return star_num
     */
    public Integer getStarNum() {
        return starNum;
    }

    /**
     * @param starNum
     */
    public void setStarNum(Integer starNum) {
        this.starNum = starNum;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return use_num
     */
    public Integer getUseNum() {
        return useNum;
    }

    /**
     * @param useNum
     */
    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}