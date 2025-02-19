package agenda;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Pagina {

	private int dia;
	private int mes;
	private List<Cita> citas;
	
	public Pagina(int dia, int mes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.citas = new ArrayList<>();
	}

	public void agregarCita(Cita c) {
		this.citas.add(c);
	}
	
	public void eliminarCita(Cita c) {
		this.citas.remove(c);
	}
	
	public Cita buscarCita(String titulo) {
		for(Cita c : citas) {
			if(c.getTitulo().equals(titulo)) {
				return c;
			}
		}
		return null;
	}
	
	public void verCitas() {
		for(Cita cita : citas) {
			System.out.println("Título: " + cita.getTitulo() + "\nHora: "+ cita.getHora() + ":" + cita.getMinutos()
			+ "\nTexto: " + cita.getTexto());
		}
		
	}
	
	
	
	
	
	
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	
	
	
}
