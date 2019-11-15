package com.profitsoft.trainee.drozdov.service;

import com.profitsoft.trainee.drozdov.entity.employee.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int Id);

    void deleteEmployee(int Id);
}
