package com.test.controller;

import com.test.domain.Product;
import com.test.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IProductController  {

    @Autowired
    private IProductService productService;

    public ModelAndView findAll(){



        List<Product> all = productService.findAll();



        return (ModelAndView) all;


    }




}
