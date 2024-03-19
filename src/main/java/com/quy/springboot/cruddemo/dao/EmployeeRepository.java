package com.quy.springboot.cruddemo.dao;

import com.quy.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Default it will take plural form of Employee entity to define path, and some complex plural that it can not resolve
// We can use @RepositoryRestResource to define path
// http://localhost:8080/magic-api/members?page=1&size=3
// http://localhost:8080/magic-api/members?sort=lastName,desc
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
