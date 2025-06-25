package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		//List<?> é o supertipo de qualquer lista; não List<Object>
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myObjs = myNumbers;

		
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Reinaldo", "Junior", "Souza");
		printList(myStrs);

	}

	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	//NÃO É POSSÍVEL ADICIONAR ITENS EM List<?>, compilador não sabe se o item será compatível com a lista
}
