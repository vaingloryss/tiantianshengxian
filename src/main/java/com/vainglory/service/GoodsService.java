package com.vainglory.service;

import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.vo.GoodsAndPicture;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 8:18
 */
public interface GoodsService {
    List<GoodsAndPicture> findByCategoryId(Integer categoryId);
    GoodsAndPicture goodsDetail(Integer goodsId);
}
