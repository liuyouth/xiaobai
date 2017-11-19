package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Upin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String img;

    private String name;

    private String info;

    @Column(name = "type_id")
    private Integer typeId;

    private String url;

    @Column(name = "leading_words")
    private String leadingWords;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "praise_num")
    private Integer praiseNum;

    @Column(name = "ip_address")
    private String ipAddress;

    @Transient
    private UpinType type;
    @Transient
    private String fuligou;

    public UpinType getType() {
        return type;
    }

    public void setType(UpinType type) {
        this.type = type;
    }

    public String getFuligou() {
        return fuligou;
    }

    public void setFuligou(String fuligou) {
        this.fuligou = fuligou;
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
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
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return type_id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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
     * @return leading_words
     */
    public String getLeadingWords() {
        return leadingWords;
    }

    /**
     * @param leadingWords
     */
    public void setLeadingWords(String leadingWords) {
        this.leadingWords = leadingWords;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return praise_num
     */
    public Integer getPraiseNum() {
        return praiseNum;
    }

    /**
     * @param praiseNum
     */
    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    /**
     * @return ip_address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}