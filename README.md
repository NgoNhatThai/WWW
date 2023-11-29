Mỗi bài tập được push lên 1 branch tương ứng.

## Llogs web

Dự án này là một hệ thống quản lý cho phép người dùng có thể đăng bài, comment hoặc trả lời comment của người dùng khác.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab6_blogs https://github.com/NgoNhatThai/WWW.git
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
    spring.datasource.url=jdbc:mariadb://localhost:3307/www_lab6_db
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
    - Tạo 1 cơ sở dữ liệu tên là *www_lab6_db*

5. Chạy ứng dụng: 
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau khi chạy server, bạn vào Chrome gõ dòng lệnh sau để truy cập trang đăng nhập (mật khẩu mật định **123**):
   ```bash
   localhost:8080/login
   ```

## Chức Năng

- **Đăng nhập**
  - Đăng nhập thành công khi tài khoản mật khẩu chính xác (*chưa hoàn thành*)
- **Đăng bài** 
  - Đăng các blogs. (*chưa hoàn thành*)
- **Xem bài** 
  - Xem các bài đăng. (*chưa hoàn thành*)
- **Bình luận** 
  - Bình luận vào các blogs (*chưa hoàn thành*)
- **Trả lời bình luận** 
  - Trả lời các bình luận (*chưa hoàn thành*)
- **Quản lý đăng nhập** 
  - Quản lý số lượt và thời gian đăng nhập của người dùng. (*chưa hoàn thành*)

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
