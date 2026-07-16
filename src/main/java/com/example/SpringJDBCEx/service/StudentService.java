package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    public List<Student> getStudents() {
        return repository.getStudents();
    }

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

}
