package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Endereco;
import br.com.poo.individual.io.RelatorioIO;

public class EndService {

	public void listaBairros() throws IOException {
		List<String> listaBairros = new ArrayList<>();
		for (Endereco endereco : Endereco.getMapaEndereco().values()) {
			listaBairros.add(endereco.getBairro());
		}
		RelatorioIO.relatorioListaBairros(listaBairros);
	}

	public List<Endereco> listaEnderecos() {
		List<Endereco> listaEndereco = new ArrayList<>();

		for (Endereco endereco : Endereco.getMapaEndereco().values()) {
			listaEndereco.add(endereco);
		}
		return listaEndereco;
	}

	public List<String> listaBairrosTela() throws IOException {
		List<String> listaBairros = new ArrayList<>();
		for (Endereco endereco : Endereco.getMapaEndereco().values()) {
			listaBairros.add(endereco.getBairro());
		}
		return listaBairros;
	}
}
