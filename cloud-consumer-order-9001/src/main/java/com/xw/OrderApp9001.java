package com.xw;

import com.myrule.WangRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "cloud-provider-goods",configuration = WangRandomRule.class)
public class OrderApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp9001.class,args);
    }
}