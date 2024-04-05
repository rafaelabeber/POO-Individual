package br.com.poo.individual.entities;

public class Endereco {
	
	private int id;
	private int CEP;
	private String Bairro;
	private int Numero;
		
		
	public Endereco() {
		super();
		}

	public Endereco(int id, int cEP, String bairro, int numero) {
		super();
		this.id = id;
		CEP = cEP;
		Bairro = bairro;
		Numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
}	
	