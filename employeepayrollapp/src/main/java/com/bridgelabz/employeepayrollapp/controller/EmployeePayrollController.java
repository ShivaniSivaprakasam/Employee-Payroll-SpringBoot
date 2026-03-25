package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/")
    public String getEmployeePayrollData() {
        return "Get Call Success";
    }

    @GetMapping("/get")
    public String getEmployeeData() {
        return "Returned Employee Payroll Data";
    }

    @PostMapping("/create")
    public String createEmployeePayrollData() {
        return "Created Employee Payroll Data Successfully";
    }

    @PutMapping("/update")
    public String updateEmployeePayrollData() {
        return "Updated Employee Payroll Data Successfully";
    }

    @DeleteMapping("/delete")
    public String deleteEmployeePayrollData() {
        return "Deleted Employee Payroll Data Successfully";
    }
}