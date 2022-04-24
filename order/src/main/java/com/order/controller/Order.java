package com.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class Order
{
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/add")
    public String add()
    {
        return "I am order ,my port = "+port.intValue();
    }


}
