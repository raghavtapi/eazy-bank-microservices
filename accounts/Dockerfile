#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk

#Information around who maintains the image
MAINTAINER raghavtapi

#We are telling to add the application's jar (mentioned in the path) to the docker image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application. Whenever someone tries to create a container from the docker image execute the below command
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]