package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public static void write(String path, String arg, String arg2, String arg3 , String arg4) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			bw.write(arg);
			bw.newLine();
			bw.write(arg2);
			bw.newLine();
			bw.write(arg3);
			bw.newLine();
			bw.write(arg4);
			bw.newLine();
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
