package vn.edu.iuh.fit.www_lab5.fontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @GetMapping("loginToCandidate")
    public String loginToCandidate(){
        return "candidate/home-candidate";
    }
    @GetMapping("loginToCompany")
    public String loginToCompany(){
        return "company/home-company";
    }

}
