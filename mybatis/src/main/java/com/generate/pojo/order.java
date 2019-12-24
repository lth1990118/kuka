package com.generate.pojo;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@ToString
public class order {
    private Integer id;

    private String ordername;

    private Date createdon;

    private BigDecimal price;

    private user user;

//    public order(Integer id, String ordername, Date createdon, BigDecimal price) {
//        this.id = id;
//        this.ordername = ordername;
//        this.createdon = createdon;
//        this.price = price;
//    }

    public order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}