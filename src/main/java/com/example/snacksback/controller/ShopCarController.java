package com.example.snacksback.controller;

import com.example.snacksback.model.Shopcar;
import com.example.snacksback.service.ShopCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "购物车接口")
@RequestMapping("/shopCar")
public class ShopCarController {
    @Resource
    private ShopCarService shopCarService;

    @ApiOperation("添加商品到购物车")
    @GetMapping("/addGoodForCar")
    public Boolean addGoodForCar(@RequestParam("uid") Integer uid,
                                 @RequestParam("gid") Integer gid) {
        Boolean aBoolean = shopCarService.addGoodForCar(uid, gid);
        return aBoolean;
    }

    @ApiOperation("根据用户id查询该用户购物车信息")
    @GetMapping("/findAllByUid")
    public List<Shopcar> findAllByUid(@RequestParam("uid") Integer uid) {
        List<Shopcar> allByUid = shopCarService.findAllByUid(uid);
        return allByUid;
    }

    @ApiOperation("从购物车里删除商品")
    @GetMapping("/delete")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = shopCarService.deleteOneById(id);
        return aBoolean;
    }
}
