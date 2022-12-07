package com.example.snacksback.controller;

import com.example.snacksback.model.Order;
import com.example.snacksback.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "订单信息接口")
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrderService orderService;

    @ApiOperation("根据商家id查询")
    @GetMapping("/findBySid")
    public List<Order> findBySid(@RequestParam("sid") Integer sid) {
        List<Order> allBySid = orderService.findAllBySid(sid);
        return allBySid;
    }

    @ApiOperation("根据id删除")
    @GetMapping("/deleteById")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = orderService.deleteById(id);
        return aBoolean;
    }

    @ApiOperation("根据消费者id查询")
    @GetMapping("/findByUid")
    public List<Order> findByUid(@RequestParam("uid") Integer uid) {
        List<Order> byUid = orderService.findByUid(uid);
        return byUid;
    }

    @ApiOperation("更改订单状态")
    @PostMapping("/updateStatus")
    public boolean updateStatus(@RequestBody Order order) {
        Boolean aBoolean = orderService.updateStatus(order.getDid(), order.getStatus());
        return aBoolean;
    }

    @ApiOperation("创建订单")
    @PostMapping("/createOrder")
    public Boolean createOrder(@RequestBody Order order) {
        Boolean aBoolean = orderService.createOrder(order);
        return aBoolean;
    }
}
