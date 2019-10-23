package daoTest;

import com.vainglory.dao.UserDao;
import com.vainglory.pojo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author vaingloryss
 * @date 2019/10/22 0022 上午 10:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationConfig.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void addUserTest(){
        User user = new User(null,"123123","123123","123123@qq.com",new Date(),null,"123123");
        userDao.add(user);
    }
}
