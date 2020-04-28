package com.example.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.service.CostService;

/**
 * @author: CSH
 * @description:
 * @create: 2020-04-28 10:44
 **/
@Service
public class CostServiceImpl implements CostService {

    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
