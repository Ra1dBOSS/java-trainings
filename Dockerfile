# ===== СТАДИЯ 1: СБОРКА =====
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app

# Сначала копируем только pom.xml — для кэширования зависимостей Maven
COPY pom.xml .
RUN mvn -B dependency:go-offline

# Затем копируем исходный код
COPY src ./src

# Собираем приложение (без тестов, чтобы ускорить первую сборку)
RUN mvn -B package -DskipTests

# ===== СТАДИЯ 2: RUNTIME =====
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Копируем собранный jar-файл из первой стадии
COPY --from=build /app/target/*.jar app.jar

# Точка входа контейнера
ENTRYPOINT ["java", "-jar", "app.jar"]