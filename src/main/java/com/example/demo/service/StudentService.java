package com.example.demo.service;

import java.util.List;
impoort com.example.demo.entity.Student;

public interface StudentService {

    Student createData(Student stu);
    List<Student>fetchRecord();

  
}