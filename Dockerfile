FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/*.jar app.jar

CMD ["java", "-cp", "app.jar", "com.example.App"]