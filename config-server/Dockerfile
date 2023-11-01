FROM openjdk:17-jdk

WORKDIR /app

COPY target/config-server-1.jar /app/config-server-1.jar

EXPOSE 8888

CMD ["java", "-jar", "config-server-1.jar"]