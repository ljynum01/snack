package com.example.snacksback.model;

import java.io.Serializable;

public class Consumer implements Serializable {
    private Integer uid;

    private String uname;

    private String upasswd;

    private String uphone;

    private String uaddress;

    private Integer role;

    private String oldName;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpasswd() {
        return upasswd;
    }

    public void setUpasswd(String upasswd) {
        this.upasswd = upasswd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upasswd='" + upasswd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", role=" + role +
                ", oldName='" + oldName + '\'' +
                '}';
    }
}