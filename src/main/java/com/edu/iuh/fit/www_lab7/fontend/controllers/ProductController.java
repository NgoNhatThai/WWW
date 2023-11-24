package com.edu.iuh.fit.www_lab7.fontend.controllers;

import com.edu.iuh.fit.www_lab7.backend.enums.ProductStatus;
import com.edu.iuh.fit.www_lab7.backend.models.Product;
import com.edu.iuh.fit.www_lab7.backend.models.ProductPrice;
import com.edu.iuh.fit.www_lab7.backend.services.ProductPriceService;
import com.edu.iuh.fit.www_lab7.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductPriceService productPriceService;
    private Product product;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/getOneProductById")
    public Product getProductById(@RequestParam long id){
        return productService.getProductbyId(id);
    }
    @PostMapping("/addProduct")
    public void addNewProduct(@RequestParam String name, @RequestParam String unit, @RequestParam String company, @RequestParam String desc, @RequestParam double price, @RequestParam String note){

        Product product= new Product(name, desc, unit, company, ProductStatus.ACTIVE);
        this.product= product;
        ProductPrice productPrice= new ProductPrice(product, LocalDateTime.now(), price, note);
        productService.add(product);
        productPriceService.addPrice(productPrice);
    }
    @PostMapping("/deleteProduct")
    public void deleteProduct(@RequestParam long id){
        productService.delete(id);
    }
    @GetMapping("/getIdByName")
    public long getIdByName(@RequestParam String name){
        System.out.println(name);
        return productService.getIdByName(name);
    }
    @PostMapping("/setPriceByProductId")
    public void setPrice(@RequestParam double price, @RequestParam String note){
        System.out.println(product);
        productPriceService.setPrice(price, note, product);
    }
}
