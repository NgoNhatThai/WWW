package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Product;
import com.edu.iuh.fit.www_lab7.backend.repositories.ProductImageResponsitory;
import com.edu.iuh.fit.www_lab7.backend.repositories.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductResponsitory productResponsitory;
    public List<Product> getAll(){
        return productResponsitory.findAll();
    }
    public void add(Product p){
        productResponsitory.save(p);
    }
    public void delete(long id){
        productResponsitory.deleteById(id);
    }
    public Product getProductbyId(long id){
        return productResponsitory.findById(id).get();
    }
    public long getIdByName(String name){
        List<Product> list;
        final long[] id = {-1};
        list= productResponsitory.findAll();
        System.out.println(list);
        list.forEach((item) -> {
            if(item.getName().trim().equals(name.trim())){
                id[0] = item.getProduct_id();
            }
        });
        return id[0];
    }
}
