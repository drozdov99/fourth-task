package com.profitsoft.trainee.drozdov.dao;

import com.profitsoft.trainee.drozdov.entity.employee.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getEmployees() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
        return theQuery.getResultList();

    }

    @Override
    public void saveEmployee(Employee employee) {

        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {

        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
