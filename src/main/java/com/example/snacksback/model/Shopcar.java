package com.example.snacksback.model;

import java.io.Serializable;
import java.util.List;

public class Shopcar implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer cid;

    private Goods goods;

    private Integer number;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Shopcar{" +
                "id=" + id +
                ", uid=" + uid +
                ", cid=" + cid +
                ", goods=" + goods +
                ", number=" + number +
                '}';
    }
}