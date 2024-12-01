package com.vinaynagisetty.javaguidespringproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinaynagisetty.javaguidespringproject.Entity.Student;

@RestController
public class StudentController {
 
    @GetMapping ("/student")
    public Student StudentDetails(){
        return new Student("vinay", "Nagisetty");
    }


    @GetMapping ("/students")
    public List<Student> StudentsDetails(){
      
        List<Student> students=new ArrayList<>();
        students.add(new Student("vinay","nagisetty"));
        students.add(new Student("vamsi","nagisetty"));
        students.add(new Student("vinay","fernadeze"));
        students.add(new Student("JAck","Tyson"));
        students.add(new Student("Thoams","Edison"));
            return students;
        
     }

     @GetMapping ("/{firstName}/{lastName}")
     //If we chanaged  pathvarible name in the method arguments we have  mention in @pathvarible("what name we gave in getmapping url")
    public Student studentPathVaribleEXample(@PathVariable String firstName ,@PathVariable("lastName") String lastname1 ){
        return new Student(firstName, lastname1);
    }

    @GetMapping ("/student/{firstName}/{lastName}")
    //If we chanaged  pathvarible name in the method arguments we have  mention in @pathvarible("what name we gave in getmapping url")
   public Student studentPathVaribleEXamplewithsaticstudentname(@PathVariable String firstName ,@PathVariable("lastName") String lastname1 ){
       return new Student(firstName, lastname1);
   }

   @GetMapping ("/student/query")
  public Student studentQuaryparams(@RequestParam String firstName ,@RequestParam("lastName") String lastname1 ){
      return new Student(firstName, lastname1);
  }



}
