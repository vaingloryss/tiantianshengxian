package com.vainglory.controller;

import com.vainglory.pojo.model.Cart;
import com.vainglory.pojo.model.User;
import com.vainglory.pojo.vo.CartVo;
import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.CartService;
import com.vainglory.util.R;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 下午 7:08
 */
@Controller
@RequiresAuthentication
@RequestMapping("/cartController/")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("show")
    public String show(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        List<CartVo> cartVoList = cartService.show(user.getId());
        model.addAttribute("cartVoList",cartVoList);
        return "cart";
    }

    @RequestMapping("addCart")
    @ResponseBody
    public R addCart(Cart cart, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        cart.setGmt_create(new Date());
        cart.setUserId(user.getId());
        cartService.addCart(cart);
        return R.ok();
    }
}
