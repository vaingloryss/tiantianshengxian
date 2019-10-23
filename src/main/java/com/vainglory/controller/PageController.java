package com.vainglory.controller;

import com.vainglory.pojo.model.Category;
import com.vainglory.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/10/23 0023 上午 9:33
 */
@Controller
@RequestMapping("/pageController/")
public class PageController {

    @Autowired
    private PageService pageService;

    @GetMapping("toIndex")
    public String toIndex(){
        return "index";
    }
    @GetMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @GetMapping("toRegister")
    public String toRegister(){
        return "register";
    }

    @GetMapping("category")
    public String loadCategory(Model model){
        List<Category> categoryList = pageService.indexCategoryList();
        model.addAttribute("categoryList",categoryList);
        return "forward:child/all_goods_category";
    }
}
