FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-registery.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/service-registery.jar"]