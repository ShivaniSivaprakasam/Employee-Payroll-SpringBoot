package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/")
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollService.getEmployeePayrollData();
    }

    @GetMapping("/get/{empId}")
    public EmployeePayrollData getEmployeePayrollDataById(@PathVariable int empId) {
        return employeePayrollService.getEmployeePayrollDataById(empId);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
    }

    @PutMapping("/update/{empId}")
    public EmployeePayrollData updateEmployeePayrollData(@PathVariable int empId,
                                                         @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return employeePayrollService.updateEmployeePayrollData(empId, employeePayrollDTO);
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployeePayrollData(@PathVariable int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        return "Deleted employee payroll data for id: " + empId;
    }
}