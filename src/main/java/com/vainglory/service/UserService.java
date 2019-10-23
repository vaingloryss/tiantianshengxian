package com.vainglory.service;

import com.vainglory.pojo.model.User;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 5:54
 */
public interface UserService {
    User queryUserByUsername(String username);

    User checkUser(String username);

    void register(User user);
}
