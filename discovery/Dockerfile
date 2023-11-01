FROM openjdk:17-jdk

WORKDIR /app

COPY target/discovery-1.jar /app/discovery-1.jar

EXPOSE 8761

CMD ["java", "-jar", "discovery-1.jar"]