package com.yy.shardingjdbc.service.impl;

import com.yy.shardingjdbc.entity.TConfig;
import com.yy.shardingjdbc.mapper.TConfigMapper;
import com.yy.shardingjdbc.service.TConfigService;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;

@Service
public class TConfigServiceImpl implements TConfigService {

    @Autowired
    private TConfigMapper configMapper;

//    @Override
    @Transactional
    @ShardingTransactionType(TransactionType.XA)
    public int insert(boolean flag) {
        for (int i = 10; i < 20; i++) {
            TConfig config = new TConfig();
            config.setConfigName("sssss");
            if (!flag) {
                config.setConfigStatus("aaaaaaaaaasssssssssssdddddddddddddddd001");
            } else {
                config.setConfigStatus("sss:" + i);
            }
            configMapper.insert(config);
        }
        return 0;
    }
}
