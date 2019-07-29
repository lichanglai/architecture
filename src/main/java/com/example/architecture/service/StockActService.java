package com.example.architecture.service;

import java.util.List;

/**
 * @author lichanglai
 * @date 2019/7/29 15:57
 */
public interface StockActService {

    /**
     * 获取库存列表
     */
    List<String> getLostStockList();
}
