FROM openjdk:18

ENV IMG_PATH=/img

EXPOSE 8080

RUN mkdir -p /img

ADD "nombre del jar en libs".jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]