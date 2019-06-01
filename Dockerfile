# base image
FROM openjdk:8

# update packages and install maven
WORKDIR /usr/src/app

ADD ./target/xiaobing-0.0.2.jar /usr/src/app/app.jar

CMD ["java", "-jar", "/usr/src/app/app.jar"]
