package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.services.EndService;
import br.com.poo.individual.util.Util;

public class EndController {

	EndService endService = new EndService();
	static Logger logger = Util.setupLogger();

	public void listaBairros() throws IOException {
		endService.listaBairros();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nLista gerada com sucesso!");
	}

	public void listaBairrosTela() throws IOException {
		List<String> nomes = endService.listaBairrosTela();
		Util.customizer();
		logger.log(Level.INFO, () -> nomes + "\n\nLista gerada com sucesso!");
	}
}