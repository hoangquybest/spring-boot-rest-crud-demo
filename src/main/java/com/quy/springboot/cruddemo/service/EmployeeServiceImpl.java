package com.quy.springboot.cruddemo.service;

import com.quy.springboot.cruddemo.dao.EmployeeRepository;
import com.quy.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }
        return theEmployee;
    }

    // Remove @Transactional since JpaRepository provides this functionality
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Remove @Transactional since JpaRepository provides this functionality
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
