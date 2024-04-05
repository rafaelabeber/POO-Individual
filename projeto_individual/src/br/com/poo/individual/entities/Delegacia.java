package br.com.poo.individual.entities;

import java.time.LocalTime;

public class Delegacia {
		
		private int id;
		private String nome;
		private LocalTime horarioAbertura;
		private LocalTime horarioFechamento;
		private String fkEnd;
	
	
	public Delegacia() {
		super();

	}
	
	
	public Delegacia(int id, String nome, LocalTime horarioAbertura, LocalTime horarioFechamento, String fkEnd) {
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

	public LocalTime getHorarioAbertura() {
		return horarioAbertura;
	}

	public void setHorarioAbertura(LocalTime horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}

	public LocalTime getHorarioFechamento() {
		return horarioFechamento;
	}

	public void setHorarioFechamento(LocalTime horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}

	public String getFkEnd() {
		return fkEnd;
	}

	public void setFkEnd(String fkEnd) {
		this.fkEnd = fkEnd;
	}
}