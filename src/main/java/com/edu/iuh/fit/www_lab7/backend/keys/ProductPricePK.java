package com.edu.iuh.fit.www_lab7.backend.keys;

import com.edu.iuh.fit.www_lab7.backend.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter @Getter
public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;
}
