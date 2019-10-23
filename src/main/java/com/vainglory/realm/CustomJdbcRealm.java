package com.vainglory.realm;

import com.vainglory.pojo.model.User;
import com.vainglory.service.PermissionService;
import com.vainglory.service.RoleService;
import com.vainglory.service.UserService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.Set;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 5:40
 */
@Slf4j
@Getter
@Setter
public class CustomJdbcRealm extends AuthorizingRealm {
    private UserService userService;
    private RoleService roleService;
    private PermissionService permissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        log.info("CustomJdbcRealm日志：验证用户角色和权限...");
        Set<String> roleNames = roleService.queryRoleNameByUsername(username);
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();

        log.info("用户角色：");
        for (String roleName : roleNames) {
            log.info(roleName);
        }
        Set<String> perms = permissionService.queryPermissionByUsername(username);
        log.info("用户权限：");
        for (String perm : perms) {
            log.info(perm);
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo(roleNames);
        simpleAuthorizationInfo.setStringPermissions(perms);
        return simpleAuthorizationInfo;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        System.out.println(username);
        log.info("CustomJdbcRealm日志：身份验证...");
        User user = userService.queryUserByUsername(username);
        System.out.println("用户：");
        System.out.println(user.toString());
        if (user==null){
            return null;
        }
        return new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                this.getName());
    }
}
