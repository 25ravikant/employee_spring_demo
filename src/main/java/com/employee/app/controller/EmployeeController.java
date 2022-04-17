package com.employee.app.controller;

import com.employee.app.entity.Employee;
import com.employee.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*   Employee Controller Class

 */

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    //Employee Service Object
    @Autowired
    EmployeeService employeeService;

    //For Add Employee in Database
    @PostMapping("/add")
    public ResponseEntity<?> student(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    //For Get Employee By Id
    @GetMapping("/{id}")
    public ResponseEntity<?>getStudent(@PathVariable Long id)
    {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    //For Get All Employee
    @GetMapping("/getAll")
    public ResponseEntity<?> AllEmployee()
    {
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }


    //For Delete Employee By Id
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        employeeService.deleteEmployee(id);
    }

}
