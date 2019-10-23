package com.vainglory.service.serviceImpl;

import com.vainglory.dao.RoleDao;
import com.vainglory.dao.UserDao;
import com.vainglory.pojo.model.User;
import com.vainglory.service.UserService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Override
    public User queryUserByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User checkUser(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public void register(User user) {
        user.setGmtCreate(new Date());
        user.setSalt(UUID.randomUUID().toString());
        Sha256Hash sha256Hash = new Sha256Hash(user.getPassword(),user.getSalt(),1000);
        user.setPassword(sha256Hash.toBase64());
        userDao.add(user);
        System.out.println(user.getId());
        //1:admin，管理员 2:user，普通用户
        roleDao.add(user.getId(),2);
    }
}
