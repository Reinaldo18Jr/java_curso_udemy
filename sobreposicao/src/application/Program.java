package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Reinaldo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println("Saldo conta acc1: " + acc1.getBalance());

		Account acc2 = new SavingsAccount(1002, "Junior", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Saldo conta acc2: " + acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Ana", 1000.0, 200.0);
		acc3.withdraw(200.0);
		System.out.println("Saldo conta acc3: " + acc3.getBalance());
		
	}

}
