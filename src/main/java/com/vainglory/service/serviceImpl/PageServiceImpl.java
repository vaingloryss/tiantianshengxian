package com.vainglory.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.vainglory.dao.CategoryDao;
import com.vainglory.dao.CategoryModelDao;
import com.vainglory.dao.GoodsDao;
import com.vainglory.dao.PictureDao;
import com.vainglory.pojo.model.Category;
import com.vainglory.pojo.vo.CategoryModelAndPicture;
import com.vainglory.pojo.vo.GoodsAndCategoryModel;
import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 11:16
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private CategoryModelDao categoryModelDao;
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private PictureDao pictureDao;

    //主页所有商品分类
    @Override
    public List<Category> indexCategoryList() {
        return categoryDao.findAll();
    }

    //
    @Override
    public GoodsAndCategoryModel getGoodsAndCategoryModel(Integer categoryId) {
        //desc为降序，asc为升序
        PageHelper.startPage(1,4,"tb_goods.gmt_create desc");
        List<GoodsAndPicture> goodsAndPictureList = goodsDao.findGoodsAndPicByCategoryId(categoryId);
        CategoryModelAndPicture categoryModelAndPicture = categoryModelDao.findCategoryModelAndPicture(categoryId);
        GoodsAndCategoryModel goodsAndCategoryModel = new GoodsAndCategoryModel(categoryModelAndPicture,goodsAndPictureList);
        return goodsAndCategoryModel;
    }
}
