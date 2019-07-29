package com.example.architecture.service.impl;

import com.example.architecture.service.StockActService;
import com.example.architecture.service.UserItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lichanglai
 * @date 2019/7/29 15:56
 */
@Service
public class UserItemServicImpl implements UserItemService {
    private static Logger logger = LoggerFactory.getLogger(UserItemServicImpl.class);

    @Autowired
    private StockActService stockActService;



}
