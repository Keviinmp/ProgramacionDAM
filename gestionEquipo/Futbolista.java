package gestionEquipo;

import java.util.*;

public class Futbolista implements Deportista {
	
	private String nombre;
	private int edad;
	private Posicion posicion;
	private int anyosProf;
	private List<String> equipos;
	private int trofeos;
	
	public Futbolista(String nombre, int edad, Posicion posicion, int anyosProf, List<String> equipos, int trofeos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.anyosProf = anyosProf;
		this.equipos = equipos;
		this.trofeos = trofeos;
	}
	
	@Override
	public int getAnyosProfesional() {
		return anyosProf;
	}
	
	// Método que devuelve el listado de equipos en los que ha estado el futbolista, devuelve un new arraylist para evitar 
	// la lista original y simplemente crear una lista de los equipos de ese jugador
	@Override
	public List<String> getListadoEquipos() {
		return new ArrayList<>(equipos);
	}
	@Override
	public int getTotalTrofeos() {
		return trofeos;
	}
	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public int getAnyosProf() {
		return anyosProf;
	}
	public void setAnyosProf(int anyosProf) {
		this.anyosProf = anyosProf;
	}
	public List<String> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<String> equipos) {
		this.equipos = equipos;
	}
	public int getTrofeos() {
		return trofeos;
	}
	public void setTrofeos(int trofeos) {
		this.trofeos = trofeos;
	}

	@Override
	public String toString() {
		return nombre + ", "+ edad + " Años, " + posicion + ", Años como profesional: " + anyosProf
				+ ", Historial de equipos:" + equipos + ", Trofeos ganados: " + trofeos + "]";
	}	
}
