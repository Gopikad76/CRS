# Use OpenJDK image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy build jar to container
COPY target/*.jar app.jar

# Expose port (change if your app runs on another port)
EXPOSE 8050

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
