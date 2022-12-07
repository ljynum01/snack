package com.example.snacksback.mapper;

import com.example.snacksback.model.Goods;
import com.example.snacksback.model.GoodsExample;
import java.util.List;

import com.example.snacksback.model.Merchant;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> findAllGoods();

    List<Goods> findGoodsBySid(Integer sid);

    List<Goods> findGoodsByLid(Integer lid);

    Goods findGoodsByid(Integer id);

}