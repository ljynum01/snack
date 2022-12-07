package com.example.snacksback.service;

import com.example.snacksback.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> selectAllOrder();

    public List<Order> findAllBySid(Integer sid);

    public Boolean deleteById(Integer id);

    public List<Order> findByUid(Integer uid);

    public Boolean updateStatus(Integer id, Integer status);

    public Boolean createOrder(Order order);
}
