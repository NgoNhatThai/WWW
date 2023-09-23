<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chủ đề bán sản phẩm</title>
    <style>
        /* CSS để giãn cách khoảng cách giữa các sản phẩm */
        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            margin-bottom: 10px; /* Khoảng cách giữa các sản phẩm */
        }

        button {
            margin-left: 10px; /* Khoảng cách giữa nút Mua và sản phẩm */
        }
    </style>
    <script src="script.js"></script>
</head>
<body>
<div id="cart">
    <h2><a href="ShoppingCart.html">Giỏ hàng</a></h2>
    <ul id="cart-items">
        <!-- Danh sách sản phẩm trong giỏ hàng sẽ được cập nhật ở đây -->
    </ul>
</div>
<h1>Chủ đề bán sản phẩm</h1>

<h2>Danh sách sản phẩm</h2>
<ul>
    <li>Sản phẩm 1: Giá $100 <button onclick="buyProduct('Sản phẩm 1')">Mua</button></li>
    <li>Sản phẩm 2: Giá $75 <button onclick="buyProduct('Sản phẩm 2')">Mua</button></li>
    <li>Sản phẩm 3: Giá $50 <button onclick="buyProduct('Sản phẩm 3')">Mua</button></li>
</ul>

<h2>Tạo tài khoản khách hàng</h2>
<form id="customerForm">
    <label for="customerName">Tên khách hàng:</label>
    <input type="text" id="customerName" name="customerName" required><br><br>

    <label for="customerEmail">Email khách hàng:</label>
    <input type="email" id="customerEmail" name="customerEmail" required><br><br>

    <input type="submit" value="Thêm mới khách hàng">
</form>

</body>
</html>