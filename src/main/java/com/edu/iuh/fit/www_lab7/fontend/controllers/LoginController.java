package com.edu.iuh.fit.www_lab7.fontend.controllers;

import com.edu.iuh.fit.www_lab7.backend.models.Admin;
import com.edu.iuh.fit.www_lab7.backend.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/admins")
    public List<Admin> getAll(){
        return adminService.getAll();
    }

}
