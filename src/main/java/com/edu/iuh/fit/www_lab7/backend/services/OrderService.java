package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Order;
import com.edu.iuh.fit.www_lab7.backend.repositories.OrderResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderResponsitory orderResponsitory;

    public void add(Order order){
        orderResponsitory.save(order);
    }
}
