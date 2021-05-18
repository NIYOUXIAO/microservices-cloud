package com.xw.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    //服务流控
    @RequestMapping("/getGoodsAll")
    public String getGoodsAll(){
        return "返回所有商品信息...";
    }

    //服务降级
    @RequestMapping("/demotion")
    @SentinelResource(value = "demotion",fallback = "demotion1")
    public  String  demotion(int id) {
        if(id==0){
            throw new NullPointerException();
        }
        return " 服务降级 ";
    }
    public  String demotion1(int id){

        return "出错了!!!!";
    }

    //服务热点
    @RequestMapping("/hotspot")
    @SentinelResource(value = "hotspot")
    public  String hotspot(String id ,String name){

        return  "热点服务";
    }
}