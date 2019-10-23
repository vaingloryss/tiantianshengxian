package com.vainglory.service.serviceImpl;

import com.vainglory.dao.CategoryDao;
import com.vainglory.pojo.model.Category;
import com.vainglory.service.PageService;
import lombok.extern.slf4j.Slf4j;
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

    @Override
    public List<Category> indexCategoryList() {
        return categoryDao.findAll();
    }
}
