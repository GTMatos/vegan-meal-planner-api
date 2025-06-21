# Vegan Meal Planner API

A backend REST API for planning vegan meals and tracking nutrition intake.

This project is part of my backend developer growth path — practicing clean architecture, security, testing, and API design.

## ✨ Features (MVP)
- Browse catalog of vegan meals
- Plan meals for each day (breakfast, lunch, dinner)
- View planned meals for a date
- Secure API with user authentication
- Admin endpoints for managing meals

## 🛠 Tech Stack
- Java 24
- Spring Boot 3.5.2
- Gradle Kotlin DSL
- Spring Security (Basic Auth → JWT planned)
- H2 / PostgreSQL (planned)
- Testcontainers (planned)
- JUnit 5

## 🛠 Project Dependencies

- `spring-boot-starter-web` — Spring MVC REST API framework (Tomcat embedded server)
- `spring-boot-starter-security` — Spring Security (Basic Auth for now, JWT planned)
- `spring-boot-starter-test` — JUnit 5, AssertJ, Mockito, Spring Boot test utilities
- `lombok` — Reduces boilerplate (models, DTOs)

Build: Gradle Kotlin DSL

## 🚀 How to Run Locally
1. Clone the repo
2. Run:
```bash
./gradlew bootRun