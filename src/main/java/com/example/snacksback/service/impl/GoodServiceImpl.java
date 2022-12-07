package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.GoodsMapper;
import com.example.snacksback.mapper.ImageMapper;
import com.example.snacksback.model.Goods;
import com.example.snacksback.service.GoodService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private ImageMapper imageMapper;

    @Override
    public List<Goods> findAllGood(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> allGoods = goodsMapper.findAllGoods();
        return allGoods;
    }

    @Override
    public List<Goods> findGoodsBySid(Integer pageNum, Integer pageSize, Integer sid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsBySid = goodsMapper.findGoodsBySid(sid);
        return goodsBySid;
    }

    @Override
    public List<Goods> findGoodsByLid(Integer pageNum, Integer pageSize, Integer lid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsByLid = goodsMapper.findGoodsByLid(lid);
        return goodsByLid;
    }

    @Override
    public Goods findGoodsById(Integer id) {
        Goods goodsByid = goodsMapper.findGoodsByid(id);
        return goodsByid;
    }

    @Override
    public Boolean deleteGoodsById(Integer id) {
        int i = goodsMapper.deleteByPrimaryKey(id);
        return i>0?true:false;
    }

    @Override
    public Boolean addGoods(Goods goods) {
        int insert = goodsMapper.insert(goods);

        return insert>0?true:false;
    }
}
