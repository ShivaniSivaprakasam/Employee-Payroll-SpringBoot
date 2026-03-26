# Employee Payroll Spring Boot Application

## Overview

This project demonstrates building a **Spring Boot Backend Application** for the **Employee Payroll System**.  
The application supports REST APIs, Logging, Validation, Spring Profiles and Exception Handling.

---

# Tech Stack

- Java
- Spring Boot
- Maven
- Lombok
- Spring Validation
- Spring Profiles
- REST API
- IntelliJ IDEA

---

# Project Structure

```
employeepayrollapp
│
├── controller
├── dto
├── model
├── service
├── exception
├── resources
│   ├── application.properties
│   ├── application-dev.properties
│   ├── application-prod.properties
│
└── EmployeepayrollappApplication.java
```

---

# UC1 : Create Employee Payroll Spring Project

## Objective

Create Spring Boot Application to handle REST Calls

### Endpoint

```
GET /payroll
```

Response

```
Employee Payroll App is Running
```

---

# UC2 : REST Controller HTTP Methods

Implemented REST APIs

```
GET     /employeepayrollservice/
GET     /employeepayrollservice/get/{empId}
POST    /employeepayrollservice/create
PUT     /employeepayrollservice/update/{empId}
DELETE  /employeepayrollservice/delete/{empId}
```

---

# UC3 : Introduce DTO and Model

Created

- EmployeePayrollDTO
- EmployeePayrollData

Used DTO for Request  
Used Model for Response

---

# UC4 : Service Layer

Created

- IEmployeePayrollService
- EmployeePayrollService

Controller communicates with Service Layer

---

# UC5 : Store Data in Memory

Used

```
List<EmployeePayrollData> employeeList
```

Operations

- Add Employee
- Update Employee
- Delete Employee
- Get Employee

---

# UC6 : Lombok

Added Lombok

```
@Data
@NoArgsConstructor
@AllArgsConstructor
```

---

# UC7 : Logging

Added logging

```
@Slf4j
```

Example

```
log.info("Creating employee");
log.error("Error occurred");
```

---

# UC8 : Spring Profiles

Created

```
application.properties
application-dev.properties
application-prod.properties
```

application.properties

```
spring.profiles.active=dev
```

application-dev.properties

```
logging.level.root=INFO
```

application-prod.properties

```
logging.level.root=ERROR
```

---

# UC9 : Validation

Added validation

```
@NotEmpty
@Pattern
```

Example

```
@NotEmpty(message="Name cannot be empty")
@Pattern(regexp="^[A-Z][a-zA-Z\\s]{2,}$")
```

Validation added for

- Create API
- Update API

---

# UC10 : Custom Validation Exception

Created

```
@ControllerAdvice
```

Handled

```
MethodArgumentNotValidException
```

Example Response

```
{
 "name":"Employee name cannot be empty"
}
```

---

# UC11 : Employee Not Found Exception

Created

```
EmployeePayrollException
```

Thrown

```
throw new EmployeePayrollException("Employee not found")
```

Handled using

```
@ExceptionHandler
```

Response

```
{
 "message":"Employee with id not found"
}
```

---

# Dependencies

- Spring Boot Starter Web
- Spring Boot DevTools
- Lombok
- Validation
- Spring Boot Starter

---

# Run Application

Run

```
EmployeepayrollappApplication.java
```

Server Starts

```
Tomcat started on port 8080
```

---

# Testing REST APIs

Browser

```
http://localhost:8080/employeepayrollservice/
```

---

# CURL Examples

Create

```
curl -X POST http://localhost:8080/employeepayrollservice/create
```

Get

```
curl http://localhost:8080/employeepayrollservice/get/1
```

Update

```
curl -X PUT http://localhost:8080/employeepayrollservice/update/1
```

Delete

```
curl -X DELETE http://localhost:8080/employeepayrollservice/delete/1
```

---

# Git Branches

```
feature/UC1-create-project
feature/UC2-rest-controller
feature/UC3-dto-model
feature/UC4-service-layer
feature/UC5-memory-storage
feature/UC6-lombok
feature/UC7-logging
feature/UC8-spring-profiles
feature/UC9-validation
feature/UC10-custom-exception
feature/UC11-employee-not-found
```

---

# Learning Outcomes

- Spring Boot Setup
- REST API Development
- DTO & Model
- Service Layer
- In Memory Storage
- Lombok
- Logging
- Spring Profiles
- Validation
- Exception Handling

---

# Author

Shivani S  
