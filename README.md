Mỗi bài tập được push lên 1 branch tương ứng.

## Shopping web

Dự án này là một hệ thống quản lý mua sắm trực tuyến trên web, cho phép người dùng lựa chọn, thêm sản phẩm vào giỏ hàng hoặc đặt mua sản phẩm.

## Hướng Dẫn Cài Đặt

1. Lệnh clone dự án về máy:

    ```bash
    git clone --branch lab12_shopping_tomcat https://github.com/NgoNhatThai/WWW.git
    ```

2. Cài đặt các dependencies trong mục Build.gradle:

    ```bash
    compileOnly('jakarta.platform:jakarta.jakartaee-web-api:10.0.0')
    //for database
    implementation group: 'org.mariadb.jdbc', name: 'mariadb-java-client', version: '3.2.0'
    implementation 'org.eclipse.persistence:eclipselink:4.0.2'

    //for logging
    implementation 'org.slf4j:slf4j-api:2.0.9'
    implementation 'org.slf4j:slf4j-simple:2.0.9'

    //for REST API
    implementation 'org.glassfish.jersey.containers:jersey-container-servlet:3.1.3'
    implementation 'org.glassfish.jersey.media:jersey-media-json-jackson:3.1.3'
    implementation "org.glassfish.jersey.inject:jersey-hk2:3.1.3"
    implementation('org.jboss.weld.se:weld-se-core:5.1.0.Final')
    //for convert type in rest
    implementation 'com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.2'

    testImplementation("org.junit.jupiter:junit-jupiter-api:${junitVersion}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${junitVersion}")
    ```
    Cấu hình property trong Resource/persistence.xml
    ```bash
    <property name="jakarta.persistence.jdbc.driver"
                      value="org.mariadb.jdbc.Driver"/>
            <property name="jakarta.persistence.jdbc.url"

                      value="jdbc:mariadb://localhost:3307/week2?createDatabaseIfNotExist=true"/>
            <property name="jakarta.persistence.jdbc.user" value="root"/>
            <property name="jakarta.persistence.jdbc.password"
                      value="sapassword"/>
            <property name="jakarta.persistence.schema-generation.database.action" value="create"/>
            <!--show query-->
            <property name="eclipselink.logging.level.sql" value="FINE"/>
            <property name="eclipselink.logging.parameters" value="true"/>
    ```
    Ngoài ra bạn cần tải Tomcat để khởi chạy dự án.

4. Cấu hình cơ sở dữ liệu:

    - Tải MariaDB về máy và chỉnh port sử dụng thành 3307
    - Tạo 1 user *root* với mật khẩu là "*sapassword*".
    - Tạo 1 số sản phẩm trong database.

5. Chạy ứng dụng: 
    Nếu bạn dùng IntelliJ (IDEA) thì khi mở project thì dự án sẽ được build tự động, hoặc nếu bạn dùng các IDEs khác thì có thể chuột phải vào project và chọn *Build project*.
    Sau đó chỉ cần run (with Tomcat), trang index.html sẽ được hiển thị trên Chrome của bạn

## Chức Năng

- **Xem sản phẩm**
  - Hiển thị các sản phẩm lên trang index.html
    (*hoàn thành*)
- **Quản Lý Mua Sắm:** (*chưa hoàn thành*)
  - Thêm các sản phẩm vào giỏ hàng, thao tác xem/ đặt/ hủy các sản phẩm trong giỏ
  - Cho phép người dùng đặt hàng.
  - Các thông tin đơn hàng, số lượng hàng sẽ được cập nhật trong cơ sở dữ liệu.

## Đóng Góp

Nếu bạn muốn đóng góp vào dự án, vui lòng liên hệ email ngothai9a1@gmail.com

## Giấy Phép

Dự án này chưa được cấp phép.
