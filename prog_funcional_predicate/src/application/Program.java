package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// IMPLEMENTAÇÃO DA INTERFACE
		//list.removeIf(new ProductPredicate());
		
		// REFERENCE METHOD COM MÉTODO ESTÁTICO
		//list.removeIf(Product::staticProductPredicate);
		
		// REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
		//list.removeIf(Product::nonStaticProductPredicate);
		
		// EXPRESSÃO LAMBDA DECLARADA
		//Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		//list.removeIf(pred);
		
		// EXPRESSÃO LAMBDA INLINE
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
	}

}
