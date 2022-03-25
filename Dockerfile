FROM openjdk:11-jre-slim
COPY ./target/*.jar /usr/local/lib/app.jar
EXPOSE 8080
CMD ["java","-jar","/usr/local/lib/app.jar"]