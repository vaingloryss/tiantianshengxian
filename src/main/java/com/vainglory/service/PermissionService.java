package com.vainglory.service;

import java.util.Set;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 5:54
 */
public interface PermissionService {
    Set<String> queryPermissionByUsername(String username);
}
