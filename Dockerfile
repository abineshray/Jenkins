FROM eclipse-temurin:11
COPY target/jenkins.jar jenkins.jar
CMD [ "java","-jar","jenkins.jar" ]