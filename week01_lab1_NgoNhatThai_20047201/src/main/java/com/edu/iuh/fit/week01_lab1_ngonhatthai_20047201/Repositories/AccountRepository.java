package com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Repositories;

import com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Connection.connection;
import com.edu.iuh.fit.week01_lab1_ngonhatthai_20047201.Models.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository{
    private static Connection connect = connection.createConnection();
    public void create(Account account) {
        String sql = "INSERT INTO account VALUES (?, ?, ?, ?, ?, ?)";


        try {
             PreparedStatement preparedStatement = connect.prepareStatement(sql);


            preparedStatement.setString(1, account.getAccount_id());
            preparedStatement.setString(2, account.getFull_name());
            preparedStatement.setString(3, account.getPassword());
            preparedStatement.setString(4, account.getEmail());
            preparedStatement.setString(5, account.getPhone());
            preparedStatement.setInt(6, account.getStatus());

            preparedStatement.executeUpdate();
            System.out.println("--correct insert on database");

        } catch (SQLException e) {
            System.err.println("--incorrect insert on database. " + e.getMessage());
        }
    }

    public void delete(String id) {
        String sql = "DELETE FROM account WHERE id = ?";

        try {
             PreparedStatement preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

            System.out.println("--correct delete");

        } catch (SQLException e) {
            System.err.println("--incorrect delete. " + e.getMessage());
        }
    }

    public List<Account> getAll() {
        String sql = "SELECT * FROM account";
        List<Account> acc = new ArrayList<>();

        try{
             Statement statement = connect.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Account a = new Account();
                a.setAccount_id(resultSet.getString("account_id"));
                a.setFull_name(resultSet.getString("full_name"));
                a.setPassword(resultSet.getString("password"));
                a.setEmail(resultSet.getString("email")); // Fix: Should be "email"
                a.setPhone(resultSet.getString("phone")); // Fix: Added to set phone
                a.setStatus(resultSet.getInt("status"));

                acc.add(a);
            }

            System.out.println("--correct find");
            return acc;

        } catch (SQLException e) {
            System.err.println("--incorrect find. " + e.getMessage());
            return null;
        }
    }

    public boolean checkLogIn(String id, String pw) {
        String sql = "SELECT * FROM account WHERE account_id = ? AND password = ?";

        try{
             PreparedStatement preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, id);
            preparedStatement.setString(2, pw);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                System.out.println("--true");
                return rs.next();
            }

        } catch (SQLException e) {
            System.err.println("--false " + e.getMessage());
        }

        return false;
    }
}
