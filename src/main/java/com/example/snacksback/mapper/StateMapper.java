package com.example.snacksback.mapper;

import com.example.snacksback.model.State;
import com.example.snacksback.model.StateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StateMapper {
    int countByExample(StateExample example);

    int deleteByExample(StateExample example);

    int deleteByPrimaryKey(Integer dstateid);

    int insert(State record);

    int insertSelective(State record);

    List<State> selectByExample(StateExample example);

    State selectByPrimaryKey(Integer dstateid);

    int updateByExampleSelective(@Param("record") State record, @Param("example") StateExample example);

    int updateByExample(@Param("record") State record, @Param("example") StateExample example);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}