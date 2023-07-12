## 현대오토에버 채용연계형 과제 - BE
### 🛠️ 사용된 기술 스택

<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white"></a>
<img src="https://img.shields.io/badge/spring_boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"><a>

[//]: # (<img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"></a>)

[//]: # (<img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">)

[//]: # (<img src="https://img.shields.io/badge/DOCKER-007396?style=for-the-badge&logo=DOCKER&logoColor=white">)

### 📃 스웨거 주소
http://localhost:8080/api-docs

### 🔑 실행 방법
1. git clone
2. mysql 접속
   1. create database MYCAR;
   2. use MYCAR; 
   3. 현재 프로젝트 디렉토리 루트 경로에서 ./MYCAR_20230711_backup.sql 실행
3. 아래 properties 파일 : ./src/main/resources/application.properties 파일 생성 후 작성
4. IntelliJ 를 통해 서버 실행

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