package entities;

import java.util.ArrayList;
import java.util.List;

public class Runners {
	
	List<String> felipeMassa = new ArrayList<>();
	List<String> lewisHamilton = new ArrayList<>();
	List<String> jensonButton = new ArrayList<>();
	
	public void addFelipeMassa(String arg) {
		felipeMassa.add(arg);
	}
	
	public void addLewisHamilton(String arg) {
		lewisHamilton.add(arg);
	}
	
	public void addJensonButton(String arg) {
		jensonButton.add(arg);
	}

	public List<String> getFelipeMassa() {
		return felipeMassa;
	}

	public List<String> getLewisHamilton() {
		return lewisHamilton;
	}

	public List<String> getJensonButton() {
		return jensonButton;
	}
	
	
}
