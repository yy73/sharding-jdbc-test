package com.yy.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.yy.shardingjdbc.mapper")
public class ShardingJdbcTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcTestApplication.class, args);
    }

}
