package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
public class Student{
    @Id
    private longId;
    private string name;
    private string email;
    private float cgpa;

    public long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id=Id;
    }
    public string getName(){
        return name;
    }
    public void setName(string name){
        this.name=name;
    }
    public string getEmail(){
        return email;
    }
    public void setEmail(string Email){
        this.email=email;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public Student(long id, String stuname, String stuemail, float cgpa) {
        this.id = id;
        this.stuname = stuname;
        this.stuemail = stuemail;
        this.cgpa = cgpa;
    }

    public Student() {
    }

}