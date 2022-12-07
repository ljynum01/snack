package com.example.snacksback.service.impl;

import com.example.snacksback.mapper.OrderMapper;
import com.example.snacksback.model.Order;
import com.example.snacksback.model.OrderExample;
import com.example.snacksback.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAllOrder() {
        List<Order> orders = orderMapper.selectByExample(null);
        return orders;
    }

    @Override
    public List<Order> findAllBySid(Integer sid) {
        List<Order> allBySid = orderMapper.findAllBySid(sid);
        return allBySid;
    }

    @Override
    public Boolean deleteById(Integer id) {
        int i = orderMapper.deleteByPrimaryKey(id);
        return i>0?true:false;
    }

    @Override
    public List<Order> findByUid(Integer uid) {
        List<Order> allByUid = orderMapper.findAllByUid(uid);
        return allByUid;
    }

    @Override
    public Boolean updateStatus(Integer id, Integer status) {
        Order order = new Order();
        order.setDid(id);
        order.setStatus(status);

        int i = orderMapper.updateByPrimaryKeySelective(order);
        return i>0?true:false;
    }

    @Override
    public Boolean createOrder(Order order) {
        int insert = orderMapper.insert(order);
        return insert>0?true:false;
    }
}
