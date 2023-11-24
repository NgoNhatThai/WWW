package com.edu.iuh.fit.www_lab7.fontend.controllers;

import com.edu.iuh.fit.www_lab7.backend.models.*;
import com.edu.iuh.fit.www_lab7.backend.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProductService productService;
    @PostMapping("/createOrder")
    public void createOrder(@RequestParam double price,@RequestParam double quantity,@RequestParam long id){
        System.out.println("ok");

        Employee employee= employeeService.getEmployeeById(1);
        Customer customer= customerService.getCustomerById(1);
        Product product= productService.getProductbyId(id);

        Order order= new Order(LocalDateTime.now(), employee, customer);
        orderService.add(order);

        OrderDetail orderDetail= new OrderDetail(quantity, price, "", order, product);
        orderDetailService.add(orderDetail);
    }
}
