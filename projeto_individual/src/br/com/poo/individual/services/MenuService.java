package br.com.poo.individual.services;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.util.Util;

public class MenuService {

	static Logger logger = Util.setupLogger();
	static Scanner sc = new Scanner(System.in);

	public static void menu() throws IOException, InterruptedException {

		Util.customizer();
		logger.log(Level.INFO, """
				Menu interativo:
				[1]\tImpresso
				[2]\tConsole
				[0]\tSair
				Digite uma opção:
				""");
		try {
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				SubMenuService.subMenuImpresso();
				break;
			case 2:
				SubMenuService.subMenuConsole();
				break;
			case 0:
				Util.customizer();
				logger.log(Level.INFO, "Volte sempre!");
				break;
			default:
				Util.customizer();
				logger.log(Level.INFO, "Opção inválida!");
				menu();
				break;
			}
		} catch (InputMismatchException e) {
			Util.customizer();
			logger.log(Level.INFO, "\n\nOpção inválida!\n\n");
			sc.nextLine();
			Thread.sleep(2000);
			menu();
		}
	}
}
