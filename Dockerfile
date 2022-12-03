FROM gradle AS build
COPY --chown=gradle:gradle /back /home/gradle/td_mep_moegenius/back
WORKDIR /home/gradle/td_mep_moegenius/back
RUN gradle build

FROM openjdk:17-jdk-slim
EXPOSE 8080

RUN mkdir /app
COPY --from=build /home/gradle/td_mep_moegenius/back/build/libs/*.jar /app/spring-boot-application.jar
ENTRYPOINT exec java -jar /app/spring-boot-application.jar