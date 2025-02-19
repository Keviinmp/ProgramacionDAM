package coche2;

import java.util.List;

public class Monovolumen extends Coche {

	private Integer plazas;

	public Monovolumen(String marca, Integer numero, float precioCoste, float precioVenta, Integer plazas, Motor motor,
			Carroceria carroceria, List<Ruedas> ruedas) {
		super(marca, numero, precioCoste, precioVenta, motor, carroceria, ruedas);
		this.plazas = plazas;
	}
	
	

	
	
	
}
