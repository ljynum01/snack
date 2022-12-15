package com.example.snacksback.controller;

import com.example.snacksback.common.CommonResult;
import com.example.snacksback.model.Goods;
import com.example.snacksback.service.GoodService;
import com.example.snacksback.service.ImageService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "商品信息接口")
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodService goodService;

    @Resource
    private ImageService imageService;

    @ApiOperation("查询所有商品信息")
    @GetMapping("/findAll")
    public PageInfo<Goods> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "5") Integer pageSize) {
        PageInfo<Goods> allGood = goodService.findAllGood(pageNum, pageSize);
        return allGood;
    }

    @ApiOperation("根据商家id查询")
    @GetMapping("/findGoodsBySid")
    public PageInfo<Goods> findGoodsBySid(@RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "6") Integer pageSize,
                                      Integer sid) {
        PageInfo<Goods> goodsBySid = goodService.findGoodsBySid(pageNum, pageSize, sid);
        return goodsBySid;
    }

    @ApiOperation("根据商品类别查询")
    @GetMapping("/findGoodsByLid")
    public PageInfo<Goods> findGoodsByLid(@RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "10") Integer pageSize,
                                          @RequestParam("lid") Integer lid) {
        PageInfo<Goods> goodsByLid = goodService.findGoodsByLid(pageNum, pageSize, lid);
        return goodsByLid;
    }

    @ApiOperation("根据商品id查询")
    @GetMapping("/findGoodsById")
    public Goods findGoodsById(@RequestParam("id") Integer id) {
        Goods goods = goodService.findGoodsById(id);
        return goods;
    }

    @ApiOperation("根据商品id进行删除")
    @GetMapping("/deleteById")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = goodService.deleteGoodsById(id);
        return aBoolean;
    }

    @ApiOperation("新增商品")
    @PostMapping("/addGoods")
    public Boolean addGoods(@RequestBody Goods goods) {
        System.out.println(goods);
        goods.setCid((int)System.currentTimeMillis());
        Boolean aBoolean = goodService.addGoods(goods);
        Boolean aBoolean1 = imageService.saveImage(goods.getImgUrl(), goods.getCid());
        return aBoolean;
    }

    @ApiOperation("修改商品")
    @PostMapping("/updateGoods")
    public Boolean updateGoods(@RequestBody Goods goods) {
        System.out.println(goods);
        Boolean aBoolean = goodService.updateGoods(goods);
        if (goods.getImgUrl()!=null) {
            imageService.updateImage(goods.getImgUrl(), goods.getCid());
        }
        return aBoolean;
    }

}
