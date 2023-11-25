package vn.edu.iuh.fit.www_lab5.fontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.www_lab5.backend.models.Company;
import vn.edu.iuh.fit.www_lab5.backend.services.CompanyService;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @GetMapping("/getListCompany")
    public List<Company> getAll(){
        return companyService.getAll();
    }
}
