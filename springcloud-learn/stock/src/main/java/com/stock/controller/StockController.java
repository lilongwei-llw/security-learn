package com.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StockController")
public class StockController {
    @RequestMapping("/reduce")
    public String add()
    {
        return "stock add";
    }
}
