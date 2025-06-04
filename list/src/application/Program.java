package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Reinaldo");
		list.add("Ana");
		list.add("Junior");
		list.add("Luiza");
		
		list.add(2, "Outro Nome");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------");
		
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'R');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		
		System.out.println("Index of Junior: " + list.indexOf("Junior"));
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		
		System.out.println("-------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
