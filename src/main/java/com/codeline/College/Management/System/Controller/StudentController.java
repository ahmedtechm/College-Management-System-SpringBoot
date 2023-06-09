package com.codeline.College.Management.System.Controller;

import com.codeline.College.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("create")
    public void saveStudent() {
        studentService.createStudent();
    }
}
