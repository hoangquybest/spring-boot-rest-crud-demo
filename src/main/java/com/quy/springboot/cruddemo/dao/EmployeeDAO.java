package com.quy.springboot.cruddemo.dao;

import com.quy.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
