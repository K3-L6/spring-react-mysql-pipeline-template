FROM eclipse-temurin:11
EXPOSE 9090
COPY build/libs/spring-react-mysql-pipeline-template.jar .
ENTRYPOINT ["java", "-jar", "spring-react-mysql-pipeline-template.jar"]