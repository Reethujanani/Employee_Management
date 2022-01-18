package com.example.Employee.Mgmt.repository;

import com.example.Employee.Mgmt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    @Query("SELECT r FROM Employee r WHERE r.firstName LIKE %:first_name%")
    List<Employee> findByFirstNameLike(@Param("first_name")String first_name);
}
