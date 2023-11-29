Mỗi bài tập được push lên 1 branch tương ứng.

# Quản Lý Đăng Nhập

Dự án này là một hệ thống quản lý đăng nhập với chức năng theo dõi đăng nhập của từng tài khoản, quyền của tài khoản và lưu lại trong cơ sở dữ liệu.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab1_logging_manager https://github.com/NgoNhatThai/WWW.git
    ```

2. Cài đặt các dependencies trong mục Build.gradle:

    ```bash
    compileOnly('jakarta.platform:jakarta.jakartaee-web-api:9.1.0')
    testImplementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
    ```
    Ngoài ra bạn cần tải Tomcat để khởi chạy dự án.

3. Cấu hình cơ sở dữ liệu:

    - Tải Workbench về máy và tạo 1 user *root* với mật khẩu là "*ngothai123*".
    - Truy cập bằng tải khoản *root* và tạo 1 cơ sở dữ liệu tên là "*mydb*".
    - Tạo 1 số account và quyền gán cho account.

4. Chạy ứng dụng:

    ```bash
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau đó chỉ cần run (with Tomcat), trang index.html sẽ được hiển thị trên Chrome của bạn
    ```

## Chức Năng

- **Đăng Nhập:**
  - Đăng nhập với tài khoản đúng với cơ sở dữ liệu.
    (*hoàn thành*)
- **Quản Lý Tài Khoản:**
  - Hiển thị thông tin tài khoản.
  - Cho phép đổi mật khẩu.
  - Mỗi lần đăng nhập sẽ được ghi lại trong cơ sở dữ liệu.
  - Thống kê số lượt đăng nhập của mỗi tài khoản.
    (*chưa hoàn thành*)

- **Thống Kê:**
  - Xem số lượt đăng nhập của mỗi tài khoản.
    (*chưa hoàn thành*)

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
   
   
   
