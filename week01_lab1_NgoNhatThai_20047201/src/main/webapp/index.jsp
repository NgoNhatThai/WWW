<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/09/2023
  Time: 6:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .form-group button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }
        .container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }
        .signup-link {
            text-align: center;
            margin-top: 15px;
        }
        .signup-link a {
            color: #007bff; /* Màu liên kết */
            text-decoration: none; /* Loại bỏ gạch chân */
            margin-left: 5px; /* Khoảng cách với nút đăng ký */
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Đăng Nhập</h2>
    <form action="#" method="post">
        <div class="form-group">
            <label for="username">Tài khoản:</label>
            <input type="text" id="username" name="name" required>
        </div>
        <div class="form-group">
            <label for="password">Mật khẩu:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <button type="submit">Đăng Nhập</button>
        </div>
        <div class="form-group">
            <div class="signup-link">
                Bạn chưa có tài khoản? <a href="SignUp.jsp">Đăng ký</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>
