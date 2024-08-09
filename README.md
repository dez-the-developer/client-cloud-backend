# Client Cloud Backend

This repository contains the backend portion of Client Cloud, a full-stack web application designed to streamline and manage client information efficiently. The backend is built using Java 17, Spring Boot, and MySQL, providing a robust and scalable foundation for client care management.

### Link to Client Cloud Frontend Repo: https://github.com/dez-the-developer/client-cloud-frontend ###
## Features

- **RESTful API:** Exposes endpoints for client management operations such as creating, updating, deleting, and retrieving client information.
- **Secure Authentication:** Integrated Spring Security for user authentication and authorization.
- **Data Persistence:** Utilizes Spring Data JPA for efficient database interactions with MySQL.
- **Validation:** Built-in validation for data integrity and consistency.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **Spring Web**
- **Lombok**
- **MySQL**
- **Maven**

## Prerequisites

Before setting up the backend project, ensure you have the following installed:

- **Java 17** or higher
- **MySQL**
- **Maven**
- **IntelliJ IDEA** or another Java IDE

## Installation

Follow these steps to set up the backend project on your local machine:

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/client-cloud-backend.git
cd client-cloud-backend

2. Set up the MySQL Database
Create a new database in MySQL.
Update the application.properties file located in src/main/resources with your MySQL database details:
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

3. Build and Run the Application
Navigate to the backend project directory:
cd client-cloud-backend

Build the project using Maven:
mvn clean install

Run the Spring Boot application:
mvn spring-boot:run

The backend server will start on http://localhost:8080.

API Documentation
The backend exposes RESTful APIs to interact with the client management system. API testing can be performed using Postman or similar tools. For detailed API documentation, refer to the /swagger-ui.html endpoint after starting the application.

Usage
Access the API: You can interact with the backend API via http://localhost:8080/api/...
