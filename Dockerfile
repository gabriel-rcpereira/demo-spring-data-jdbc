FROM adoptopenjdk:11-jdk-hotspot
VOLUME /tmp
COPY build/libs/*.jar poc.0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/poc.0.0.1-SNAPSHOT.jar"]
