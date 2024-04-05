package br.com.poo.individual.entities;

import java.time.LocalDate;

public class Delegacia {
		
		private int id;
		private String nome;
		private LocalDate horarioAbertura;
		private LocalDate horarioFechamento;
		private String fkEnd;
	
	//construtor default
	
	public Delegacia() {
		super();

	}

	public Delegacia(int id, String nome, LocalDate horarioAbertura, LocalDate horarioFechamento, String fkEnd) {
		super();
		this.id = id;
		this.nome = nome;
		this.horarioAbertura = horarioAbertura;
		this.horarioFechamento = horarioFechamento;
		this.fkEnd = fkEnd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getHorarioAbertura() {
		return horarioAbertura;
	}

	public void setHorarioAbertura(LocalDate horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}

	public LocalDate getHorarioFechamento() {
		return horarioFechamento;
	}

	public void setHorarioFechamento(LocalDate horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}

	public String getFkEnd() {
		return fkEnd;
	}

	public void setFkEnd(String fkEnd) {
		this.fkEnd = fkEnd;
	}
}