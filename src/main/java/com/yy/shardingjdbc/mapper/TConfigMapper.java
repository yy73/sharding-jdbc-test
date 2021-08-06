package com.yy.shardingjdbc.mapper;

import com.yy.shardingjdbc.entity.TConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TConfigMapper {
    int insert(TConfig tConfig);

    TConfig getById(@Param("configId") Long configId);
}
