
    function buyProduct(productName) {
    // Hiển thị chức năng thêm mới khách hàng
    document.getElementById("customerForm").style.display = "block";

    // Đặt tên sản phẩm vào mẫu thêm mới khách hàng
    document.getElementById("customerName").value = "Khách hàng mua " + productName;
}

    document.getElementById("customerForm").addEventListener("submit", function (event) {
    event.preventDefault();

    var customerName = document.getElementById("customerName").value;
    var customerEmail = document.getElementById("customerEmail").value;

    // Gửi dữ liệu khách hàng lên máy chủ và xử lý ở đây

    // Sau khi xử lý thành công, có thể hiển thị thông báo hoặc làm gì đó khác.

    // Ví dụ:
    alert("Đã thêm mới khách hàng: " + customerName);
});
    function buyProduct(productName, productPrice) {
    // Tạo một đối tượng đại diện cho sản phẩm
    var product = {
    name: productName,
    price: productPrice
};

    // Thêm sản phẩm vào giỏ hàng
    cartItems.push(product);

    // Cập nhật hiển thị giỏ hàng
    updateCartDisplay();
}
    var cartItems = [];
    function updateCartDisplay() {
        var cartList = document.getElementById("cart-items");
        cartList.innerHTML = ''; // Xóa danh sách sản phẩm trong giỏ hàng hiện tại

        // Thêm lại các sản phẩm từ mảng vào giỏ hàng
        cartItems.forEach(function (item) {
            var listItem = document.createElement("li");
            listItem.textContent = item.name + ': Giá $' + item.price;
            cartList.appendChild(listItem);
        });
    }