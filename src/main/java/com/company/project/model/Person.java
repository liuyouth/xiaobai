package com.company.project.model;

import javax.persistence.*;

public class Person {
    @Id
    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "person_name")
    private String personName;


    @Column(name = "person_card_id")
    private String personCardId;

    @Column(name = "person_photo")
    private String personPhoto;

    @Column(name = "person_address")
    private String personAddress;

    /**
     * @return person_id
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * @param personId
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * @return person_name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }


    /**
     * @return person_card_id
     */
    public String getPersonCardId() {
        return personCardId;
    }

    /**
     * @param personCardId
     */
    public void setPersonCardId(String personCardId) {
        this.personCardId = personCardId;
    }

    /**
     * @return person_photo
     */
    public String getPersonPhoto() {
        return personPhoto;
    }

    /**
     * @param personPhoto
     */
    public void setPersonPhoto(String personPhoto) {
        this.personPhoto = personPhoto;
    }

    /**
     * @return person_address
     */
    public String getPersonAddress() {
        return personAddress;
    }

    /**
     * @param personAddress
     */
    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
}