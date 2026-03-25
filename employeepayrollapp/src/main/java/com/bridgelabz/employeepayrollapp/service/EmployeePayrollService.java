package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private final List<EmployeePayrollData> employeeList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeeList.stream()
                .filter(employee -> employee.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData newEmployee = new EmployeePayrollData(
                employeeList.size() + 1,
                employeePayrollDTO.getName(),
                employeePayrollDTO.getSalary()
        );
        employeeList.add(newEmployee);
        return newEmployee;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeeData = this.getEmployeePayrollDataById(empId);
        if (employeeData != null) {
            employeeData.setName(employeePayrollDTO.getName());
            employeeData.setSalary(employeePayrollDTO.getSalary());
        }
        return employeeData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeList.removeIf(employee -> employee.getId() == empId);
    }
}
