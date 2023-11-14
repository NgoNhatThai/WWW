package com.edu.iuh.fit.www_lab7.backend.models;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "admin")
public class Admin {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long adminID;
    @Getter
    private String name;
    @Getter
    @Column(name = "password", columnDefinition = "varchar(15)")
    private String password;
    @Column(name = "isActive", columnDefinition = "bit")
    private boolean isActive;

    public Admin() {
    }

    public Admin(String name, String password, boolean isActive) {
        this.name = name;
        this.password = password;
        this.isActive = isActive;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
