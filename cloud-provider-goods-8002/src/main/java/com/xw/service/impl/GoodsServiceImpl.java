package com.xw.service.impl;
import com.xw.dao.GoodsDao;
import com.xw.entity.Goods;
import com.xw.service.GoodsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * (com.xw.entity.Goods)表服务实现类
 *
 * @author makejava
 * @since 2021-05-10 19:06:49
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Goods queryById(String id) {
        return this.goodsDao.queryById(id);
    }

}
