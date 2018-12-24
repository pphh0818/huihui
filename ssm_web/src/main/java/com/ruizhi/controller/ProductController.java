package com.ruizhi.controller;

import com.ruizhi.domain.Product;
import com.ruizhi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> productList = iProductService.findAll();
        mv.addObject("productList",productList);
        mv.setViewName("product-list");
        System.out.println("哈哈");
        System.out.println("你好啊，哈哈");
        return mv;
    }
}
