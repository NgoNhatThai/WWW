package vn.edu.iuh.fit.www_lab5.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab5.backend.models.Company;
import vn.edu.iuh.fit.www_lab5.backend.repositories.CompanyRespository;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRespository companyRespository;

    public List<Company> getAll(){
        return companyRespository.findAll();
    }

}
