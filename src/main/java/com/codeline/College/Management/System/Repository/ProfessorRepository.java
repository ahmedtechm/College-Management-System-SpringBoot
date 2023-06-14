package com.codeline.College.Management.System.Repository;

import com.codeline.College.Management.System.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
