package com.yy.shardingjdbc.mapper;

import com.yy.shardingjdbc.entity.TOrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TOrderItemMapper {

    int insert(TOrderItem orderItem);

    TOrderItem getById(@Param("orderItemId") Long orderItemId);
}
