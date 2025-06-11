package application;

import java.io.File;
import java.util.Scanner;

public class Pastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Listar Pastas:
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File folder: folders) {
			System.out.println(folder);
		}
		
		//Listar Arquivos:
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		for (File file: files) {
			System.out.println(file);
		}
		
		//Criar Subpasta:
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretory created successfully: " + success);
		
		sc.close();

	}

}
