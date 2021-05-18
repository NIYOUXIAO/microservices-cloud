package com.xw.controller;

import com.xw.entity.Goods;
import com.xw.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping("/goods")
    public class GoodsController {
        @Value("${server.port}")
        String serverPort;
        @Autowired
        GoodsService   goodsService;
        @RequestMapping("/getGoods")
        public Goods getGoods(String id){
            Goods goods = goodsService.queryById(id);
            goods.setServerPort(serverPort);
            return goods;
        }
}
