# autoever.myCar.server
현대 오토에버 채용연계형 과제 백엔드 레포지토리입니다.

```properties
# swagger
springdoc.swagger-ui.path = /api-docs
springdoc.swagger-ui.default-consumes-media-type= application/json
springdoc.swagger-ui.default-produces-media-type= application/json

# DB (MySQL)
spring.datasource.url=jdbc:mysql://localhost:3306/MYCAR?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
spring.datasource.driverClassName= com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=qwerty123

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.use_sql_comments=false
```