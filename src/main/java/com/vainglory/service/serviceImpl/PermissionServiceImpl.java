package com.vainglory.service.serviceImpl;

import com.vainglory.service.PermissionService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:55
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Override
    public Set<String> queryPermissionByUsername(String username) {
        return null;
    }
}
