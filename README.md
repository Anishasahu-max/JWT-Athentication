# Spring Boot JWT Authentication System

A secure, RESTful authentication system developed using Java and Spring Boot, implementing JWT-based authentication and BCrypt password encryption.

## Key Features

- User Registration and Login
- Secure Password Hashing using BCrypt
- JWT Token Generation and Validation
- Spring Security Integration
- Protected REST API Endpoints
- MySQL Database Integration

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- JSON Web Token (JWT)
- BCrypt
- Maven

## Authentication Workflow

1. Users register with their credentials.
2. Passwords are encrypted using BCrypt before database storage.
3. Users authenticate through the login endpoint.
4. A JWT is generated after successful authentication.
5. The JWT is used to access protected endpoints.
6. Spring Security validates incoming requests.

## Project Structure

```text
src/
 └── main/
     ├── java/
     └── resources/
pom.xml
mvnw
mvnw.cmd
README.md
```

## Getting Started

### Prerequisites
- Java JDK
- MySQL
- Maven

### Run Locally

```bash
git clone https://github.com/iaman45/springboot-jwt-authentication.git
cd springboot-jwt-authentication
```

Configure your database credentials and JWT secret securely, then run:

```powershell
.\mvnw.cmd spring-boot:run
```

## Author

Anisha Sahu
