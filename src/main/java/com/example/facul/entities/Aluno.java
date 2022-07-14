package com.example.facul.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aluno {
	
	@Id
	private Long id;
	private String nome;
	private Integer idade;
	
	
	@ManyToMany(mappedBy = "alunos")
	@JsonIgnore
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	
	public Aluno () {
		
	}

	public Aluno(Long id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public Long getId() {
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
