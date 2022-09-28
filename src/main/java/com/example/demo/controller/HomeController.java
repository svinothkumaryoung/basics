package com.example.demo.controller;

import com.example.demo.exceptionHandler.ResourceNotFoundException;
import com.example.demo.model.Registeration;
import com.example.demo.services.RegisterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    RegisterationService registerationService;

    @PostMapping("/addRecords")
    public Registeration addStudentRecords( @Valid @RequestBody Registeration reg )
    {
        return registerationService.saveStudent(reg);
    }

    @GetMapping("/GetInfo/{id}")
    public Optional<Registeration> getStudentRecords
            (@PathVariable (value="id") Integer RegisterNo){
        return registerationService.getStudentInfo(RegisterNo);
    }


    @GetMapping("GetAllInfo")
    public List<Registeration> getAllStudentRecords()
    {
        return registerationService.getAllStudentInfo();

    }
    @DeleteMapping("Delete/{id}")
    public void DeleteRecords
            (@PathVariable (value = "id") Integer RegisterationNo)
    {
         registerationService.deleteStudentRecords(RegisterationNo);
    }

    @PutMapping("updateRecords/{id}")
    public Registeration updateRecords
            (@RequestBody Registeration registeration,
             @PathVariable (value = "id") Integer id)
    {
        Registeration oldRecords=this.registerationService.getStudentInfo(id)
                .orElseThrow(()->new ResourceNotFoundException("User id Request" +
                        " Not Exist"));
        oldRecords.setName(registeration.getName());
        oldRecords.setDepartment(registeration.getDepartment());
        return this.registerationService.saveStudent(oldRecords);
    }



}
