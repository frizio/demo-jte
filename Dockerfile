FROM frizio/alpine-jdk21-mvn396:latest AS build
#WORKDIR /opt/work
COPY pom.xml .
COPY src ./src
RUN mvn -Dmaven.test.skip=true clean package spring-boot:repackage
COPY target/*.jar app.jar

FROM bellsoft/liberica-runtime-container:jdk-21-slim-musl
COPY --from=build /opt/work/app.jar /opt

ENV ENVIRONMENT=DEV

ENTRYPOINT ["java", "-showversion", "-jar", "/opt/app.jar"]
