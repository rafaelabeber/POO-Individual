package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.entities.Endereco;
import br.com.poo.individual.enums.TipoRegistro;
import br.com.poo.individual.util.Util;

public class RelatorioIO {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	private static Logger logger = Util.setupLogger();

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while ((linha = buffRead.readLine()) != null) {
			
				String[] dados = linha.split(";");
				// Quebra a linha em pequenas strings, que representam cada atributo de um
				// registro no banco*/

				String[] atributos = linha.split(";");

				if (atributos[0].equalsIgnoreCase(TipoRegistro.ENDERECO.name())) {

					Endereco endereco = new Endereco(

							Integer.parseInt(atributos[1]), // id
							Integer.parseInt(atributos[2]), // CEP
							atributos[3], // BAIRRO
							Integer.parseInt(atributos[4]) // NUMERO
					);

					logger.log(Level.INFO, endereco::toString);

				} else if (atributos[0].equalsIgnoreCase(TipoRegistro.DELEGACIA.name())) {

					Delegacia delegacia = new Delegacia(

							Integer.parseInt(atributos[1]), // id
							atributos[2], // nome
							LocalTime.parse(atributos[3]), // horario abertura
							LocalTime.parse(atributos[4]), // horario fechamento
							atributos[5] // fkEnd
					);

					logger.log(Level.INFO, delegacia::toString);
				}
			}
		}
	}

