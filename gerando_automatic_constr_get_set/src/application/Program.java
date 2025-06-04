package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		//Variavel auxiliar para o Construtor
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		//Variavel auxiliar para o Construtor
		double price = sc.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//Variavel auxiliar para o Construtor
		//int quantity = sc.nextInt();
		
		//Usando variaveis auxiliares nos parametros da classe com construtor
		Product product = new Product(name, price); //quantity
		
		//Atribuir novo valor para private da classe
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName()); //getName() -> Resgata o valor de name da classe
		
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}

