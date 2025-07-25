package entities;

public class Product {
	
	//ENCAPSULAMENTO (privatiza os valores)
	private String name;
	private double price;
	private int quantity;
	
	//AUTO CONSTRUTOR -> botão direito -> Source -> Generate Constructor using Fields...
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//SOBRECARGA
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//AUTO GET / SET -> botão direito -> Source -> Generate Getters and Setters...
	public String getName() {
		return name;
	}

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
