package application;

import java.io.File;
import java.util.Scanner;

public class Caminho_Arquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Nome do arquivo
		System.out.println("getName: " + path.getName());
		
		//Somente diretórios do arquivo
		System.out.println("getParent: " + path.getParent());
		
		//Todo o caminho do arquivo
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
	}

}
