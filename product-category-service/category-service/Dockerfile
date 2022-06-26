FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} category-service.jar
ENTRYPOINT ["java","-jar","/category-service.jar"]