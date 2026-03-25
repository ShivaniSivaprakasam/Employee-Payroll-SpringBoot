# Employee Payroll Spring Boot Application

## Project Overview

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
│   │   │       ├── EmployeepayrollappApplication.java
│   │   │       └── controller
│   │   │           └── EmployeePayrollController.java
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

# Controller Implementation

```java
package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/")
    public String getEmployeePayrollData() {
        return "Get call successful";
    }

    @GetMapping("/get/{empId}")
    public String getEmployeePayrollDataById(@PathVariable int empId) {
        return "Get call for employee id: " + empId;
    }

    @PostMapping("/create")
    public String createEmployeePayrollData() {
        return "Created employee payroll data successfully";
    }

    @PutMapping("/update/{empId}")
    public String updateEmployeePayrollData(@PathVariable int empId) {
        return "Updated employee payroll data for id: " + empId;
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployeePayrollData(@PathVariable int empId) {
        return "Deleted employee payroll data for id: " + empId;
    }
}
```

---

# HTTP Methods Implemented

## GET

```
GET /employeepayrollservice/
```

---

## GET by ID

```
GET /employeepayrollservice/get/{empId}
```

---

## POST

```
POST /employeepayrollservice/create
```

---

## PUT

```
PUT /employeepayrollservice/update/{empId}
```

---

## DELETE

```
DELETE /employeepayrollservice/delete/{empId}
```

---

# MySQL Configuration

application.properties

```properties
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

```sql
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

## GET

```
curl http://localhost:8080/employeepayrollservice/
```

---

## POST

```
curl -X POST http://localhost:8080/employeepayrollservice/create
```

---

## PUT

```
curl -X PUT http://localhost:8080/employeepayrollservice/update/1
```

---

## DELETE

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

---

# Learning Outcomes

- Spring Boot Setup  
- REST API Development  
- HTTP Methods Implementation  
- Controller Development  
- MySQL Configuration  
- Maven Dependency Management  
- Git Feature Branch Workflow  

---

# Author

**Shivani S**  
