Mỗi bài tập được push lên 1 branch tương ứng.

## Mua sắm trực tuyến.

Dự án này là một hệ thống quản lý cho phép người dùng xem các sản phẩm, thêm sản phẩm vào giỏ hàng và tiến hành đặt hàng trực tuyến.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab7_shopping_springboot https://github.com/NgoNhatThai/WWW.git
    ```

2. Cài đặt các dependencies trong mục Build.gradle:

    ```bash
    implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
    implementation group: 'org.springframework.boot', name: 'spring-boot-starter-data-jpa', version: '3.1.4'
    ```
    Cấu hình trong application.properties:
    ```bash
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mariadb://localhost:3307/www_lab7_db
    spring.datasource.username=root
    spring.datasource.password=sapassword
    spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
    spring.jpa.show-sql=true
    spring.jpa.open-in-view=true
    ```
    **Lưu ý:**
   Lần đầu chạy dự án phải chỉnh property spring.jpa.hibernate.ddl-auto thành create, các lần chạy sau đổi thành update để tránh mất dữ liệu
   ```bash
   spring.jpa.hibernate.ddl-auto=create
   ```

4. Cấu hình cơ sở dữ liệu:

    - Tải MariaDB về máy và chỉnh port sử dụng thành 3307
    - Tạo 1 user *root* với mật khẩu là "*sapassword*".
    - Tạo 1 cơ sở dữ liệu tên là *www_lab7_db*

5. Chạy ứng dụng: 
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau khi chạy server, bạn vào Chrome gõ dòng lệnh sau để truy cập trang mua sắm:
   ```bash
   localhost:8080/my-home
   ```

## Chức Năng

- **Đăng nhập**
  - Khi vào trang my-home, các sản phẩm sẽ được hiển thị, nếu bạn muốn truy cập với quyền quản lý thì phải tiến hành đăng nhập.
  - Đăng nhập (dành cho quản lý) thành công khi tài khoản mật khẩu chính xác (*hoàn thành*)
- **CRUD sản phẩm (dành cho người quản lý)** 
  - Thao tác quản lý các sản phẩm (*hoàn thành*)
- **Quản lý giá sản phẩm theo thời gian** 
  - Khi thêm 1 sản phẩm mới, đơn giá sẽ lưu kèm với thời gian tạo. Các sản phẩm sẽ hiển thị giá tiền ứng với thời điểm gần nhất so với ngày hiện tại. (*hoàn thành*)
- **Xem sản phẩm** 
  - Khi vào trang my-home, ấn vào *Xem danh sach san pham* để xem các sản phẩm đang có. (*hoàn thành*)
- **Đặt hàng** 
  - Khi chọn được sản phẩm, ấn *Mua ngay* để vào trang đặt hàng. (*hoàn thành*)
  - Sau khi chọn các thông tin sản phẩm, ấn Đặt hàng để tạo hóa đơn và lưu xuống cơ sở dữ liệu. (*hoàn thành*)
- **Giỏ hàng** 
  - Thêm sản phẩm, đặt hàng sản phẩm, xóa sản phẩm khỏi giỏ hàng. (*chưa hoàn thành*)
- **Thống kê doanh thu** 
  - Quản lý doanh số và lợi nhuậ. (*chưa hoàn thành*)

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
