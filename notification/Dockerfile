
FROM openjdk:17-jdk

WORKDIR /app

COPY target/notification-0.0.1-SNAPSHOT.jar /app/notification-0.0.1-SNAPSHOT.jar

EXPOSE 8076

CMD ["java", "-jar", "notification-0.0.1-SNAPSHOT.jar"]