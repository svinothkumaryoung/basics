package com.example.demo.model;

import javax.persistence.*;
//Camel Case Letter
//registerationNumber
@Entity
@Table(name="student_register")
public class Registeration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "register_no")
    int registerationNo;

    @Column(name = "student_name")
    String name;

    @Column(name = "student_department")
    String department;

    public Registeration() {
    }

    public Registeration(String name, String department) {

        this.name = name;
        this.department = department;
    }

    public int getRegisterationNo() {
        return registerationNo;
    }

    public void setRegisterationNo(int registerationNo) {
        this.registerationNo = registerationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}