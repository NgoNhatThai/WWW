Mỗi bài tập được push lên 1 branch tương ứng.

# Quản Lý Đăng Nhập

Dự án này là một hệ thống quản lý đăng nhập với chức năng theo dõi số lượt đăng nhập của từng tài khoản trong cơ sở dữ liệu.

## Hướng Dẫn Cài Đặt

1. Clone dự án về máy của bạn:

    ```bash
    git clone https://github.com/your-username/login-management.git
    ```

2. Cài đặt dependencies:

    ```bash
    npm install
    ```

3. Cấu hình cơ sở dữ liệu:

    - Tạo một cơ sở dữ liệu MySQL.
    - Cập nhật thông tin kết nối trong file `config/database.js`.

4. Chạy ứng dụng:

    ```bash
    npm start
    ```

5. Mở trình duyệt và truy cập [http://localhost:3000](http://localhost:3000).

## Chức Năng

- **Đăng Nhập:**
  - Mỗi lần đăng nhập sẽ được ghi lại trong cơ sở dữ liệu.
  - Thống kê số lượt đăng nhập của mỗi tài khoản.

- **Quản Lý Tài Khoản:**
  - Hiển thị thông tin tài khoản.
  - Cho phép đổi mật khẩu.

- **Thống Kê:**
  - Xem số lượt đăng nhập của mỗi tài khoản.

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng đọc [Hướng Dẫn Đóng Góp](CONTRIBUTING.md).

## Giấy Phép

Dự án này được cấp phép dưới [Tên Giấy Phép, Ví Dụ: MIT License](LICENSE).
   
   
   
