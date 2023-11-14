package com.edu.iuh.fit.www_lab7.fontend.controllers;

import com.edu.iuh.fit.www_lab7.backend.enums.ProductStatus;
import com.edu.iuh.fit.www_lab7.backend.models.Product;
import com.edu.iuh.fit.www_lab7.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/getOneProductById")
    public Product getProductById(@RequestParam long id){
        return productService.getProductbyId(id);
    }
    @PostMapping("/addProduct")
    public void addNewProduct(@RequestParam String name, @RequestParam String unit, @RequestParam String company, @RequestParam String desc){
       Product product= new Product(name, desc, unit, company, ProductStatus.ACTIVE);
       productService.add(product);
    }
    @PostMapping("/deleteProduct")
    public void deleteProduct(@RequestParam long id){
        productService.delete(id);
    }
}
