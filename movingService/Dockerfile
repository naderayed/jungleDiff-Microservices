FROM openjdk:17-jdk

WORKDIR /app

COPY target/movingService-0.0.1-SNAPSHOT.jar /app/movingService-0.0.1-SNAPSHOT.jar

EXPOSE 8050

CMD ["java", "-jar", "movingService-0.0.1-SNAPSHOT.jar"]