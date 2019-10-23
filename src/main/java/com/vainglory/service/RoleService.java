package com.vainglory.service;

import java.util.Set;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 5:54
 */
public interface RoleService {
    Set<String> queryRoleNameByUsername(String username);
}
