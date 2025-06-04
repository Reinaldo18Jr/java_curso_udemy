package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account x = new Account(1020, "Reinaldo", 1000.0);
		Account y = new SavingsAccount(1023, "Junior", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
//POLIMORFISMO -> variáveis do mesmo tipo (x, y = Account) mas com comportamentos diferentes (withdraw), conforme objetos que foram instanciados (Account e SavingsAccount)
	}

}
