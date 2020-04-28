package com.example.consumer.controller;

import com.example.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: CSH
 * @description: 控制层
 * @create: 2020-04-28 10:37
 **/
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/add")
    public String getCost(int a){
        return "该产品总共消费 ："+productService.getCost(a);
    }

}
