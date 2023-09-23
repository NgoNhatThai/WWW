package com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Controllers;

import com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Models.Account;
import com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Repositories.AccountRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ControllerGetAndCreateAccount")
public class ControllerGetAndCreateAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountRepository accR= new AccountRepository();
        List<Account> accountList= accR.getAll();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountRepository accR= new AccountRepository();
        Account account= new Account();
        account.setAccount_id(req.getParameter("id"));
        account.setFull_name(req.getParameter("full_name"));
        account.setPassword(req.getParameter("password"));
        account.setEmail(req.getParameter("email"));
        account.setStatus(Integer.parseInt(req.getParameter("status")));
        accR.create(account);
    }
}

