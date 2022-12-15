package com.example.snacksback.model;

import java.io.Serializable;

public class Merchant implements Serializable {
    private Integer sid;

    private String sname;

    private String spasswd;

    private String sphone;

    private String saddress;

    private String oldName;

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    private static final long serialVersionUID = 1L;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpasswd() {
        return spasswd;
    }

    public void setSpasswd(String spasswd) {
        this.spasswd = spasswd;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spasswd='" + spasswd + '\'' +
                ", sphone='" + sphone + '\'' +
                ", saddress='" + saddress + '\'' +
                ", oldName='" + oldName + '\'' +
                '}';
    }
}