package com.order.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/OrderController")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        String msg =  restTemplate.getForObject("http://localhost:8011/StockController/reduce",String.class);
        System.out.println(msg);
        return "order";
    }

}
