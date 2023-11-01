FROM openjdk:17-jdk

WORKDIR /app

COPY target/feedbacks-0.0.1-SNAPSHOT.jar /app/feedbacks-0.0.1-SNAPSHOT.jar

EXPOSE 8079

CMD ["java", "-jar", "feedbacks-0.0.1-SNAPSHOT.jar"]