package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getEmployeePayrollData() {
        log.info("Get all employee payroll data");
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{empId}")
    public EmployeePayrollData getEmployeePayrollDataById(@PathVariable int empId) {
        log.info("Get employee by id {}", empId);
        return employeePayrollService.getEmployeePayrollDataById(empId);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        log.info("Create employee payroll data {}", employeePayrollDTO);
        return employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
    }

    @PutMapping("/update/{empId}")
    public EmployeePayrollData updateEmployeePayrollData(@PathVariable int empId,
                                                         @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        log.info("Update employee id {} with data {}", empId, employeePayrollDTO);
        return employeePayrollService.updateEmployeePayrollData(empId, employeePayrollDTO);
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployeePayrollData(@PathVariable int empId) {
        log.info("Delete employee id {}", empId);
        employeePayrollService.deleteEmployeePayrollData(empId);
        return "Deleted employee payroll data for id: " + empId;
    }
}