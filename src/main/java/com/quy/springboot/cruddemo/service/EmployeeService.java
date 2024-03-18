package com.quy.springboot.cruddemo.service;

import com.quy.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
