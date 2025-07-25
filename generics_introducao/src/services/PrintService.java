package services;

import java.util.ArrayList;
import java.util.List;

// classe genérica para reuso, mantendo um padrão de tipo instanciado
public class PrintService<Type> {
	
	List<Type> list = new ArrayList<>();
	
	public void addValue(Type value) {
		list.add(value);
	}

	public Type first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		
		System.out.println("]");
	}
}
