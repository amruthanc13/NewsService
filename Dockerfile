FROM openjdk:17
EXPOSE 8080
ADD targer/newsservice-image.jar newsservice-image.jar
ENTRYPOINT ["java","-jar","/newsservice-image.jar"]