FROM bellsoft/liberica-runtime-container:jdk-21-slim-musl

WORKDIR /opt/work

COPY target/*.jar app.jar

ENV ENVIRONMENT=DONE

ENTRYPOINT ["java", "-showversion", "-jar", "app.jar"]