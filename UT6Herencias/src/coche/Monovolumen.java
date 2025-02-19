package coche;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Monovolumen extends Coche{

	private int plazas;

	public Monovolumen(String marca, String matricula, float precioCoste, float precioVenta, int plazas) {
		super(marca, matricula, precioCoste, precioVenta);
		this.plazas = plazas;
	}
	
	public static List<Monovolumen> monovolumenDisponibles = new ArrayList<>();		//metodo crea rray list para monovolumen

	// Aquí es donde se almacenan los deportivos que creamos 
	public static void almacenMonovolumen() {
		agregarMonovolumen("Audi RSQ8","3218SDD",93000.f,110000.f,5);
		agregarMonovolumen("Jeep Grand Cherokee","5555MWK",120000.f,100000.f,5);
	}
	
	 // Este método hace la misma función que agregar a la lista, pero nos facilitará si en el futuro queremos meter más coches
	public static void agregarMonovolumen(String marca, String matricula, float precioCoste, float precioVenta, int plazas) {
		Monovolumen mon = new Monovolumen(marca,matricula,precioCoste,precioVenta,plazas);
		monovolumenDisponibles.add(mon);
	}
	
	//Muestra los vehiculos estandar que hay (array)
	public static void mostrarMonovolumen() {
		for(Monovolumen monov : monovolumenDisponibles) {
			monov.mostrarVehiculo();
		}
	}
	
	// Comprueba la matricula para mostrar los precios en el main 
//	public static void comprobarMatricula() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce la matrícula:");
//        String mat = sc.nextLine();
//        boolean encontrado = false;
//        for (Monovolumen mono : monovolumenDisponibles) {
//            if (mat.equalsIgnoreCase(mono.getMatricula())) {
//                mono.mostrarVehiculo();
//                System.out.printf("Precio Coste: %.2f\nPrecio Venta: %.2f\n", mono.getPrecioCoste(), mono.getPrecioVenta());
//                encontrado = true;
//                break;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("No se encontró ningún vehículo con esa matrícula.");
//        }
//    }
	
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public static List<Monovolumen> getMonovolumenDisponibles() {
		return monovolumenDisponibles;
	}

	public static void setMonovolumenDisponibles(List<Monovolumen> monovolumenDisponibles) {
		Monovolumen.monovolumenDisponibles = monovolumenDisponibles;
	}
	
	
	
}
