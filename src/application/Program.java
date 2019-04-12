package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import services.Reader;
import services.Writer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho do arquivo: ");
		String path = "c://temp//tempos.txt"; // sc.next();
		String path2 = "c://temp//resultado.txt"; //sc.next();

		List<String> tempos = new ArrayList<>();

		tempos = Reader.read(path);

		List<String> felipeMassa = new ArrayList<>();

		for (int i = 2; i <= 7; i++) {
			felipeMassa.add(tempos.get(i));
		}

		List<String> lewisHamilton = new ArrayList<>();

		for (int i = 8; i <= 13; i++) {
			lewisHamilton.add(tempos.get(i));
		}

		List<String> jensonButton = new ArrayList<>();

		for (int i = 14; i <= 19; i++) {
			jensonButton.add(tempos.get(i));
		}

		
		
		Writer.write(path2, melhorTempo(felipeMassa, lewisHamilton, jensonButton), melhorTempoUnico(felipeMassa, lewisHamilton, jensonButton), piorTempoUnico(felipeMassa, lewisHamilton, jensonButton), tempoMedioPorVolta(felipeMassa, lewisHamilton, jensonButton));
		
	}

	public static String tempoMedioPorVolta(List<String> felipe, List<String> lewis, List<String> jenson) {
		List<Double> melhoresTempoMassa = new ArrayList<Double>();
		List<Double> melhoresTempoHamilton = new ArrayList<Double>();
		List<Double> melhoresTempoButton = new ArrayList<Double>();
		String melhorTempoMassa = null;
		String melhorTempoHamilton = null;
		String melhorTempoButton = null;
		Integer voltaMassa = null;
		Integer voltaHamilton = null;
		Integer voltaButton = null;

		for (int i = 1; i <= 5; i++) {
			melhoresTempoMassa.add(Double.parseDouble(felipe.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoHamilton.add(Double.parseDouble(lewis.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoButton.add(Double.parseDouble(jenson.get(i)));
		}

		Double mediaMassa = 0.0;
		int i = 0;
		for (Double obj : melhoresTempoMassa) {
			mediaMassa += obj.doubleValue();
		}
		melhorTempoMassa = "FelipeMassa" + ", " + mediaMassa/5;

		Double mediaHamilton = 0.0;
		for (Double obj : melhoresTempoHamilton) {
			mediaHamilton += obj.doubleValue();
		}
		melhorTempoHamilton = "Lewis Hamilton" + ", " + mediaHamilton/5;

		Double mediaButton = 0.0;
		for (Double obj : melhoresTempoButton) {
			mediaButton += obj.doubleValue();
		}
		melhorTempoButton = "Jenson Button" + ", " + mediaButton/5;

		return melhorTempoMassa + ", " + melhorTempoHamilton + ", " + melhorTempoButton;

	}

	public static String piorTempoUnico(List<String> felipe, List<String> lewis, List<String> jenson) {
		List<Double> melhoresTempoMassa = new ArrayList<Double>();
		List<Double> melhoresTempoHamilton = new ArrayList<Double>();
		List<Double> melhoresTempoButton = new ArrayList<Double>();
		String melhorTempoMassa = null;
		String melhorTempoHamilton = null;
		String melhorTempoButton = null;
		Integer voltaMassa = null;
		Integer voltaHamilton = null;
		Integer voltaButton = null;

		for (int i = 1; i <= 5; i++) {
			melhoresTempoMassa.add(Double.parseDouble(felipe.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoHamilton.add(Double.parseDouble(lewis.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoButton.add(Double.parseDouble(jenson.get(i)));
		}

		Double melhorTempoMassaDouble = melhoresTempoMassa.get(0);
		int i = 0;
		for (Double obj : melhoresTempoMassa) {
			if (obj.doubleValue() < melhorTempoMassaDouble) {
				melhorTempoMassaDouble = obj.doubleValue();
				voltaMassa = i + 1;
			}
			i++;
		}
		melhorTempoMassa = "FelipeMassa" + ", " + voltaMassa + ", " + melhorTempoMassaDouble;

		Double melhorTempoHamiltonDouble = melhoresTempoHamilton.get(0);
		i = 0;
		for (Double obj : melhoresTempoHamilton) {
			if (obj.doubleValue() < melhorTempoHamiltonDouble) {
				melhorTempoHamiltonDouble = obj.doubleValue();
				voltaHamilton = i + 1;
			}
			i++;
		}
		melhorTempoHamilton = "Lewis Hamilton" + ", " + voltaHamilton + ", " + melhorTempoHamiltonDouble;

		Double melhorTempoButtonDouble = melhoresTempoButton.get(0);
		i = 0;
		for (Double obj : melhoresTempoButton) {
			if (obj.doubleValue() < melhorTempoButtonDouble) {
				melhorTempoButtonDouble = obj.doubleValue();
				voltaButton = i + 1;
			}
			i++;
		}
		melhorTempoButton = "Jenson Button" + ", " + voltaButton + ", " + melhorTempoButtonDouble;

		return melhorTempoMassa + ", " + melhorTempoHamilton + ", " + melhorTempoButton;

	}

	public static String melhorTempoUnico(List<String> felipe, List<String> lewis, List<String> jenson) {
		List<Double> melhoresTempoMassa = new ArrayList<Double>();
		List<Double> melhoresTempoHamilton = new ArrayList<Double>();
		List<Double> melhoresTempoButton = new ArrayList<Double>();
		String melhorTempoMassa = null;
		String melhorTempoHamilton = null;
		String melhorTempoButton = null;
		Integer voltaMassa = null;
		Integer voltaHamilton = null;
		Integer voltaButton = null;

		for (int i = 1; i <= 5; i++) {
			melhoresTempoMassa.add(Double.parseDouble(felipe.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoHamilton.add(Double.parseDouble(lewis.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempoButton.add(Double.parseDouble(jenson.get(i)));
		}

		Double melhorTempoMassaDouble = melhoresTempoMassa.get(0);
		int i = 0;
		for (Double obj : melhoresTempoMassa) {
			if (obj.doubleValue() > melhorTempoMassaDouble) {
				melhorTempoMassaDouble = obj.doubleValue();
				voltaMassa = i + 1;
			}
			i++;
		}
		melhorTempoMassa = "FelipeMassa" + ", " + voltaMassa + ", " + melhorTempoMassaDouble;

		Double melhorTempoHamiltonDouble = melhoresTempoHamilton.get(0);
		i = 0;
		for (Double obj : melhoresTempoHamilton) {
			if (obj.doubleValue() > melhorTempoHamiltonDouble) {
				melhorTempoHamiltonDouble = obj.doubleValue();
				voltaHamilton = i + 1;
			}
			i++;
		}
		melhorTempoHamilton = "Lewis Hamilton" + ", " + voltaHamilton + ", " + melhorTempoHamiltonDouble;

		Double melhorTempoButtonDouble = melhoresTempoButton.get(0);
		i = 0;
		for (Double obj : melhoresTempoButton) {
			if (obj.doubleValue() > melhorTempoButtonDouble) {
				melhorTempoButtonDouble = obj.doubleValue();
				voltaButton = i + 1;
			}
			i++;
		}
		melhorTempoButton = "Jenson Button" + ", " + voltaButton + ", " + melhorTempoButtonDouble;

		return melhorTempoMassa + ", " + melhorTempoHamilton + ", " + melhorTempoButton;

	}

	public static String melhorTempo(List<String> felipe, List<String> lewis, List<String> jenson) {
		List<Double> melhoresTempos = new ArrayList<Double>();
		String melhorTempoString = null;
		Integer volta = null;
		String name = null;

		for (int i = 1; i <= 5; i++) {
			melhoresTempos.add(Double.parseDouble(felipe.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempos.add(Double.parseDouble(lewis.get(i)));
		}

		for (int i = 1; i <= 5; i++) {
			melhoresTempos.add(Double.parseDouble(jenson.get(i)));
		}

		Double melhorTempo = melhoresTempos.get(0);
		int cont = 0;
		for (Double obj : melhoresTempos) {
			if (obj.doubleValue() > melhorTempo) {
				melhorTempo = obj.doubleValue();
				volta = cont;
				if (cont >= 0 && cont <= 4) {
					name = "Felipe Massa";
				} else if (cont >= 5 && cont <= 9) {
					name = "Lewis Hamilton";
				} else if (cont >= 10 && cont <= 14)
					name = "Jenson Button";
			}
			cont++;
		}

		volta++;

		melhorTempoString = melhorTempo + ", " + volta + ", " + name;
		return melhorTempoString;
	}

}
