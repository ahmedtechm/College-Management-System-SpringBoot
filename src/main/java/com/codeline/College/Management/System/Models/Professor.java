package com.codeline.College.Management.System.Models;

import javax.persistence.Id;

public class Professor {
    @Id
    Long id;
    String name;
    String phone;
    String email;
    String specialization;

}
