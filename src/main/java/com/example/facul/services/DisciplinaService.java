package com.example.facul.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facul.entities.Disciplina;
import com.example.facul.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public List<Disciplina> findAll(){
		return disciplinaRepository.findAll();
	}
	

}
