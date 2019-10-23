package com.vainglory.dao;

import java.util.Set;

public interface PermissionDao {
    public Set<String> queryAllPermissionByUsername(String username);
}
