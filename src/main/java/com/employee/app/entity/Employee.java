package com.employee.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*  Employee Entity Class
 *  version 1.0
 *  created By Ravi Kant
 */

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "emp_name")
    private String empName;

    @Column(name = "contact_no")
    private String contactNo;
    private String email;
    private String post;
}
