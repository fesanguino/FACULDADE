package com.example.facul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facul.entities.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long>{

}
