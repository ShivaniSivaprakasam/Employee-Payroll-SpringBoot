package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private final List<EmployeePayrollData> employeeList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        log.info("Returning all employee payroll data");
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        log.info("Searching employee payroll data for id: {}", empId);
        return employeeList.stream()
                .filter(employee -> employee.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        log.info("Creating employee payroll data: {}", employeePayrollDTO);
        EmployeePayrollData newEmployee = new EmployeePayrollData(
                employeeList.size() + 1,
                employeePayrollDTO.getName(),
                employeePayrollDTO.getSalary()
        );
        employeeList.add(newEmployee);
        log.info("Employee created successfully: {}", newEmployee);
        return newEmployee;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        log.info("Updating employee payroll data for id: {}", empId);
        EmployeePayrollData employeeData = this.getEmployeePayrollDataById(empId);
        if (employeeData != null) {
            employeeData.setName(employeePayrollDTO.getName());
            employeeData.setSalary(employeePayrollDTO.getSalary());
            log.info("Employee updated successfully: {}", employeeData);
        } else {
            log.warn("Employee with id {} not found", empId);
        }
        return employeeData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        log.info("Deleting employee payroll data for id: {}", empId);
        boolean removed = employeeList.removeIf(employee -> employee.getId() == empId);
        if (removed) {
            log.info("Employee deleted successfully for id: {}", empId);
        } else {
            log.warn("Employee with id {} not found", empId);
        }
    }
}
