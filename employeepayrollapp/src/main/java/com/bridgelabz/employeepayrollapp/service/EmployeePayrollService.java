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
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employee = new EmployeePayrollData(
                employeeList.size() + 1,
                employeePayrollDTO.getName(),
                employeePayrollDTO.getSalary()
        );
        employeeList.add(employee);
        return employee;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employee = getEmployeePayrollDataById(empId);
        if (employee != null) {
            employee.setName(employeePayrollDTO.getName());
            employee.setSalary(employeePayrollDTO.getSalary());
        }
        return employee;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeList.removeIf(emp -> emp.getId() == empId);
    }
}
