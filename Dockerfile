FROM openjdk:17.0.8
EXPOSE 8080
ADD target/examenikitamalarose.jar examenikitamalarose.jar
ENTRYPOINT ["java","-jar","/examenikitamalarose.jar"]