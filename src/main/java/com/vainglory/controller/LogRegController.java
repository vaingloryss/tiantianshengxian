package com.vainglory.controller;

import cn.dsna.util.images.ValidateCode;
import com.vainglory.pojo.model.User;
import com.vainglory.service.UserService;
import com.vainglory.util.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author vaingloryss
 * @date 2019/10/21 0021 下午 8:50
 */
@Slf4j
@Controller
@RequestMapping("/logRegController/")
@SessionAttributes(value = {"user","code"})
public class LogRegController {

    @Autowired
    UserService userService;

    @ResponseBody
    @PostMapping("register")
    public String register(User user){
        log.info("register:{}",user.toString());
        userService.register(user);
        //注册成功
        return "0";
    }

    @ResponseBody
    @GetMapping("checkUsername")
    public R checkUsername(String username){
        log.info("username：{}",username);
        User user = userService.checkUser(username);
        if (user != null){
            //用户已存在
            return R.error();
        }
        //用户不存在
        return R.ok();
    }

    @PostMapping("login")
    @ResponseBody
    public R login(String username, String password, String rememberMe, Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        if (rememberMe!=null){
            token.setRememberMe(true);
        }
        subject.login(token);
        model.addAttribute("user");
        User user = userService.queryUserByUsername(username);
        model.addAttribute("user",user);
        //登录成功
        return R.ok();
    }

    @GetMapping("validateCode")
    public void validateCode(Model model, HttpServletResponse response){
        ValidateCode validateCode = new ValidateCode(100,30,4,10);
        model.addAttribute("code",validateCode.getCode());
        try {
            validateCode.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @PostMapping("checkValidateCode")
    public R checkValidateCode(String validateCode, HttpServletRequest request){
        String code = request.getSession().getAttribute("code").toString();
        System.out.println(code);
        System.out.println(validateCode);
        if (validateCode.equalsIgnoreCase(code)){
            return R.ok();
        }
        return R.error();
    }

}
