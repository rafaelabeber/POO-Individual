package br.com.poo.individual.entities;

import java.util.HashMap;
import java.util.Map;

public class Endereco {
	
	private int id;
	private int cep;
	private String bairro;
	private int numero;
		
	
	static Map<Integer, Endereco> mapaEndereco = new HashMap<>(); 
	
	public Endereco() {
		super();
		}

	public Endereco(int id, int cep, String bairro, int numero) {
		super();
		this.id = id;
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCEP() {
		return cep;
	}

	public void setCEP(int cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static Map<Integer, Endereco> getMapaEndereco() {
		return mapaEndereco;
	}
	@Override
	public String toString() {
		return "\nEndereco:\nid=" + id + "\nCEP=" + cep + "\nBairro=" + bairro + "\nNumero=" + numero;
}	
}
	