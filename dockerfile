# FROM openjdk:8-jdk-alpine
# VOLUME /tmp
# ARG JAVA_OPTS
# ENV JAVA_OPTS=$JAVA_OPTS
# COPY target/crudop-0.0.1-SNAPSHOT.jar crudop.jar
# EXPOSE 8081
# ENTRYPOINT exec java $JAVA_OPTS -jar crudop.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar crudop.jar

FROM openjdk:17-oracle
COPY target/crudop-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]