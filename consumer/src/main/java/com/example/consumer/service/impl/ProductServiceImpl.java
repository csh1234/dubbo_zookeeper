package com.example.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.api.service.CostService;
import com.example.consumer.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author: CSH
 * @description:
 * @create: 2020-04-28 10:35
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
