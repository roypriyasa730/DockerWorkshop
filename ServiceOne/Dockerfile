# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY /target/ServiceOne-0.0.1-SNAPSHOT.jar ServiceOne-0.0.1-SNAPSHOT.jar

# Expose the port that the application listens on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "ServiceOne-0.0.1-SNAPSHOT.jar"]


# docker build -t service-one .