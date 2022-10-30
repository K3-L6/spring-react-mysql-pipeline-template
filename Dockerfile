FROM eclipse-temurin:11

WORKDIR /app
COPY . .
RUN gradlew build

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "./build/libs/spring-react-mysql-pipeline-template.jar"]