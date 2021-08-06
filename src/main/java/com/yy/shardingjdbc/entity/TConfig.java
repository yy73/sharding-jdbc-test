package com.yy.shardingjdbc.entity;

import lombok.Data;

@Data
public class TConfig {
    private Long configId;
    private String configName;
    private String configStatus;
}
