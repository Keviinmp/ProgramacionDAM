package coche2;

public class Ruedas {

	private float tamano;
	private String condicion;
	
	public Ruedas(float tamano, String condicion) {
		super();
		this.tamano = tamano;
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		return "Ruedas [tamano=" + tamano + ", condicion=" + condicion + "]";
	}
	
	
}
