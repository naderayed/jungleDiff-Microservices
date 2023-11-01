FROM openjdk:17-jdk

WORKDIR /app

COPY target/emergency-0.0.1-SNAPSHOT.jar /app/emergency-0.0.1-SNAPSHOT.jar

EXPOSE 8090

CMD ["java", "-jar", "emergency-0.0.1-SNAPSHOT.jar"]