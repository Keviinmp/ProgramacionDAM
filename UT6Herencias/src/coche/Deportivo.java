package coche;

import java.util.ArrayList;
import java.util.List;	
import java.util.Scanner;

public class Deportivo extends Coche {

	public Deportivo(String marca, String matricula, float precioCoste, float precioVenta) {
		super(marca, matricula, precioCoste, precioVenta);
	}

	private static List<Deportivo> deportivosDisponibles = new ArrayList<>();	// Creamos un arrayList para guardar deportivos

		// Aquí es donde se almacenan los deportivos que creamos 
		public static void almacenDeportivos() {
        agregarDeportivo("Ferrari 458 Pista", "3728JLV", 180000.f, 200000.f);
        agregarDeportivo("Porsche 911 GT3 RS", "4924HLM", 220000.f, 300000.f);
        agregarDeportivo("Alfa Romeo Giulia", "2229GTS", 50000.f, 80000.f);
        agregarDeportivo("Lamborghini Revuelto", "9271KKT", 400000.f, 350000.f);
        agregarDeportivo("Dodge Challenger", "3318GHF", 70000.f, 70000.f);
		}
	
	 // Este método hace la misma función que agregar a la lista, pero nos facilitará si en el futuro queremos meter más coches
	 	 public static void agregarDeportivo(String marca, String matricula, float precioCoste, float precioVenta) {
	         Deportivo nuevoDeportivo = new Deportivo(marca, matricula, precioCoste, precioVenta);
	         deportivosDisponibles.add(nuevoDeportivo);
	     }
	 	 
	 	public static void mostrarDeportivos() {
	 		for(Deportivo dep : deportivosDisponibles) {
	 			dep.mostrarVehiculo();
	 		}
	 	}

//	 // Comprueba la matricula para mostrar los precios en el main 	
//	 	public static void comprobarMatricula() {
//	 		Scanner sc = new Scanner(System.in);
//	 		String mat = sc.nextLine();
//	 		boolean encontrado = false;
//	        for (Deportivo dep : deportivosDisponibles) {
//	            if (mat.equalsIgnoreCase(dep.getMatricula())) {
//	                dep.mostrarVehiculo();
//	                dep.mostrarPrecios();
//	                encontrado = true;
//	            }
//	        }
//	        if (!encontrado) {
//	            System.out.println("No se encontró ningún vehículo con esa matrícula.");
//	        }
//	    }
	 	
	 	public static List<Deportivo> getDeportivosDisponibles() {
			return deportivosDisponibles;
		}

		public static void setDeportivosDisponibles(List<Deportivo> deportivosDisponibles) {
			Deportivo.deportivosDisponibles = deportivosDisponibles;
		}
	 	
}
