package com.yy.shardingjdbc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TOrderItem {
    private Long orderItemId;
    private Long orderId;
    private String itemName;
    private String itemStatus;
    private Date itemTime;
    private int userId;
}
