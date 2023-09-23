package vn.edu.iuh.fit.www_week2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.SplittableRandom;
@Entity
@Table(name = "customers")
public class Customer {
    //customer (cust_id, cust_name, email, phone, address)
    @Id
    @Column(name = "cust_id")
    private int custId;
    @Column(name = "cust-name")
    private String custName;
    private String email;
    private String phone;
    private String address;

    public Customer() {
    }

    public Customer(int custId, String custName, String email, String phone, String address) {
        this.custId = custId;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
