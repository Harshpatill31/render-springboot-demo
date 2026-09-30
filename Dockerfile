FROM eclipse-temurin:21-jdk-jammy
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/renderdemo-0.0.1-SNAPSHOT.jar"]
