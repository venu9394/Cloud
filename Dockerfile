FROM openjdk:8
ADD cloud_demo.jar cloud_demo.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","cloud_demo.jar"]
