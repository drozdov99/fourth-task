package com.profitsoft.trainee.drozdov.service;

import com.profitsoft.trainee.drozdov.dao.EmployeeDao;
import com.profitsoft.trainee.drozdov.entity.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int Id) {
        return employeeDao.getEmployee(Id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int Id) {
        employeeDao.deleteEmployee(Id);
    }
}
