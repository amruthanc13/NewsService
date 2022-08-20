FROM openjdk:17
EXPOSE 8080
ADD target/newsservice-image.jar newsservice-image.jar
ENTRYPOINT ["java","-jar","/newsservice-image.jar"]