package com.example.StudentManagement.Controller;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student add(@RequestBody Student s){
        return service.saveStudent(s);
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return service.getAllStudents();
    }

    @PutMapping("/updateStudent")
    public Student update(@RequestBody Student s){
        return service.updateStudent(s);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void delete(@PathVariable int id){
        service.deleteStudent(id);
    }
}

