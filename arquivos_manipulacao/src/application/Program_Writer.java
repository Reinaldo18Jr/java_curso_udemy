package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program_Writer {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good Night" };
		String path = "c:\\eclipse\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //(new FileWriter(path, true) -> para não recriar o arquivo, apenas continuar escrevendo no mesmo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
