package com.vainglory.dao;

import com.vainglory.pojo.model.CategoryModel;
import com.vainglory.pojo.vo.CategoryModelAndPicture;
import org.apache.ibatis.annotations.Param;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 4:09
 */
public interface CategoryModelDao {
    CategoryModelAndPicture findCategoryModelAndPicture(@Param("categoryId") Integer categoryId);
}
