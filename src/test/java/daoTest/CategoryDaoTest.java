package daoTest;

import com.vainglory.dao.CategoryDao;
import com.vainglory.pojo.model.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 11:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig.xml")
public class CategoryDaoTest {
    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void test01(){
        List<Category> categoryList = categoryDao.findAll();
        for (Category category : categoryList) {
            System.out.println(category.toString());
        }
    }

}
