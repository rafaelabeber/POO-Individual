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

	public static void subMenuImpresso() throws IOException {
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
			logger.log(Level.INFO, "Listando Delegacias... \n");
			delController.listaDelegacias();
			logger.log(Level.INFO, "\n");
			subMenuImpresso();
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Listando dos Bairros que possuem Delegacias... \n");
			endController.listaBairros();
			logger.log(Level.INFO, "\n");
			subMenuImpresso();
			break;
		case 3:
			Util.customizer();
			logger.log(Level.INFO, "Listando Delegacias e seus Endereços... \n");
			delController.listaDelegaciaEndereco();
			logger.log(Level.INFO, "\n");
			subMenuImpresso();
			break;

		case 0:
			Util.customizer();
			logger.log(Level.INFO, "Volte sempre!");
			break;
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuImpresso();
			break;
		}

	}

	public static void subMenuConsole() throws IOException, InterruptedException {
		DelController delController = new DelController();
		EndController endController = new EndController();

		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tMostrar Relatório da Delagacia na Tela.
				[2]\tMostrar Relatório de Endereços na Tela.
				[0]\tSair
				Digite uma opção:
				""");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			Util.customizer();
			logger.log(Level.INFO, "Lista as Delegacias existentes");
			delController.listaNomesDelegacias();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole();
			break;
		case 2:
			Util.customizer();
			logger.log(Level.INFO, "Lista dos Endereços existentes");
			endController.listaBairrosTela();
			logger.log(Level.INFO, "\n\n");
			subMenuConsole();
			break;
		case 0:
			MenuService.menu();
		default:
			Util.customizer();
			logger.log(Level.INFO, "Opção inválida!");
			subMenuImpresso();
			break;
		}

	}
}
