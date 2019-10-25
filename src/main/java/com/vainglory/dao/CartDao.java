package com.vainglory.dao;

import com.vainglory.pojo.model.Cart;
import com.vainglory.pojo.vo.CartVo;
import com.vainglory.pojo.vo.GoodsAndPicture;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 下午 7:13
 */
public interface CartDao {
    List<CartVo> findByUser(@Param("userId") Integer userId);
    void add(Cart cart);
    Cart findByUserAndGoods(@Param("userId") Integer userId, @Param("goodsId") Integer goodsId);

    void updateGoodsNum(Cart cart);
}
