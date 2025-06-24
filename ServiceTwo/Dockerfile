# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY /target/ServiceTwo-0.0.1-SNAPSHOT.jar service-Two.jar

# Expose the port the app runs on
EXPOSE 8090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "service-Two.jar"]