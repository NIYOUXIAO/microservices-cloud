package com.xw.service;

import com.xw.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-provider-goods",path = "/goods")
public interface GoodsClientService {

    @RequestMapping("/getGoods")
    Goods getGoods(@RequestParam("id") String id);
}
