package com.example.snacksback.model;

import java.io.Serializable;

public class State implements Serializable {
    private Integer dstateid;

    private String dstate;

    private static final long serialVersionUID = 1L;

    public Integer getDstateid() {
        return dstateid;
    }

    public void setDstateid(Integer dstateid) {
        this.dstateid = dstateid;
    }

    public String getDstate() {
        return dstate;
    }

    public void setDstate(String dstate) {
        this.dstate = dstate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dstateid=").append(dstateid);
        sb.append(", dstate=").append(dstate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}