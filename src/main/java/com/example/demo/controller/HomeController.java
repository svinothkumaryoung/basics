package com.example.demo.controller;

import com.example.demo.model.Registeration;
import com.example.demo.services.RegisterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    RegisterationService registerationService;

    @PostMapping("/addRecords")
    public Registeration addStudentRecords(@RequestBody Registeration reg )
    {
        return registerationService.saveStudent(reg);
    }


}
