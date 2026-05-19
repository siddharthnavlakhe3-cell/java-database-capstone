# Step 1: Java Runtime Environment set up karne ke liye basic image
FROM openjdk:17-jdk-slim

# Step 2: Application ki compiled JAR file ka path design karna
ARG JAR_FILE=app/target/*.jar

# Step 3: JAR file ko container ke andar copy karna aur naya naam dena
COPY ${JAR_FILE} app.jar

# Step 4: Container ko instructions dena ki run hote hi Java app start kare
ENTRYPOINT ["java", "-jar", "/app.jar"]
