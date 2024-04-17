package br.com.poo.individual.application;

import java.io.IOException;
import br.com.poo.individual.io.RelatorioIO;
import br.com.poo.individual.services.SubMenuService;

public class IndividualApplication {
	public static void main (String[] args) throws IOException {
		
		RelatorioIO.leitor("banco");
		SubMenuService.menu();
	}
}
