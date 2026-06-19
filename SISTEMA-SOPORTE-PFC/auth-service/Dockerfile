# Etapa 1: Build (Compilación)
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
# Copiamos el POM y descargamos dependencias
COPY pom.xml .
RUN mvn dependency:go-offline
# Copiamos el código y compilamos el .jar
COPY src ./src
RUN mvn clean package -Dmaven.test.skip=true

# Etapa 2: Runtime (Ejecución)
FROM eclipse-temurin:21-jre
WORKDIR /app
# Copiamos solo el archivo ejecutable desde la etapa anterior
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "app.jar"]