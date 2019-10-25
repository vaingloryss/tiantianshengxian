package com.vainglory.pojo.vo;

import com.vainglory.pojo.model.CategoryModel;
import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.model.Picture;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 上午 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModelAndPicture {
    private CategoryModel categoryModel;
    private Picture picture;
}
