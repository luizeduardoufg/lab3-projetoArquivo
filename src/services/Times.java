package services;

import java.util.ArrayList;
import java.util.List;

public class Times {
	
	public static String tempoMedioPorVolta(List<String> felipe, List<String> lewis, List<String> jenson) {
		List<Double> melhoresTempoMassa = new ArrayList<Double>();
		List<Double> melhoresTempoHamilton = new ArrayList<Double>();
		List<Double> melhoresTempoButton = new ArrayList<Double>();
		String melhorTempoMassa = null;
		String melhorTempoHamilton = null;
		String melhorTempoButton = null;

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
		for (Double obj : melhoresTempoMassa) {
			mediaMassa += obj.doubleValue();
		}
		melhorTempoMassa = "FelipeMassa" + ", " + String.format("%.2f", mediaMassa/5);

		Double mediaHamilton = 0.0;
		for (Double obj : melhoresTempoHamilton) {
			mediaHamilton += obj.doubleValue();
		}
		melhorTempoHamilton = "Lewis Hamilton" + ", " + String.format("%.2f", mediaHamilton/5);

		Double mediaButton = 0.0;
		for (Double obj : melhoresTempoButton) {
			mediaButton += obj.doubleValue();
		}
		melhorTempoButton = "Jenson Button" + ", " + String.format("%.2f",  mediaButton/5);

		return "Tempo médio: " + melhorTempoMassa + ", " + melhorTempoHamilton + ", " + melhorTempoButton;

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
		melhorTempoMassa = "Pior tempo Felipe Massa: "  + melhorTempoMassaDouble + " volta " + voltaMassa;

		Double melhorTempoHamiltonDouble = melhoresTempoHamilton.get(0);
		i = 0;
		for (Double obj : melhoresTempoHamilton) {
			if (obj.doubleValue() < melhorTempoHamiltonDouble) {
				melhorTempoHamiltonDouble = obj.doubleValue();
				voltaHamilton = i + 1;
			}
			i++;
		}
		melhorTempoHamilton = "Pior tempo Lewis Hamilton: " + melhorTempoHamiltonDouble + " volta " + voltaHamilton;

		Double melhorTempoButtonDouble = melhoresTempoButton.get(0);
		i = 0;
		for (Double obj : melhoresTempoButton) {
			if (obj.doubleValue() < melhorTempoButtonDouble) {
				melhorTempoButtonDouble = obj.doubleValue();
				voltaButton = i + 1;
			}
			i++;
		}
		melhorTempoButton ="Pior tempo Jenson Button: " + melhorTempoButtonDouble + " volta " +  voltaButton;

		StringBuilder sb = new StringBuilder();
		
		sb.append(melhorTempoMassa + ", ");
		sb.append(melhorTempoHamilton + ", ");
		sb.append(melhorTempoButton);

		return sb.toString();

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
		melhorTempoMassa = "Melhor tempo Felipe Massa: "  + melhorTempoMassaDouble + " volta " + voltaMassa;

		Double melhorTempoHamiltonDouble = melhoresTempoHamilton.get(0);
		i = 0;
		for (Double obj : melhoresTempoHamilton) {
			if (obj.doubleValue() > melhorTempoHamiltonDouble) {
				melhorTempoHamiltonDouble = obj.doubleValue();
				voltaHamilton = i + 1;
			}
			i++;
		}
		melhorTempoHamilton = "Melhor tempo Lewis Hamilton, " + melhorTempoHamiltonDouble + " volta " + voltaHamilton;

		Double melhorTempoButtonDouble = melhoresTempoButton.get(0);
		i = 0;
		for (Double obj : melhoresTempoButton) {
			if (obj.doubleValue() > melhorTempoButtonDouble) {
				melhorTempoButtonDouble = obj.doubleValue();
				voltaButton = i + 1;
			}
			i++;
		}
		melhorTempoButton ="Melhor tempo Jenson Button, " + melhorTempoButtonDouble + " volta " +  voltaButton;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(melhorTempoMassa + ", ");
		sb.append(melhorTempoHamilton + ", ");
		sb.append(melhorTempoButton);

		return sb.toString();

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

		melhorTempoString = "O melhor tempo de todos, " + "tempo: " + melhorTempo + ", " + "volta: " + volta + ", " + "corredor: " + name;
		return melhorTempoString;
	}

}
