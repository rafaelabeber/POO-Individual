package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.entities.Endereco;
import br.com.poo.individual.io.RelatorioIO;

public class DelService {

	public static List<String> listaDelegacias() {
		List<String> listaDelegacias = new ArrayList<>();
		for (Delegacia delegacia : Delegacia.getMapaDelegacia().values()) {
			listaDelegacias.add(delegacia.getNome());
		}
		return listaDelegacias;
	
	}
	public void listaDelegaciaEndereco() throws IOException {
		EndService endService = new EndService();
		RelatorioIO.relatorioDelegaciaEndereco(endService.listaEndereco(), listaDelegacias());
	}
}
