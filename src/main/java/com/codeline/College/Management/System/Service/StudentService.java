package com.codeline.College.Management.System.Service;

import com.codeline.College.Management.System.Models.Student;
import com.codeline.College.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public void createStudent() {
        Student student = new Student();
        student.setName("AHMED");
        student.setEmail("ahmed@gmail.com");
        student.setCourse("Java");
        student.setCreatedDate(new Date());
        student.setIsActive(true);
        studentService.saveEmployee(student);
    }
}
