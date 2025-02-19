package coche2;

public class Carroceria {

	private String color, condicion;

	public Carroceria(String color, String condicion) {
		super();
		this.color = color;
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		return "Carroceria [color=" + color + ", condicion=" + condicion + "]";
	}
	
}
