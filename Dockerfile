FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/servicedesk-api-0.0.1-SNAPSHOT.jar servicedesk-api.jar
ENTRYPOINT ["java","-jar","/servicedesk-api.jar"]