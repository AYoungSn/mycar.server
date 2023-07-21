## 현대오토에버 채용연계형 과제 - BE

### 서비스 소개

현대자동차 내차만들기 사이트에서 투싼, 더 뉴 아반떼 차량에 대해 분석하고 기존 사이트와 동일하게 동작하는 사이트를 만들어보는 과제입니다.

폴더 구조는 헥사고날 아키텍처 구조를 기반으로 하고있습니다.

#### 프로젝트 진행 기간

- 2023.06.12 ~ 2023.07.21

#### 프론트 repo

https://github.com/AYoungSn/mycar.client

### 🛠️ 사용된 기술 스택

<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white"></a>
<img src="https://img.shields.io/badge/spring_boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=Spring&logoColor=white"></a>
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"><a>

- 구글 스타일 가이드 적용

[//]: # (<img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"></a>)

[//]: # (<img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">)

[//]: # (<img src="https://img.shields.io/badge/DOCKER-007396?style=for-the-badge&logo=DOCKER&logoColor=white">)

### DB ERD

<img width="826" alt="스크린샷 2023-07-18 오후 2 34 33" src="https://github.com/AYoungSn/mycar.server/assets/46748334/58dd1c81-26ba-4da1-8a8e-aba6629d2e57">

### 📃 Swagger(API 문서) 주소

- 실행 후 접속 가능합니다.

http://localhost:8080/api-docs

### 🔑 실행 방법

1. git clone
2. mysql 접속
    1. create database MYCAR;
    2. use MYCAR;
    3. 현재 프로젝트 디렉토리 루트 경로에서 ./MYCAR_20230721_backup.sql 실행
3. 아래 properties 파일 : ./src/main/resources/application.properties 파일 생성 후 작성
4. IntelliJ 를 통해 서버 실행

#### 👗 스타일 가이드 실행

```terminal
$ gradle check
```

#### application.properties

```properties
# swagger
springdoc.swagger-ui.path=/api-docs
springdoc.swagger-ui.default-consumes-media-type=application/json
springdoc.swagger-ui.default-produces-media-type=application/json
# DB (MySQL)
spring.datasource.url=jdbc:mysql://localhost:3306/MYCAR?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=qwerty123
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.use_sql_comments=false
```
