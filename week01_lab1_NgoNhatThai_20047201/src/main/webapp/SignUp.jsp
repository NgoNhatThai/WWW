<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        label, input {
            display: block;
            width: 30%;
            margin-left: 5px;
        }
    </style>
</head>
<body>
<form action="ControllerGetAndCreateAccount" method="post">
    <label for="id">Enter id:</label>
    <input type="text" id="id" name="id" required><br><br>


    <label for="name">Name:</label>
    <input type="text" id="name" name="full_name" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="repassword">Re-enter Password:</label>
    <input type="password" id="repassword" name="repassword" required><br><br>

    <label for="status">Status:</label>
    <input type="text" id="status" name="status" required><br><br>

    <input type="submit" value="Create Account" width="30px">
</form>
</body>
</html>