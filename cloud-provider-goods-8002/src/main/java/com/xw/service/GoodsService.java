package com.xw.service;


import com.xw.entity.Goods;

import java.util.List;

/**
 * (com.xw.entity.Goods)表服务接口
 *
 * @author makejava
 * @since 2021-05-10 19:06:48
 */
public interface GoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
   Goods queryById(String id);

}
