package com.vainglory.dao;

import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.vo.GoodsAndPicture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 4:10
 */
public interface GoodsDao {
    List<GoodsAndPicture> findGoodsAndPicByCategoryId(@Param("categoryId") Integer categoryId);

    GoodsAndPicture findGoodsAndPicByGoodsId(Integer goodsId);
}
