package application;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number Lines: ");
		int m = sc.nextInt();
		
		System.out.print("Number columns: ");
		int n = sc.nextInt();
		
		int[][] matr = new int[m][n];
		
		for(int i=0; i<matr.length; i++) {                //percorrer as linhas
			for(int j=0; j<matr[i].length; j++) {           //percorrer as colunas
				matr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Number to check in matriz: ");
		int x = sc.nextInt();
		
		for(int i=0; i<matr.length; i++) {                
			for(int j=0; j<matr[i].length; j++) {           
				if (matr[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matr[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matr[i-1][j]);
					}
					if (j < matr[i].length-1) {
						System.out.println("Right: " + matr[i][j+1]);
					}
					if (i < matr.length-1) {
						System.out.println("Down: " + matr[i+1][j]);
					}
			}
		}
		
	}	
		sc.close();

	}

}
