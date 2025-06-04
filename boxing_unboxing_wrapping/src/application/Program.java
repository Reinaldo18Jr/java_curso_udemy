package application;

public class Program {

	public static void main(String[] args) {

		//BOXING - DO STACK PARA O HEAP
		int x = 20;
		//Object obj = x;
		Integer obj = x;
		
		System.out.println(obj);
		
		//UNBOXING - DO HEAP PARA O STACK
		//int y = (int) obj;
		int y = obj * 2;

		System.out.println(y);
	}

}
