package com.vainglory.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface RoleDao {
    public Set<String> queryAllRolenameByUsername(@Param("username") String username);

    void add(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
}
