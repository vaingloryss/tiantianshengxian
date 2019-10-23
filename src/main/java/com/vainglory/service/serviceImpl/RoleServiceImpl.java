package com.vainglory.service.serviceImpl;

import com.vainglory.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:54
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Override
    public Set<String> queryRoleNameByUsername(String username) {
        return null;
    }
}
