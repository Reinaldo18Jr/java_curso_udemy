package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Reinaldo", "reinaldo@gmail.com");
		Client c2 = new Client("Reinaldo", "reinaldo@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		
		//PARA COMPARAR O CONTEÚDO
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
		//NÃO COMPARA O CONTEÚDO, MAS SIM AS REFERÊNCIAS DE MEMÓRIA
		System.out.println(c1 == c2);
		System.out.println();
		
		
		//TRATAMENTO DIFERENCIADO PARA LITERAIS SEM CRIAR UM OBJETO EX:(String s1 = new String("test"))
		System.out.println(s1 == s2);
		
	}

}
