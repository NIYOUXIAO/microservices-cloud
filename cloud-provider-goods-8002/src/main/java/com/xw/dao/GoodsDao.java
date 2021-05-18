package com.xw.dao;

import com.xw.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (com.xw.entity.Goods)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-10 19:06:48
 */
@Mapper
public interface GoodsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Goods queryById(String id);

}

