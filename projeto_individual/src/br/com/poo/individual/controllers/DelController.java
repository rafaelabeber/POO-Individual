package br.com.poo.individual.controllers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.services.DelService;
import br.com.poo.individual.util.Util;

public class DelController {

	
	static Logger logger = Util.setupLogger();

	public void listaDelegacias() throws IOException {
		List<String> delegacias = DelService.listaDelegacias();
		Util.customizer();
		logger.log(Level.INFO, () -> delegacias + "\n\nLista gerada com sucesso!");
	}
	
	public void listaDelegaciaEndereco() throws IOException {
		DelService delService = new DelService();
		delService.listaDelegaciaEndereco();
		Util.customizer();
		logger.log(Level.INFO, "\n\nLista gerada com sucesso!");
	}
	
}
