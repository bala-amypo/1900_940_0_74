package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.Repository;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.valid;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student student){
        return new ResponseEntity<> (studentService.saveStudent(student),HttpStatus.CREATED);
    }
    
    

}