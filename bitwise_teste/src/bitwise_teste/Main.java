package bitwise_teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/* numero 32 em bit (0b) como mascara para comparar com n o sexto bit */
		int mask = 0b00100000;
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();

	}

}
