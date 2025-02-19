package coche;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Estandar extends Coche {

	private int puertas;

	public Estandar(String marca, String matricula, float precioCoste, float precioVenta, int puertas) {
		super(marca, matricula, precioCoste, precioVenta);
		this.puertas = puertas;
	}

	private static List<Estandar> estandarDisponibles = new ArrayList<>();	//Array list para estandar
	
	// Aquí es donde se almacenan los deportivos que creamos 
	public static void almacenEstandar() {
		agregarEstandar("Seat León","3837HLM",15000.f,9500.f,5);
		agregarEstandar("BMW M3 e60","2910FCK",50000.f,70000.f,5);
		agregarEstandar("Mazda Miata","4811KLK",30000.f,17000.f,3);
	}
	
	// Este método hace la misma función que agregar a la lista, pero nos facilitará si en el futuro queremos meter más coches
	public static void agregarEstandar(String marca, String matricula, float precioCoste, float precioVenta, int puertas) {
		Estandar est = new Estandar(marca,matricula,precioCoste,precioVenta,puertas);
		estandarDisponibles.add(est);
	}
	
	//Muestra los vehiculos estandar que hay (array)
	public static void mostrarEstandar() {
		for(Estandar estan : estandarDisponibles) {
			estan.mostrarVehiculo();
		}
	}
	
	
	// Comprueba la matricula para mostrar los precios en el main 
//	public static void comprobarMatricula() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce la matrícula:");
//        String mat = sc.nextLine();
//        boolean encontrado = false;
//        for (Estandar est : estandarDisponibles) {
//            if (mat.equalsIgnoreCase(est.getMatricula())) {
//                est.mostrarVehiculo();
//                System.out.printf("Precio Coste: %.2f\nPrecio Venta: %.2f\n", est.getPrecioCoste(), est.getPrecioVenta());
//                encontrado = true;
//                break;
//            }
//        }
//        if (!encontrado) {
//            System.out.println("No se encontró ningún vehículo con esa matrícula.");
//        }
//    }
	
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public static List<Estandar> getEstandarDisponibles() {
		return estandarDisponibles;
	}

	public static void setEstandarDisponibles(List<Estandar> estandarDisponibles) {
		Estandar.estandarDisponibles = estandarDisponibles;
	}
	
	
	
	
}
