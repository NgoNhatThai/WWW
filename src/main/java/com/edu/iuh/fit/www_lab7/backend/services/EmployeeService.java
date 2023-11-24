package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Employee;
import com.edu.iuh.fit.www_lab7.backend.repositories.EmployeeResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeResponsitory employeeResponsitory;

    public Employee getEmployeeById(long id){
        return employeeResponsitory.findById(id).get();
    }
}
