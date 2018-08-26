package com.tuacy.mybatisdemo.model;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer pkid;

    private Integer money;

    private Integer userid;

    private static final long serialVersionUID = 1L;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}