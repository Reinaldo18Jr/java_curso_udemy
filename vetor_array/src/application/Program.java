package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; //Para indicar o tamanho que o vetor(array) terá
		
		for (int i=0; i<n; i++) {      //Para acrescentar valores dentro do vetor(array) até o limite de tamanho
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average: %.2f%n", avg);
		
		sc.close();

	}

}
