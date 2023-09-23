package com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Models;

public class GrantAccess {
    private String account_id;
    private String role_id;
    private isGrant is_grant;
    private String note;

    public GrantAccess(String account_id, String role_id, isGrant is_grant, String note) {
        this.account_id = account_id;
        this.role_id = role_id;
        this.is_grant = is_grant;
        this.note = note;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public isGrant getIs_grant() {
        return is_grant;
    }

    public void setIs_grant(isGrant is_grant) {
        this.is_grant = is_grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "account_id='" + account_id + '\'' +
                ", role_id='" + role_id + '\'' +
                ", is_grant=" + is_grant +
                ", note='" + note + '\'' +
                '}';
    }
}
