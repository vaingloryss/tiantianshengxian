package com.vainglory.dao;

import com.vainglory.pojo.model.Picture;
import org.apache.ibatis.annotations.Param;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 5:28
 */
public interface PictureDao {
    Picture findById(@Param("picId") Integer picId);

    Picture findByGoodsId(@Param("goodsId") Integer goodsId);
}
