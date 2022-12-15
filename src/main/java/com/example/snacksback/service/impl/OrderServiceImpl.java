package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.OrderMapper;
import com.example.snacksback.mapper.ShopcarMapper;
import com.example.snacksback.model.Orders;
import com.example.snacksback.model.ShopcarExample;
import com.example.snacksback.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Resource
    private ShopcarMapper shopcarMapper;

    @Override
    public PageInfo<Orders> findAllOrder(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Orders> orders = orderMapper.findAll();
        PageInfo<Orders> pageInfo = new PageInfo<>(orders, pageNum);
        return pageInfo;
    }

    @Override
    public List<Orders> findAllBySid(Integer sid) {
        List<Orders> allBySid = orderMapper.findAllBySid(sid);
        return allBySid;
    }

    @Override
    public Boolean deleteById(Integer id) {
        int i = orderMapper.deleteByPrimaryKey(id);
        return i>0?true:false;
    }

    @Override
    public List<Orders> findByUid(Integer uid) {
        List<Orders> allByUid = orderMapper.findAllByUid(uid);
        return allByUid;
    }

    @Override
    public Boolean updateStatus(Integer id, Integer status) {
        Orders orders = new Orders();
        orders.setDid(id);
        orders.setStatus(status);

        int i = orderMapper.updateByPrimaryKeySelective(orders);
        return i>0?true:false;
    }

    @Override
    public Boolean createOrder(Orders orders) {
        int insert = orderMapper.insert(orders);
        return insert>0?true:false;
    }

    @Override
    public PageInfo<Orders> findAllByStatus(Integer pageNum, Integer pageSize, Integer status, Integer sid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Orders> ordersList = orderMapper.findBySidAndStatus(sid, status);
        PageInfo<Orders> pageInfo = new PageInfo<>(ordersList, pageNum);
        return pageInfo;
    }

    @Override
    public Boolean createOrders(Orders orders) {
        orders.setDtime(new Date());
        orders.setStatus(0);

        int insert = orderMapper.insert(orders);
        ShopcarExample shopcarExample = new ShopcarExample();
        shopcarExample.createCriteria()
                .andUidEqualTo(orders.getUid());
        int i = shopcarMapper.deleteByExample(shopcarExample);

        return insert + i >2;
    }
}
