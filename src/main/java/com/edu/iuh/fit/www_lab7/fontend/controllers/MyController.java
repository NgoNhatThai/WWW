package com.edu.iuh.fit.www_lab7.fontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/my-home")
    public String myHome(){
        return "home";
    }
    @GetMapping("/view-products")
    public String viewProducts(){
        return "customer/productViewPage";
    }
}
