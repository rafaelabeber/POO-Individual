package br.com.poo.individual.services;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.poo.individual.controllers.DelController;
import br.com.poo.individual.controllers.EndController;
import br.com.poo.individual.util.Util;

public class SubMenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void SubMenuImpresso() throws IOException {
		DelController delController = new DelController();
		EndController endController = new EndController();

		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tListar delegacias
				[2]\tListar nomes-bairros
				[3]\tListar delegacia endereço
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista das Delegacias: \n");
			delController.listaDelegacias();
			logger.log(Level.INFO, "\n");
			SubMenuImpresso();
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista dos Bairros que possuem Delegacias: \n");
			endController.listaBairros();
			logger.log(Level.INFO, "\n");
			SubMenuImpresso();
			break;
		case 3:
			Util.customizer();
			logger.log(Level.INFO, "Lista de Delegacias e seus Endereços: \n");
			delController.listaDelegaciaEndereco();
			logger.log(Level.INFO, "\n");
			SubMenuImpresso();
			break;

		case 0:
			Util.customizer();
			logger.log(Level.INFO, "Volte sempre!");
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			SubMenuImpresso();
			break;
		}

	}

	public static void subMenuConsole() throws IOException {
		DelController delController = new DelController();
		
		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tCadastrar Delegacia
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista as Delegacias existentes");
			delController.listaDelegacias();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole();
			break;
		case 0:
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			SubMenuImpresso();
			break;
		}

	}
}

