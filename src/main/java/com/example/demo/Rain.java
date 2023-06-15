package com.example.demo;

import lombok.Data;

import java.util.Date;

public class Rain {

    private Integer id;

    private Date begintime;

    private Date endtime;

    private Integer category;

    private Person person;

    public Person getPerson() {
        System.out.println("CCCCC");
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private Date createtime;

    private String creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
