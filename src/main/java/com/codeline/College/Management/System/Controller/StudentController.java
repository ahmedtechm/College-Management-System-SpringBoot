package com.codeline.College.Management.System.Controller;

import com.codeline.College.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("student/create")
    public void saveStudent() {
        studentService.createStudent();
    }
}
