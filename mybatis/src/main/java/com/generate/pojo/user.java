package com.generate.pojo;

import lombok.ToString;

import java.util.List;

@ToString
public class user {
    private Integer id;

    private String name;

    private Boolean sex;

    private String desc;

    private List<order> orders;

    public user(Integer id, String name, Boolean sex, String desc) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.desc = desc;
    }

    public user() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}