package vn.edu.iuh.fit.www_week2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import vn.edu.iuh.fit.www_week2.enums.EmployeeStatus;

import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {
    //employee (emp_id, full_name, dob, email, phone, address, status)
    @Id
    @Column(name = "employee_id", nullable = false)
    private int employeeId;
    @Column(name = "full_name")
    private String fullName;
    private Date dob;
    private String email;
    private String phone;
    private String address;
    @Column(name = "status")
    private EmployeeStatus employeeStatus;

    public Employee() {
    }

    public Employee(int employeeId, String fullName, Date dob, String email, String phone, String address, EmployeeStatus employeeStatus) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.employeeStatus = employeeStatus;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", employeeStatus=" + employeeStatus +
                '}';
    }
}
