FROM openjdk:8
ADD target/cloud_demo.jar cloud_demo.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","cloud_demo.jar"]
