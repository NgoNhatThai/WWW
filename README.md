Mỗi bài tập được push lên 1 branch tương ứng.

## Tìm kiếm việc làm

Dự án này là một hệ thống quản lý cho phép người dùng có thể tìm kiếm các công việc phù hợp hoặc đăng các tin tuyển dụng.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab5_jobs https://github.com/NgoNhatThai/WWW.git
    ```

2. Cài đặt các dependencies trong mục Build.gradle:

    ```bash
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	runtimeOnly 'org.mariadb.jdbc:mariadb-java-client'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	implementation group: 'org.springframework.boot', name: 'spring-boot-starter-data-jpa', version: '3.1.4'
    ```
    Cấu hình trong application.properties:
    ```bash
    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mariadb://localhost:3307/www_week5
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
    - Tạo 1 cơ sở dữ liệu tên là *www_week5*
    - Tạo 1 số sản phẩm trong database.

5. Chạy ứng dụng: 
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau khi chạy server, bạn vào Chrome gõ dòng lệnh sau để truy cập trang đăng nhập (mật khẩu mật định **123**):
   ```bash
   localhost:8080/login
   ```

## Chức Năng

- **Đăng nhập**
  - Khi đăng nhập, nếu tài khoản đúng thì xét theo loại user bạn chọn (ứng viên hay nhà tuyển dụng) thì hệ thống sẽ đưa bạn đến trang Home tương ứng.
    (*hoàn thành*)
- **Đăng Tin Tuyển Dụng:** 
  - Đăng tin tuyển dụng mới. (*hoàn thành*)
  - Cho phép người tìm việc xem các tin tuyển dụng. (*hoàn thành*)
  - Tự động cho hiển thị các tin tuyển dụng phù hợp với ứng viên. (*chưa hoàn thành*)

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
