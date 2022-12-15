package com.example.snacksback.mapper;

import com.example.snacksback.model.Orders;
import com.example.snacksback.model.OrdersExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> findAllBySid(Integer sid);

    List<Orders> findAllByUid(Integer sid);

    List<Orders> findAll();

    List<Orders> findBySidAndStatus(Integer sid, Integer status);

}