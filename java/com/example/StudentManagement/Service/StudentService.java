package com.example.StudentManagement.Service;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student s) {
        return repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student updateStudent(Student s) {
        return repo.save(s);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}

