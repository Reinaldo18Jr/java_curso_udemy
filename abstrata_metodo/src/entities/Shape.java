package entities;

import entities.enums.Color;

// Classe Abstrata -> Não pode ser instanciada, apenas as heranças
public abstract class Shape {
	
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	// Método Abstrato -> não implementado na classe mãe, mas sim nas heranças
	public abstract double area();
}
