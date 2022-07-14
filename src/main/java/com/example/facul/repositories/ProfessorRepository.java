package com.example.facul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facul.entities.Professor;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long>{

}
