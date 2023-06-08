package com.codeline.College.Management.System.Models;

import javax.persistence.Id;

public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String course;
}
