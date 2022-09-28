package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    @NotNull
    @Size(min=4,message = "Name size should be minimum  {min} Character ")
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