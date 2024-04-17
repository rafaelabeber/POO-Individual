package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.entities.Endereco;
import br.com.poo.individual.io.RelatorioIO;
import br.com.poo.individual.services.DelService;
import br.com.poo.individual.services.EndService;
import br.com.poo.individual.util.Util;

public class EndController {


	EndService endService = new EndService();
	static Logger logger = Util.setupLogger();

	public void listaBairros() throws IOException {
		List<String> nomes = endService.listaBairros();
		Util.customizer();
		logger.log(Level.INFO, () -> nomes + "\n\nLista gerada com sucesso!");
	}


	
	//public void listaDelegaciaEndereco() throws IOException {
		//DelService.listaDelegaciaEndereco();
		//Util.customizer();
	//	logger.log(Level.INFO, "\n\nLista gerada com sucesso!");
	//}
}