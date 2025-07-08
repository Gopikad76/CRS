# Use OpenJDK 17 with Maven
FROM maven:3.8.5-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy all files to container
COPY . .

# Build the jar
RUN mvn clean package -DskipTests

# Second stage: run the jar with a clean JDK image
FROM openjdk:17

WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Run the jar
CMD ["java", "-jar", "app.jar"]

# Expose port (change if using different port in Spring Boot)
EXPOSE 8080
