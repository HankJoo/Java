package com.hankgroup.yourorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @GetMapping("/getShop")
    public String getList() throws Exception {


        return "Hello World";
    }
}
