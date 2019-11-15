package com.profitsoft.trainee.drozdov;

import com.profitsoft.trainee.drozdov.config.DemoAppConfig;
import com.profitsoft.trainee.drozdov.entity.Address;
import com.profitsoft.trainee.drozdov.entity.employee.Developer;
import com.profitsoft.trainee.drozdov.entity.employee.Employee;
import com.profitsoft.trainee.drozdov.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoAppConfig.class);

        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeService.class);

        System.out.println("Adding new employee");
        Employee dev = new Developer("Vadim","Drozdov","Java");
        dev.setAddress(new Address("Nauki", "12", "15"));
        employeeService.saveEmployee(dev);

        if(dev.getId() > 0) {
            System.out.println("Get employee by Id");
            Employee employee = employeeService.getEmployee(dev.getId());
            System.out.println(employee);

            System.out.println("Get all employees");
            List<Employee> employees = employeeService.getEmployees();
            employees.forEach(System.out::println);

            System.out.println("Delete employee by Id");
            employeeService.deleteEmployee(dev.getId());
        }
    }
}
