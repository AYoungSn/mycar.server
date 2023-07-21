FROM openjdk:11
ARG JAR_FILE=build/libs/mycar.server-0.0.1.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]