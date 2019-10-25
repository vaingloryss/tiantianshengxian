package com.vainglory.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vainglory.pojo.model.Category;
import com.vainglory.pojo.vo.GoodsAndCategoryModel;
import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.GoodsService;
import com.vainglory.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    private GoodsService goodsService;

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
    @GetMapping("goodsDetail")
    public String showGoodsDetail(){
        return "detail";
    }
    @GetMapping("toList")
    public String showMore(){
        return "list";
    }

    @GetMapping("category")
    public String loadCategory(Model model){
        List<Category> categoryList = pageService.indexCategoryList();
        model.addAttribute("categoryList",categoryList);
        return "child/all_goods_category";
    }

    @GetMapping("GoodsAndCategoryModel/{id}")
    public String loadCategoryModel(@PathVariable("id")Integer categoryId,Model model){
        GoodsAndCategoryModel goodsAndCategoryModel = pageService.getGoodsAndCategoryModel(categoryId);
        model.addAttribute("goodsAndCategoryModel",goodsAndCategoryModel);
        return "child/category_model";
    }

    @GetMapping("showMore/{categoryId}/{sortBy}/{pageNum}")
    public String toMore(@PathVariable("categoryId") Integer categoryId,@PathVariable("sortBy") Integer sortBy,@PathVariable("pageNum") Integer pageNum,Model model){
        String sort = "";
        if (pageNum==null){
            pageNum=1;
        }
        if (sortBy==1){
            sort = "tb_goods.gmt_create desc";
        }
        if (sortBy==2){
            sort="tb_goods.price desc";
        }
        PageHelper.startPage(pageNum,5,sort);
        List<GoodsAndPicture> goodsAndPictureList = goodsService.findByCategoryId(categoryId);
        PageInfo pageInfo = new PageInfo(goodsAndPictureList);
        model.addAttribute("pageInfo",pageInfo);
        return "child/more_goods";
    }
}
