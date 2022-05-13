FROM openjdk:8
EXPOSE 6060
COPY build/libs/ms-gps-1.0.0.jar gps.jar
ENTRYPOINT ["java", "-jar", "/gps.jar"]