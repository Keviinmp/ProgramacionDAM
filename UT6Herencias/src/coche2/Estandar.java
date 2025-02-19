package coche2;

import java.util.List;

public class Estandar extends Coche {

	private Integer puertas;

	public Estandar(String marca, Integer numero, float precioCoste, float precioVenta, Integer puertas, Motor motor,
			Carroceria carroceria, List<Ruedas> ruedas) {
		super(marca, numero, precioCoste, precioVenta, motor, carroceria, ruedas);
		this.puertas = puertas;
	}

	
	
	
}
