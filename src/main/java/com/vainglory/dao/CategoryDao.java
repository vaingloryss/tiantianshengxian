package com.vainglory.dao;

import com.vainglory.pojo.model.Category;
import com.vainglory.pojo.model.CategoryModel;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 11:24
 */
public interface CategoryDao {
    List<Category> findAll();
}
