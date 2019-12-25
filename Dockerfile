FROM java:8-jdk-alpine
MAINTAINER prasadbolla
VOLUME /tmp
COPY ./target/cloudrequestservicesapigateway-0.0.1-SNAPSHOT.jar cloudrequestservicesapigateway.jar
ENTRYPOINT ["java","-jar","cloudrequestservicesapigateway.jar"]
