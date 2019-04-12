package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Runners;
import services.Reader;
import services.Times;
import services.Writer;

public class Program {

	public static void main(String[] args) {
		Runners runners = new Runners();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo origem: ");
		String rootPath = sc.next(); //"c://temp//tempos.txt"
		System.out.print("Digite o diretório onde deseja salvar os resultados: ");
		String finalPath = sc.next(); //"c://temp//resultado.txt"
		
		/*
		 * Lendo o arquivo origem
		 */
		List<String> tempos = new ArrayList<>();
		tempos = Reader.read(rootPath);

		for (int i = 2; i <= 7; i++) {
			runners.addFelipeMassa(tempos.get(i));
		}

		for (int i = 8; i <= 13; i++) {
			runners.addLewisHamilton(tempos.get(i));
		}

		for (int i = 14; i <= 19; i++) {
			runners.addJensonButton(tempos.get(i));
		}

		
		
		if(Writer.write(finalPath, Times.melhorTempo(runners.getFelipeMassa(), runners.getLewisHamilton(), runners.getJensonButton()),
				Times.melhorTempoUnico(runners.getFelipeMassa(), runners.getLewisHamilton(), runners.getJensonButton()), 
				Times.piorTempoUnico(runners.getFelipeMassa(), runners.getLewisHamilton(), runners.getJensonButton()),
				Times.tempoMedioPorVolta(runners.getFelipeMassa(), runners.getLewisHamilton(), runners.getJensonButton()))) {
			
			System.out.println("Arquivo destino gerado com sucesso!");
		}else {
			System.out.println("Erro ao criar arquivo destino!");
		}
	
		sc.close();
	}
}