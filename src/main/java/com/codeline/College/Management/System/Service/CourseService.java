package com.codeline.College.Management.System.Service;

import com.codeline.College.Management.System.Models.Course;
import com.codeline.College.Management.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public void createCourse() {
        Course course = new Course();
        course.setName("Computer Science");
        course.setCreatedDate(new Date());
        course.setIsActive(true);
        courseRepository.save(course);

    }
}
