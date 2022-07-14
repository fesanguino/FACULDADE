package com.example.facul.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Professor {

	@Id
	private long id;
	private String nome;
	private String formacao;

	// Relacionamento OneToMany 
	@OneToMany(mappedBy="professor")
	@JsonIgnore
	private List <Disciplina> disciplinas = new ArrayList<>();

	public Professor() {

	}

	public Professor(long id, String nome, String formacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.formacao = formacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
