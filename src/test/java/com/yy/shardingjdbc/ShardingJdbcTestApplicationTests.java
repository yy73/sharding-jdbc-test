package com.yy.shardingjdbc;

import com.yy.shardingjdbc.entity.TConfig;
import com.yy.shardingjdbc.entity.TOrder;
import com.yy.shardingjdbc.entity.TOrderItem;
import com.yy.shardingjdbc.mapper.TConfigMapper;
import com.yy.shardingjdbc.mapper.TOrderItemMapper;
import com.yy.shardingjdbc.mapper.TOrderMapper;
import com.yy.shardingjdbc.service.TConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingJdbcTestApplicationTests {

    @Autowired
    private TOrderMapper orderMapper;

    @Autowired
    private TOrderItemMapper orderItemMapper;

    @Autowired
    private TConfigMapper configMapper;

    @Autowired
    private TConfigService configService;
    @Test
    void contextLoads() {
        System.out.println(1);
    }

    @Test
    void test1() {
        for (int i = 0; i < 10; i++) {
            TOrder order = new TOrder();
            order.setOrderName("t_order:" + i);
            order.setOrderStatus("0" + i);
            order.setUserId(i);
            orderMapper.insert(order);
        }
    }

    @Test
    void test2() {
        TOrder order = orderMapper.getById(630370508537331713L);
        System.out.println(order);
    }

    @Test
    void test3() {
        for (int i = 30; i < 55; i++) {
            TOrderItem orderItem = new TOrderItem();
            orderItem.setOrderId((long) i);
            orderItem.setItemName("order_item: " + i);
            orderItem.setItemStatus("0" + i);
            orderItem.setUserId(i);
            orderItemMapper.insert(orderItem);
        }
    }

    @Test
    void test4() {
        TOrderItem tOrderItem = orderItemMapper.getById(630444796896346112L);
        System.out.println(tOrderItem);
    }

    @Test
    void test5() {
        TConfig config = new TConfig();
//        config.setConfigId(1234L);
        config.setConfigName("config-name");
        config.setConfigStatus("01");
        configMapper.insert(config);
    }

    @Test
    void test6() {
        TConfig config = configMapper.getById(630445751108894721L);
        System.out.println(config);
    }

    @Test
    void test7(){
        configService.insert(false);
    }


}
