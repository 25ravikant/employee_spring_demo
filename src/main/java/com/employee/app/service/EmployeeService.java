package com.employee.app.service;

import com.employee.app.entity.Employee;
import com.employee.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/* Employee Service Class

 */

@Service
public class EmployeeService {

    //Employee Repository Object
    @Autowired
    EmployeeRepository employeeRepository;

    //Method for Save Employee in table
    public Employee saveEmployee(Employee employee)
    {
        Employee employee1 = new Employee();
        employee1.setEmpName(employee.getEmpName());
        employee1.setContactNo(employee.getContactNo());
        employee1.setEmail(employee.getEmail());
        employee1.setPost(employee.getPost());
        return employeeRepository.save(employee1);
    }

    //Method For get Employee By Id
    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.findById(id).orElseThrow(()->
                new RuntimeException("Employee not found for id " + id));
    }

    //Method for Get All Employee
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.findAll();
    }

    //Method for Delete Employee By Id
    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }
}
