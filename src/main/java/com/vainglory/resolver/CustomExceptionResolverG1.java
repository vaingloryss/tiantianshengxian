package com.vainglory.resolver;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:33
 */
public class CustomExceptionResolverG1 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println(ex.getClass());
        String loginMSG = "";
        ex.printStackTrace();
        ModelAndView mv = new ModelAndView();
        if (ex instanceof IncorrectCredentialsException || ex instanceof UnknownAccountException){
            loginMSG="用户名或密码错误...";
            mv.addObject("loginMSG",loginMSG);
            mv.setViewName("login");
        }else if (ex instanceof UnauthenticatedException){
            mv.setViewName("login");
        }
        return mv;
    }
}
