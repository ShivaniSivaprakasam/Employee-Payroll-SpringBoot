package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/hello")
    public String hello() {
        return "Employee Payroll REST Service";
    }

    @GetMapping("/get")
    public String getEmployee(@RequestParam(value = "name", defaultValue = "Employee") String name) {
        return "Hello " + name;
    }

    @PostMapping("/create")
    public String createEmployee(@RequestParam String name) {
        return "Created employee: " + name;
    }

    @PutMapping("/update/{name}")
    public String updateEmployee(@PathVariable String name,
                                 @RequestParam(value = "newName") String newName) {
        return "Updated employee " + name + " to " + newName;
    }

    @DeleteMapping("/delete/{name}")
    public String deleteEmployee(@PathVariable String name) {
        return "Deleted employee: " + name;
    }
}