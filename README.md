# Employee Payroll Spring Boot Application

# Project Overview
This project demonstrates the development of a **Spring Boot Backend Application** for the **Employee Payroll System**. The application is built to handle **REST API requests** and demonstrates various **HTTP methods**.

This project is developed as part of the **BridgeLabz Learning Program**.

---

# Tech Stack

- Java 17  
- Spring Boot  
- Maven  
- REST API  
- MySQL (Configured in UC2)  
- IntelliJ IDEA  

---

# Project Structure

```
employeepayrollapp
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.bridgelabz.employeepayrollapp
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── model
│   │   │       ├── service
│   │   │       └── EmployeepayrollappApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# UC1 — Create Employee Payroll Spring Project

## Objective
Create a Spring Boot Project to cater to REST request from Employee Payroll UI.

## Tasks Completed

- Created Spring Boot Project  
- Configured Maven Dependencies  
- Created Main Application Class  
- Created REST Controller  
- Implemented Basic GET API  
- Tested REST API using Browser  

---

# UC1 REST Endpoint

## GET Method

```
GET /payroll
```

## Sample Response

```
Employee Payroll App is Running
```

---

# UC2 — REST Controller HTTP Methods

## Objective

Create REST Controller to demonstrate various HTTP methods:

- GET  
- POST  
- PUT  
- DELETE  

---

# Dependencies Added

- Spring Web  
- Spring Validation  
- Spring Data JPA  
- MySQL Driver  
- Spring Boot DevTools  

---

# HTTP Methods Implemented

## GET
```
GET /employeepayrollservice/
```

## GET by ID
```
GET /employeepayrollservice/get/{empId}
```

## POST
```
POST /employeepayrollservice/create
```

## PUT
```
PUT /employeepayrollservice/update/{empId}
```

## DELETE
```
DELETE /employeepayrollservice/delete/{empId}
```

---

# UC3 — Introduced DTO and Model Layer

## Objective

Introduce DTO and Model classes for Employee Payroll App.

## Tasks Completed

- Created DTO Layer  
- Created Model Layer  
- Implemented Object-Based REST APIs  
- Added RequestBody Handling  
- Returned JSON Responses  

---

# DTO Class

EmployeePayrollDTO

Fields:

- name  
- salary  

Purpose:

Used to receive data from REST request.

---

# Model Class

EmployeePayrollData

Fields:

- id  
- name  
- salary  

Purpose:

Used as response object from REST API.

---

# UC3 Controller Changes

- POST accepts DTO  
- PUT accepts DTO  
- Controller returns Model object  
- JSON response enabled  

---

# UC4 — Introduced Service Layer

## Objective

Introduce Service Layer to handle business logic.

## Tasks Completed

- Created Service Interface  
- Created Service Implementation  
- Used Dependency Injection  
- Moved Business Logic to Service Layer  
- Controller calls Service  

---

# Service Layer Files

Created:

```
IEmployeePayrollService.java
EmployeePayrollService.java
```

---

# Dependency Injection

Used:

```
@Autowired
private IEmployeePayrollService employeePayrollService;
```

---

# Architecture After UC4

```
Controller → Service → Model
```

---

# UC5 — Store Employee Payroll Data in Memory

## Objective

Allow Service Layer to store employee data in memory.

---

# Tasks Completed

- Created in-memory List  
- Implemented Create Employee  
- Implemented Get All Employees  
- Implemented Get Employee By ID  
- Implemented Update Employee  
- Implemented Delete Employee  

---

# In-Memory Storage

Used:

```
List<EmployeePayrollData> employeeList
```

---

# UC5 Functionalities

## Create Employee

- Adds employee to list  
- Auto generates ID  

---

## Get All Employees

Returns all employee records.

---

## Get Employee by ID

Searches employee list.

---

## Update Employee

Updates employee data in list.

---

## Delete Employee

Removes employee from list.

---

# Architecture After UC5

```
Controller → Service → In-Memory List
```

---

# MySQL Configuration

application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/payroll_service
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

---

# Database Setup

```
create database payroll_service;
```

---

# Running Application

Run:

```
EmployeepayrollappApplication.java
```

Server Starts:

```
Tomcat started on port 8080
```

---

# Testing REST APIs

## Browser

```
http://localhost:8080/employeepayrollservice/
```

---

# cURL Commands

## Create

```
curl -X POST http://localhost:8080/employeepayrollservice/create \
-H "Content-Type: application/json" \
-d "{\"name\":\"Shivani\",\"salary\":50000}"
```

---

## Get All

```
curl http://localhost:8080/employeepayrollservice/
```

---

## Update

```
curl -X PUT http://localhost:8080/employeepayrollservice/update/1 \
-H "Content-Type: application/json" \
-d "{\"name\":\"Shivani\",\"salary\":60000}"
```

---

## Delete

```
curl -X DELETE http://localhost:8080/employeepayrollservice/delete/1
```

---

# Git Branches

## UC1

```
feature/UC1-employee-payroll-rest-api
```

## UC2

```
feature/UC2-rest-controller-http-methods
```

## UC3

```
feature/UC3-introduce-dto-and-model
```

## UC4

```
feature/UC4-introduce-service-layer
```

## UC5

```
feature/UC5-store-employee-payroll-in-memory
```

---

# Learning Outcomes

- Spring Boot Setup  
- REST API Development  
- DTO Layer  
- Model Layer  
- Service Layer  
- Dependency Injection  
- In-Memory Data Storage  
- HTTP Methods Implementation  
- Maven Dependency Management  
- Git Feature Branch Workflow  

---

# Author

**Shivani S**  
