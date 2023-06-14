package com.codeline.College.Management.System.Controller;

import com.codeline.College.Management.System.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @RequestMapping("professor/create")
    public void saveProfessor() {
        professorService.createProfessor();
    }
}
