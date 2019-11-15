package com.profitsoft.trainee.drozdov.dao;

import com.profitsoft.trainee.drozdov.entity.employee.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

}
