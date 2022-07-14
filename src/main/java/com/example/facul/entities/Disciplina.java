package com.example.facul.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Disciplina {

	@Id
	private Long id;
	private String nome;
	private String semestre;
	
	// Relacionamento ManyToOne
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	@ManyToMany
	@JoinColumn(name = "aluno_id")
	private List<Aluno> alunos = new ArrayList<>();


	public Disciplina () {
		
	}
	
	public Disciplina(Long id, String nome, String semestre) {
		super();
		this.id = id;
		this.nome = nome;
		this.semestre = semestre;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
	
}
