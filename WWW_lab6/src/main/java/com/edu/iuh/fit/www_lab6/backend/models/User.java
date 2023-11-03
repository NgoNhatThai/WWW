package com.edu.iuh.fit.www_lab6.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "first_name", columnDefinition = "varchar(50)")
    private String firstName;
    @Column(name = "last_name", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(name = "email", columnDefinition = "varchar(50)")

    private String email;
    @Column(name = "intro", columnDefinition = "tinytext")
    private String intro;
    @Column(name = "last_login", columnDefinition = "datetime(6)")
    private LocalDate lastLogin;
    @Column(name = "middle_name", columnDefinition = "varchar(50)")
    private String middleName;
    @Column(name = "mobile", columnDefinition = "varchar(15)")
    private String mobile;
    @Column(name = "password_hash", columnDefinition = "varchar(32)")
    private String passwordHash;
    @Column(name = "profile", columnDefinition = "tinytext")
    private String profile;
    @Column(name = "register_at", columnDefinition = "datetime(6)")
    private LocalDate registeredAt;

    public User() {
    }

    public User(String firstName, String lastName, String email, String intro, LocalDate lastLogin, String middleName, String mobile, String passwordHash, String profile, LocalDate registeredAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.intro = intro;
        this.lastLogin = lastLogin;
        this.middleName = middleName;
        this.mobile = mobile;
        this.passwordHash = passwordHash;
        this.profile = profile;
        this.registeredAt = registeredAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public LocalDate getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDate registeredAt) {
        this.registeredAt = registeredAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", intro='" + intro + '\'' +
                ", lastLogin=" + lastLogin +
                ", middleName='" + middleName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", profile='" + profile + '\'' +
                ", registeredAt=" + registeredAt +
                '}';
    }
}
