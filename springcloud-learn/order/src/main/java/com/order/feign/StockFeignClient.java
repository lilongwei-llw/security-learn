package com.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service",path = "/StockController")
public interface StockFeignClient {
    @RequestMapping("/reduce")
    String add() ;

}
