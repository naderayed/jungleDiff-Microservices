FROM openjdk:17-jdk

WORKDIR /app

COPY target/gateway-1.jar /app/gateway-1.jar

EXPOSE 8222

CMD ["java", "-jar", "gateway-1.jar"]