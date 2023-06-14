package com.codeline.College.Management.System.Service;

import com.codeline.College.Management.System.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

}
