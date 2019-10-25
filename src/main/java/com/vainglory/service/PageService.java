package com.vainglory.service;

import com.vainglory.pojo.model.Category;
import com.vainglory.pojo.vo.GoodsAndCategoryModel;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 11:15
 */
public interface PageService {
    List<Category> indexCategoryList();
    GoodsAndCategoryModel getGoodsAndCategoryModel(Integer categoryId);
}
