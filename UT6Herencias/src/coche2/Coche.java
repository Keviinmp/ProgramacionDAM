package coche2;

import java.util.ArrayList;
import java.util.List;

public abstract class Coche {

	private String marca;
	private Integer numero;
	private float precioCoste, precioVenta;
	private Motor motor;
	private Carroceria carroceria;
	private List<Ruedas> ruedas;
	private List<Reparacion> reparaciones;
	
	public Coche() {}
	public Coche(String marca, Integer numero, float precioCoste, float precioVenta) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}

	public Coche(String marca, Integer numero, float precioCoste, float precioVenta, Motor motor, Carroceria carroceria,
			List<Ruedas> ruedas) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.motor = motor;
		this.carroceria = carroceria;
		this.ruedas = ruedas;
		this.reparaciones = new ArrayList<>();
	}
	
	public Coche addRueda(Ruedas rueda) {
		if(this.ruedas.size()<5) {
			this.ruedas.add(rueda);
		}
		return this;
	}
	
	public Coche addReparacion(Reparacion reparacion) {
		this.reparaciones.add(reparacion);
		return this;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public float getPrecioCoste() {
		return precioCoste;
	}
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	public List<Ruedas> getRuedas() {
		return ruedas;
	}
	public void setRuedas(List<Ruedas> ruedas) {
		this.ruedas = ruedas;
	}
	public List<Reparacion> getReparaciones() {
		return reparaciones;
	}
	public void setReparaciones(List<Reparacion> reparaciones) {
		this.reparaciones = reparaciones;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", numero=" + numero + ", precioCoste=" + precioCoste + ", precioVenta="
				+ precioVenta + ", motor=" + motor + ", carroceria=" + carroceria + ", ruedas=" + ruedas
				+ ", reparaciones=" + reparaciones + "]";
	}
	
	
	
	
	


	
	
}
