package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// IMPLEMENTAÇÃO DA INTERFACE
		//list.forEach(new PriceUpdate());
		
		// REFERENCE METHOD COM MÉTODO ESTÁTICO
		//list.forEach(Product::staticPriceUpdate);
		
		// REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
		//list.forEach(Product::nonStaticPriceUpdate);
		
		// EXPRESSÃO LAMBDA DECLARADA
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
		//list.forEach(cons);
		
		// EXPRESSÃO LAMBDA INLINE
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
		
	}

}
