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

# Expõe a porta (boa prática)
EXPOSE 8080

# CORREÇÃO: Nome exato do JAR gerado
COPY --from=build /app/target/dslinst-0.0.1-SNAPSHOT.jar /app/app.jar

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]