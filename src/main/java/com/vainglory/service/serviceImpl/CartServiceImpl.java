package com.vainglory.service.serviceImpl;

import com.vainglory.dao.CartDao;
import com.vainglory.pojo.model.Cart;
import com.vainglory.pojo.vo.CartVo;
import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.CartService;
import com.vainglory.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 下午 7:12
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public List<CartVo> show(Integer userId) {
        return cartDao.findByUser(userId);
    }

    @Override
    public void addCart(Cart cart) {
        Cart oldCart = cartDao.findByUserAndGoods(cart.getUserId(),cart.getGoodsId());
        if (oldCart!=null){
            cart.setGoodsNum(cart.getGoodsNum()+oldCart.getGoodsNum());
            cartDao.updateGoodsNum(cart);
        }else {
            cartDao.add(cart);
        }
    }
}
