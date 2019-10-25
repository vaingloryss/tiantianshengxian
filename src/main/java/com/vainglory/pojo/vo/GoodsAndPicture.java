package com.vainglory.pojo.vo;

import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.model.Picture;
import lombok.*;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 5:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsAndPicture {
    private Goods goods;
    private Picture picture;
}
