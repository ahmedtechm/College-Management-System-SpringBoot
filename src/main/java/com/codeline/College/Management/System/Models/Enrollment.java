package com.codeline.College.Management.System.Models;

import javax.persistence.Id;

public class Enrollment {
    @Id
    Long id;

    String studentName;

    String courseName;

    int semester;
}
