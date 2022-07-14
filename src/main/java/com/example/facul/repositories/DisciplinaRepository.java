package com.example.facul.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facul.entities.Disciplina;

@Repository
public interface DisciplinaRepository  extends JpaRepository<Disciplina, Long>{

}
