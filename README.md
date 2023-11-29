Mỗi bài tập được push lên 1 branch tương ứng.

## Quản lý đăng nhập
Dự án này là một hệ thống quản lý cho phép người dùng đăng nhập dựa theo các quyền được gán.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab8_security https://github.com/NgoNhatThai/WWW.git
    ```

2. Cài đặt các dependencies trong mục Build.gradle:

    ```bash
    implementation 'org.springframework.boot:spring-boot-starter-security'
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity6'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.springframework.security:spring-security-test'
    implementation 'org.springframework.boot:spring-boot-starter-data-jdbc'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.springframework.security:spring-security-test'

    ```
    Cấu hình trong application.properties:
    ```bash
    spring.main.allow-circular-references=true

    spring.jpa.hibernate.ddl-auto=create-drop
    spring.jpa.show-sql=true
    spring.h2.console.enabled=true
    
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=sapassword
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```
    **Lưu ý:**
   Lần đầu chạy dự án phải chỉnh property spring.jpa.hibernate.ddl-auto thành create-drop, các lần chạy sau đổi thành update để tránh mất dữ liệu
   ```bash
   spring.jpa.hibernate.ddl-auto=create
   ```

4. Cấu hình cơ sở dữ liệu:

    - Tải H2 về máy và tạo user *sa* với mật khẩu là *sapassword*

5. Chạy ứng dụng: 
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau khi chạy server, bạn vào Chrome gõ dòng lệnh sau để truy cập:
   ```bash
   localhost:8080/index
   ```

## Chức Năng

- **Đăng nhập theo quyền**
  - Khi vào trang index, có 2 đường dẫn đến trang Admin và User, tùy tài khoản đăng nhập mà bạn có quyền truy cập tương ứng (*hoàn thành*)


## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
