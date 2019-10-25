package com.vainglory.pojo.vo;

import com.vainglory.pojo.model.CategoryModel;
import lombok.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 上午 10:33
 */
@Getter
@Setter
public class GoodsAndCategoryModel {
    private CategoryModelAndPicture categoryModelAndPicture;
    private List<GoodsAndPicture> goodsAndPictureList;
    private List<String> childCategoryList;

    public GoodsAndCategoryModel(CategoryModelAndPicture categoryModelAndPicture, List<GoodsAndPicture> goodsAndPictureList) {
        this.categoryModelAndPicture = categoryModelAndPicture;
        this.goodsAndPictureList = goodsAndPictureList;
        this.childCategoryList = Arrays.asList(categoryModelAndPicture.getCategoryModel().getChildCategory().split("::"));
    }
}
