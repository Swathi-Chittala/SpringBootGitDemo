FROM amazoncorretto:22
LABEL version="1.0"

EXPOSE 8080:8080

WORKDIR /app

COPY target/DockerExample-0.0.1-SNAPSHOT.jar /app/DockerExample-demo.jar


ENTRYPOINT ["java", "-jar","DockerExample-demo.jar"]