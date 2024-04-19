package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.services.DelService;
import br.com.poo.individual.util.Util;

public class DelController {

	static Logger logger = Util.setupLogger();

	//console
	public void listaNomesDelegacias() throws IOException {
		List<String> delegacias = DelService.listaNomesDelegaciasTela();
		Util.customizer();
		logger.log(Level.INFO, () -> delegacias + "\n\nLista gerada com sucesso!");
	}
	//impresso
	public void listaDelegacias() throws IOException {
		DelService.listaDelegacias();
		Util.customizer();
		logger.log(Level.INFO, () -> "\n\nLista gerada com sucesso!");
	}
	//impresso
	public void listaDelegaciaEndereco() throws IOException {
		DelService.listaDelegaciaEndereco();
		Util.customizer();
		logger.log(Level.INFO, "\n\nLista gerada com sucesso!");
	}

}
