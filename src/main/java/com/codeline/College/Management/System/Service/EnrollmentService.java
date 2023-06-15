package com.codeline.College.Management.System.Service;

import com.codeline.College.Management.System.Repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    EnrollmentRepository enrollmentRepository;

}
