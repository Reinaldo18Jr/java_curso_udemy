package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.BrazilInterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		//InterestService is = new UsaInterestService(1.0);
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("----------------------------");
		System.out.println("Payment after " + months + " months:");
		System.out.println("-> " + String.format("%.2f", payment));
		System.out.println("----------------------------");
		
		sc.close();

	}

}
