package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.OrderDetail;
import com.edu.iuh.fit.www_lab7.backend.repositories.OrderDetailResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailResponsitory orderDetailResponsitory;

    public void add(OrderDetail orderDetail){
        orderDetailResponsitory.save(orderDetail);
    }
}
