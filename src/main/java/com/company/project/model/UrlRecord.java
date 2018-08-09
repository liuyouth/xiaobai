package com.company.project.model;

import javax.persistence.*;

@Table(name = "url_record")
public class UrlRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fork_num")
    private Integer forkNum;

    private String icon;

    private String name;

    @Column(name = "open_all")
    private Boolean openAll;

    private String space;

    @Column(name = "star_num")
    private Integer starNum;

    private String type;

    private String url;

    @Column(name = "use_num")
    private Integer useNum;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "is_open_all")
    private Boolean isOpenAll;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return space
     */
    public String getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(String space) {
        this.space = space;
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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
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

    /**
     * @return is_open_all
     */
    public Boolean getIsOpenAll() {
        return isOpenAll;
    }

    /**
     * @param isOpenAll
     */
    public void setIsOpenAll(Boolean isOpenAll) {
        this.isOpenAll = isOpenAll;
    }
}