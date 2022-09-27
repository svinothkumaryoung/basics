package com.example.demo.services;

import com.example.demo.controller.HomeController;
import com.example.demo.model.Registeration;
import com.example.demo.repositories.StudentRegisterationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterationService {
    @Autowired
    StudentRegisterationRepo studentRegisterationRepo;
    public Registeration saveStudent(Registeration registeration){
        return studentRegisterationRepo.save(registeration);
    }
    public Optional<Registeration> getStudentInfo(Integer RegisterNo)
    {
        return studentRegisterationRepo.findById(RegisterNo);
    }
    public List<Registeration> getAllStudentInfo()
    {
        return studentRegisterationRepo.findAll();
    }
    public void deleteStudentRecords(Integer RegisterationNo){
         studentRegisterationRepo.deleteById(RegisterationNo);
    }

}
