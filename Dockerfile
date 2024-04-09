FROM openjdk:22

COPY target/MyForm-1.0.jar app/MyForm-1.0.jar

WORKDIR /app

CMD ["java", "-jar", "MyForm-1.0.jar"]