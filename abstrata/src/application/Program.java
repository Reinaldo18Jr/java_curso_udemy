package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Program {

	public static void main(String[] args) {
		
		//Classe Account abstrata -> não é possível instanciar com ela, serve apenas de modelo para as heranças

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Reinaldo", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Junior", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Ana", 300.0, 0.01));
		list.add(new BusinessAccount(1008, "Luiza", 500.0, 500.0));
		
		// Somar todos os Balances:
		double sum = 0.0;
		for (Account acc: list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		// Depositar em todas as contas:
		for (Account acc: list) {
			acc.deposit(10.0);
		}
		for (Account acc: list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
