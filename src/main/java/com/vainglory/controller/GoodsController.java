package com.vainglory.controller;

import com.vainglory.pojo.vo.GoodsAndPicture;
import com.vainglory.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vaingloryss
 * @date 2019/10/24 0024 下午 4:22
 */
@Controller
@RequestMapping("/goodsController/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("showDetail/{goodsId}")
    public String showDetail(@PathVariable("goodsId") Integer goodsId, Model model){
         GoodsAndPicture goodsAndPicture = goodsService.goodsDetail(goodsId);
         model.addAttribute("goodsAndPicture",goodsAndPicture);
         return "detail";
    }
}
