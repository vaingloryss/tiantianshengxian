package com.vainglory.service;

import com.vainglory.pojo.model.Cart;
import com.vainglory.pojo.vo.CartVo;
import com.vainglory.pojo.vo.GoodsAndPicture;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 下午 7:10
 */
public interface CartService {
    List<CartVo> show(Integer userId);

    void addCart(Cart cart);
}
