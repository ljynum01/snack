package com.example.snacksback.service;

import com.example.snacksback.model.Goods;

import java.util.List;

public interface GoodService {
    public List<Goods> findAllGood(Integer pageNum, Integer pageSize);

    public List<Goods> findGoodsBySid(Integer pageNum, Integer pageSize, Integer sid);

    public List<Goods> findGoodsByLid(Integer pageNum, Integer pageSize, Integer lid);

    public Goods findGoodsById(Integer id);

    public Boolean deleteGoodsById(Integer id);

    public Boolean addGoods(Goods goods);
}
