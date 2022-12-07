package com.example.snacksback.service;

import com.example.snacksback.model.Shopcar;

import java.util.List;

public interface ShopCarService {
    public Boolean addGoodForCar(Integer uid, Integer gid);

    public List<Shopcar> findAllByUid(Integer uid);

    public Boolean deleteOneById(Integer id);
}
