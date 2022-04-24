package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainOrder
{
    public static void main(String[] args)
    {
        System.out.println("test push2");
        SpringApplication.run(MainOrder.class,args);
    }
}
