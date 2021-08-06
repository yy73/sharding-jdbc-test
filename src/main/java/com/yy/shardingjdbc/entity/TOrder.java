package com.yy.shardingjdbc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TOrder {
    private Long orderId;
    private String orderName;
    private String orderStatus;
    private Date orderTime;
    private int userId;
}
