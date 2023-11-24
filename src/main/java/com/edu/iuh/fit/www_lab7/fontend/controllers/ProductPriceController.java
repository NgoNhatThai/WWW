package com.edu.iuh.fit.www_lab7.fontend.controllers;

import com.edu.iuh.fit.www_lab7.backend.services.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductPriceController {
    @Autowired
    private ProductPriceService productPriceService;

    @GetMapping("/getPriceProduct")
    public double getPriceProduct(@RequestParam long id){
        return productPriceService.getPriceById(id);
    }

}
