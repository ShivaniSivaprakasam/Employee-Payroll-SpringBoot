package com.bridgelabz.employeepayrollapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollData {

    private int id;
    private String name;
    private double salary;

}
