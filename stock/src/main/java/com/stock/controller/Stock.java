package com.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("stock")
public class Stock
{
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("add")
    public String add()
    {
        ResponseEntity<String> result = restTemplate.getForEntity("http://order-service/order/add",String.class);
        if(result.getStatusCode() == HttpStatus.OK)
        {
            return "this is a result from "+result.getBody();
        }
        return "call wrong";
    }
}
