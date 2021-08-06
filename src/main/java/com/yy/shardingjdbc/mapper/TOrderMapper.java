package com.yy.shardingjdbc.mapper;

import com.yy.shardingjdbc.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TOrderMapper {

    int insert(TOrder order);

    TOrder getById(@Param("orderId") Long orderId);
}
