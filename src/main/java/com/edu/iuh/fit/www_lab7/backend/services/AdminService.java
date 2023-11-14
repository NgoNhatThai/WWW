package com.edu.iuh.fit.www_lab7.backend.services;

import com.edu.iuh.fit.www_lab7.backend.models.Admin;
import com.edu.iuh.fit.www_lab7.backend.repositories.AdminRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRespository adminRespository;
    public List<Admin> getAll(){
        return adminRespository.findAll();
    }

}
