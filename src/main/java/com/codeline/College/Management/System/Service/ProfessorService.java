package com.codeline.College.Management.System.Service;

import com.codeline.College.Management.System.Models.Professor;
import com.codeline.College.Management.System.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public void createProfessor() {
        Professor professor = new Professor();
        professor.setName("Daniyal");
        professor.setPhone("99352234");
        professor.setEmail("daniyal@codeline.com");
        professor.setSpecialization("JAVA developer");
        professor.setCreatedDate(new Date());
        professor.setIsActive(true);
        ProfessorRepository.save(professor);

    }
}
