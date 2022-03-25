FROM openjdk:11-jre-slim

EXPOSE 8080

COPY ./target/demo-0.0.1-SNAPSHOT.jar /usr/app
WORKDIR /usr/app

CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]