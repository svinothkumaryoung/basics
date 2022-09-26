package com.example.demo.services;

import com.example.demo.controller.HomeController;
import com.example.demo.model.Registeration;
import com.example.demo.repositories.StudentRegisterationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterationService {

    @Autowired
    StudentRegisterationRepo studentRegisterationRepo;



    public Registeration saveStudent(Registeration registeration){
        return studentRegisterationRepo.save(registeration);
    }

}
