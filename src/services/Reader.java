package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	
	private static List<String> list = new ArrayList<>();
	
	public static List<String> read(String path) {
		
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			line = br.readLine();
			list.add(line);
			while(line != null) {
				line=br.readLine();
				list.add(line);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}
}
