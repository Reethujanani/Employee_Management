package com.example.Employee.Mgmt.service;

import com.example.Employee.Mgmt.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployee(int id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee e, int id);

    String deleteAllEmployees();

    String deleteEmployeeByID(int id);


    void deleteAll();

    void deleteById(int id);

    List<Employee> list(String first_name);
}
