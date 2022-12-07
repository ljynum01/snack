package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.ConsumerMapper;
import com.example.snacksback.mapper.GoodsMapper;
import com.example.snacksback.mapper.ShopcarMapper;
import com.example.snacksback.model.Shopcar;
import com.example.snacksback.model.ShopcarExample;
import com.example.snacksback.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    private ConsumerMapper consumerMapper;

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private ShopcarMapper shopcarMapper;

    @Override
    public Boolean addGoodForCar(Integer uid, Integer gid) {
        Shopcar shopcar = new Shopcar();
        shopcar.setUid(uid);
        shopcar.setCid(gid);
        ShopcarExample shopcarExample = new ShopcarExample();
        shopcarExample.createCriteria()
                .andUidEqualTo(uid)
                .andCidEqualTo(gid);
        List<Shopcar> shopcars = shopcarMapper.selectByExample(shopcarExample);
        if (shopcars.size()>0) {
            Shopcar shopcar1 = shopcars.get(0);;
            shopcar1.setNumber(shopcar1.getNumber() + 1);
            int i = shopcarMapper.updateByPrimaryKeySelective(shopcar1);
            if (i>0) {
                return true;
            }
        }else {
            Shopcar shopcar1 = new Shopcar();
            shopcar1.setCid(gid);
            shopcar1.setUid(uid);
            shopcar1.setNumber(1);
            int insert = shopcarMapper.insert(shopcar1);
            if (insert>0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Shopcar> findAllByUid(Integer uid) {
        List<Shopcar> shopcars = shopcarMapper.findAllByUid(uid);
        shopcars.forEach(shopcar -> {
            Integer gid = shopcar.getCid();
        });
        return shopcars;
    }

    @Override
    public Boolean deleteOneById(Integer id) {
        int i = shopcarMapper.deleteByPrimaryKey(id);
        if (i>0) {
            return true;
        }else {
            return false;
        }
    }
}
