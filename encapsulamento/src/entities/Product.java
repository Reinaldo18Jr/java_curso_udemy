package entities;

public class Product {
	
	//ENCAPSULAMENTO (privatiza os valores)
	private String name;
	private double price;
	private int quantity;
	
	//CONSTRUTOR:
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//SOBRECARGA - Outra versão do construtor padrão com valores de parametros diferentes
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//ENCAPSULAMENTO -> get: usado para RESGATAR valor private
	public String getName() {
		return name;
	}
	
	//ENCAPSULAMENTO -> set: usado para ALTERAR valor private
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

