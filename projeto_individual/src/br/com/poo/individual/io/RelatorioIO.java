package br.com.poo.individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import br.com.poo.individual.entities.Delegacia;
import br.com.poo.individual.entities.Endereco;
import br.com.poo.individual.enums.TipoRegistro;

public class RelatorioIO {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	static DateTimeFormatter dtfBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while ((linha = buffRead.readLine()) != null) {

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

				Endereco.getMapaEndereco().put(Integer.parseInt(atributos[1]), endereco);

				// logger.log(Level.INFO, endereco::toString);

			} else if (atributos[0].equalsIgnoreCase(TipoRegistro.DELEGACIA.name())) {

				Delegacia delegacia = new Delegacia(

						Integer.parseInt(atributos[1]), // id
						atributos[2], // nome
						LocalTime.parse(atributos[3]), // horario abertura
						LocalTime.parse(atributos[4]), // horario fechamento
						Integer.parseInt(atributos[5]) // fkEnd
				);

				Delegacia.getMapaDelegacia().put(Integer.parseInt(atributos[1]), delegacia);

				// logger.log(Level.INFO, delegacia::toString);
			}

		}
		buffRead.close();
	}
	// lista de bairros

	public static void relatorioListaBairros(List<String> nomesBairros) throws IOException {
		String nome = "lista-nomes-bairros.txt";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA NOMES DOS BAIRROS ------\n\n");
		if (!nomesBairros.isEmpty()) {

			for (String nomeBairros : nomesBairros) {
				buffWrite.append(nomeBairros + "\n");
			}

			// buffWrite.close();
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA NOMES DOS BAIRROS--------\n\n");
		buffWrite.close();

	}
	// lista delegacia

	public static void relatorioListaDelegacias(List<Delegacia> delegacias) throws IOException {
		String nome = "lista-delegacias";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DELEGACIAS------\n\n");
		if (!delegacias.isEmpty()) {

			for (Delegacia delegacia : delegacias) {
				buffWrite.append("\nNome: " + delegacia.getNome() // nome
						+ "\nHorarioAbertura: " + delegacia.getHorarioAbertura() // abre
						+ "\nHorarioFechamento: " + delegacia.getHorarioFechamento() + "\n"); // fecha

			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA DELEGACIAS--------\n\n");
		buffWrite.close();
	}

	// lista delegacia e bairro

	public static void relatorioDelegaciaEndereco(List<Delegacia> delegacias, List<Endereco> enderecos)
			throws IOException {
		String nome = "lista-delegacia-endereco";

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO, true));

		buffWrite.append("-------RELATÓRIO: LISTA DE DELEGACIA E SEUS ENDEREÇOS------\n\n");
		if (!delegacias.isEmpty() && !enderecos.isEmpty()) {

			for (Delegacia delegacia : delegacias) {
				for (Endereco endereco : enderecos) {
					if (Objects.equals(delegacia.getFkEnd(), endereco.getId())) {
						buffWrite.append("\nNome da delegacia: " + delegacia.getNome() // nome da delegacia
								+ "\nBairro: " + endereco.getBairro() // bairro
								+ "\nNumero: " + endereco.getNumero() // numero
								+ "\nCEP: " + endereco.getCEP() + "\n"); // cep
					}
				}
			}
		}
		LocalDateTime ldt = LocalDateTime.now();
		buffWrite.append("\nData da requisição: " + dtfBr.format(ldt));
		buffWrite.append("\n\n---------FIM DA LISTA ENDEREÇO DELEGACIA--------\n\n");
		buffWrite.close();
	}

}
