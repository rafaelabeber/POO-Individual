package br.com.poo.individual.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.io.RelatorioIO;

public class DelService {

	public static List<String> listaNomesDelegaciasTela() {
		List<String> listaNomesDelegacias = new ArrayList<>();
		for (Delegacia delegacia : Delegacia.getMapaDelegacia().values()) {
			listaNomesDelegacias.add(delegacia.getNome());
		}
		return listaNomesDelegacias;

	}

	public static void listaDelegaciaEndereco() throws IOException {
		EndService endService = new EndService();
		RelatorioIO.relatorioDelegaciaEndereco(obterDelegacias(), endService.listaEnderecos());
	}

	public static List<Delegacia> listaDelegacias() throws IOException {
		List<Delegacia> listaDelegacias = new ArrayList<>();
		for (Delegacia delegacia : Delegacia.getMapaDelegacia().values()) {
			listaDelegacias.add(delegacia);
		}
		RelatorioIO.relatorioListaDelegacias(listaDelegacias);
		return listaDelegacias;

	}

	public static List<Delegacia> obterDelegacias() throws IOException {
		List<Delegacia> listaDelegacias = new ArrayList<>();
		for (Delegacia delegacia : Delegacia.getMapaDelegacia().values()) {
			listaDelegacias.add(delegacia);
		}
		return listaDelegacias;

	}
}