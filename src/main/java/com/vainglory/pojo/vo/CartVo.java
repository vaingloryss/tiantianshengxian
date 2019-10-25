package com.vainglory.pojo.vo;

import com.vainglory.pojo.model.Cart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vaingloryss
 * @date 2019/10/25 0025 上午 8:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVo {
    private Cart cart;
    private GoodsAndPicture goodsAndPicture;
}
