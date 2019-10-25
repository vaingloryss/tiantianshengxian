package daoTest;

import com.vainglory.dao.GoodsDao;
import com.vainglory.pojo.model.Goods;
import com.vainglory.pojo.vo.GoodsAndPicture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 下午 4:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig.xml")
public class GoodsDaoTest {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void test01(){
        List<GoodsAndPicture> goodsAndPictureList = goodsDao.findGoodsAndPicByCategoryId(1);
        for (GoodsAndPicture goodsAndPicture : goodsAndPictureList) {
            System.out.println(goodsAndPicture.getGoods().toString());
            System.out.println(goodsAndPicture.getPicture().toString());
        }
    }
}
