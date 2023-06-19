package com.codeline.College.Management.System.Controller;

import com.codeline.College.Management.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "course")
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("create")
    public void saveCourse() {
        courseService.createCourse();
    }
}
