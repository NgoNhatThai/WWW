package com.edu.iuh.fit.www_lab7.backend.keys;

import com.edu.iuh.fit.www_lab7.backend.models.Order;
import com.edu.iuh.fit.www_lab7.backend.models.Product;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
