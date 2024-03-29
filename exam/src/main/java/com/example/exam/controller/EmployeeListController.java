package com.example.exam.controller.;

import com.yourpackage.dao.EmployeeDAO;
import com.yourpackage.model.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class EmployeeListController {

    private List<Employee> employees;

    @Inject
    private EmployeeDAO employeeDAO;

    @PostConstruct
    public void init() {
        employees = employeeDAO.getAllEmployees();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
