package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Customer;
import com.edu.iuh.fit.www_lab7.backend.repositories.CustomerResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerResponsitory customerResponsitory;

    public Customer getCustomerById(long id){
        return customerResponsitory.findById(id).get();
    }
}
