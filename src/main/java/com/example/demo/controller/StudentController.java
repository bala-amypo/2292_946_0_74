package com.example.demo.controller;
import java.util.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu) {
        return ser.createData(stu);
    }

    @GetMapping("/fetchdatabyid/{id}")
    public Optional<Student> fetchDataById(@PathVariable int id){
          return ser.fetchDataById(id);
    }
    

}