package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Product;
import com.edu.iuh.fit.www_lab7.backend.models.ProductPrice;
import com.edu.iuh.fit.www_lab7.backend.repositories.ProductPriceResponsitory;
import com.edu.iuh.fit.www_lab7.backend.repositories.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceResponsitory productPriceResponsitory;
    @Autowired
    private ProductResponsitory productResponsitory;
    public double getPriceById(long id) {
        List<ProductPrice> list = productPriceResponsitory.findAll();
        double priceInDate = 0;
        LocalDate currentDate = LocalDate.now();
        List<ProductPrice> listById = new ArrayList<>();
        list.forEach((item) -> {
            if (item.getProduct().getProduct_id() == id) {
                listById.add(item);
            }
        });
        ProductPrice nearestPrice = listById.stream()
                .min(Comparator.comparingDouble(price -> Math.abs(ChronoUnit.DAYS.between(currentDate, price.getPrice_date_time()))))
                .orElse(null);
        return nearestPrice.getPrice();
    }
    public void setPrice(double price, String note, Product product){
        ProductPrice productPrice= new ProductPrice(product, LocalDateTime.now(), price, note);
        productPriceResponsitory.save(productPrice);
    }
    public void addPrice(ProductPrice productPrice){
        productPriceResponsitory.save(productPrice);
    }
}
