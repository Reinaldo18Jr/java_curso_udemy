package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matr = new int[n][n];
		
		for(int i=0; i<matr.length; i++) {                //percorrer as linhas
			for(int j=0; j<matr[i].length; j++) {           //percorrer as colunas
				matr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal:");
		
		for(int i=0; i<matr.length; i++) {
			System.out.print(matr[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for(int i=0; i<matr.length; i++) {
			for(int j=0; j<matr[i].length; j++) {
				if (matr[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Qtd Negatives Numbers: " + count);
		
		sc.close();

	}

}
