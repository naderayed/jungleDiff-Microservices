FROM openjdk:17-jdk

WORKDIR /app

COPY target/claims-1.jar /app/claims-1.jar

EXPOSE 8070

CMD ["java", "-jar", "claims-1.jar"]