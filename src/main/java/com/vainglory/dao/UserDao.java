package com.vainglory.dao;

import com.vainglory.pojo.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author vaingloryss
 * @date 2019/10/22 0022 上午 9:41
 */

public interface UserDao {
    User findByUsername(String username);

    void add(User user);
}
