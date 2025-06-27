package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		//HashSet - MAIS RÁPIDO E NÃO GARANTE A ORDENAÇÃO DOS ITENS
		Set<String> set1 = new HashSet<>();
		
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");
		
		System.out.println(set1.contains("Notebook"));
		
		for (String p : set1) {
			System.out.println(p);
		}
		
		System.out.println();
		
		
		//TreeSet - MAIS LENTO E GARANTE A ORDENAÇÃO DOS ITENS
		Set<String> set2 = new TreeSet<>();

		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");

		System.out.println(set2.contains("Notebook"));

		for (String p : set2) {
			System.out.println(p);
		}

		System.out.println();
		
		
		//LinkedHashSet - MANTEM A ORDEM EM QUE OS ITENS FORAM INSERIDOS
		Set<String> set3 = new LinkedHashSet<>();

		set3.add("Tablet");
		set3.add("Tv");
		set3.add("Notebook");

		System.out.println(set3.contains("Notebook"));

		for (String p : set3) {
			System.out.println(p);
		}

		System.out.println();
		
	}
		
		//set.remove("tablet") => apaga o item do set
		//set.removeIf(x -> x.lenght >= 3) => apaga se os itens satisfazerem o predicado
		
}
