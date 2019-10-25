package com.vainglory.service.serviceImpl;

import com.vainglory.dao.GoodsDao;
import com.vainglory.dao.PictureDao;
import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.model.Picture;
import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 8:27
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private PictureDao pictureDao;
    @Override
    public List<GoodsAndPicture> findByCategoryId(Integer categoryId) {
        List<GoodsAndPicture> goodsAndPictureList = goodsDao.findGoodsAndPicByCategoryId(categoryId);
        return goodsAndPictureList;
    }

    @Override
    public GoodsAndPicture goodsDetail(Integer goodsId) {
        return goodsDao.findGoodsAndPicByGoodsId(goodsId);
    }
}
