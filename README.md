# TalentHub — Job Discovery & Recruitment Platform

TalentHub is a job portal designed to connect job seekers with recruiters. It provides APIs for managing user accounts and job listings using Java and Spring Boot.

## Technologies Used

* **Language:** Java
* **Backend Framework:** Spring Boot
* **Database:** MySQL
* **ORM:** Spring Data JPA, Hibernate
* **Build Tool:** Maven
* **Security:** BCrypt password hashing
* **API Testing:** Postman

## Features

* Create, view, update, and delete users.
* Create, view, update, and delete job listings.
* Store and retrieve data using MySQL.
* Hash user passwords using BCrypt.
* Handle exceptions with appropriate HTTP status codes.
* Expose REST APIs for backend operations.

## API Endpoints

### User APIs

| Method | Endpoint      | Description      |
| ------ | ------------- | ---------------- |
| POST   | `/users`      | Create a user    |
| GET    | `/users`      | Get all users    |
| GET    | `/users/{id}` | Get a user by ID |
| PUT    | `/users/{id}` | Update a user    |
| DELETE | `/users/{id}` | Delete a user    |

### Job APIs

| Method | Endpoint     | Description     |
| ------ | ------------ | --------------- |
| POST   | `/jobs`      | Create a job    |
| GET    | `/jobs`      | Get all jobs    |
| GET    | `/jobs/{id}` | Get a job by ID |
| PUT    | `/jobs/{id}` | Update a job    |
| DELETE | `/jobs/{id}` | Delete a job    |

## How to Run

1. Install Java and MySQL.
2. Create a MySQL database named `talenthub`.
3. Configure your database connection using environment variables or your local `application.properties` file.
4. Open the project folder in Eclipse or another Java IDE.
5. Run `TalenthubApplication.java`.

Alternatively, run the application from the terminal:

```bash
./mvnw spring-boot:run
```

The application runs at `http://localhost:8080` by default.

## Project Status

Backend development in progress. Frontend integration, authentication, and additional recruitment features can be added in future versions.

## Author

Sarathi kumar VS
