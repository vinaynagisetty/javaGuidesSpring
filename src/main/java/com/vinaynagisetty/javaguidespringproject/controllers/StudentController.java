package com.vinaynagisetty.javaguidespringproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinaynagisetty.javaguidespringproject.Entity.Student;

@RestController
public class StudentController {
 
    @GetMapping ("/student")
    public Student StudentDetails(){
        return new Student("vinay", "Nagisetty");
    }

}
