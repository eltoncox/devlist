# Etapa de build
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copia pom.xml e baixa dependências (cache eficiente)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia código-fonte e faz o build (sem testes no CI)
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa final: imagem de execução
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app
EXPOSE 8080

# Copia o JAR gerado (assumindo que é o único .jar em target/)
COPY --from=build /app/target/*.jar /app/app.jar

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]