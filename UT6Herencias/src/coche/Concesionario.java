package coche;

import java.util.*;

public class Concesionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		while(!salir) {
		System.out.println("<-- BIENVENIDO A TU CONCESIONARIO  -->");
		System.out.println("¿Qué tipo de coche quieres ver? (escriba)");
		System.out.println("Deportivo | Estandar | Monovolumen");
		
		String tipoCoche = sc.nextLine();
		
		// TENGO QUE TERMINAR LAS OPCIONES DEL SWITCH ANIDADO, DESANIDARLO, CREAR UN COCHESDISPONIBLES GENERAL
		//, CREAR LOS METODOS NECESARIOS, HACER COSAS CON LOS COMPONENTES...
		// TAMBIEN GENERAR REPARACIONES ALEATORIAS PARA CADA COCHE
		
		switch(tipoCoche.toLowerCase()) {	// pasamos el input de tipo coche a minusculas para que el switch lo detecte asi y que de igual como lo escriba el user
		case "deportivo":			
			Deportivo.almacenDeportivos();		//"Inicializa" el arraylist de deportivos 
			Deportivo.mostrarDeportivos();	
			salir = true;
			// Muestra los deportivos que hay guardados en el almacen del concesionario
			 System.out.println("¿Qué quieres hacer?\n1. Ver precios\n2. Ver reparaciones\n3. Ver componentes \n4. Volver atrás");
			int opcionDep = sc.nextInt();
			sc.nextLine();
				switch(opcionDep) {
				case 1:
					System.out.println("Introduce la matrícula del coche que quieres comprobar: ");
					Deportivo.comprobarMatricula(Deportivo.getDeportivosDisponibles());// Aqui segun la matricula, mostraremos los precios del coches con ella
				break;	
				}
			break;
			
		case "estandar":
			Estandar.almacenEstandar();
			Estandar.mostrarEstandar();
			int opcionEst = sc.nextInt();
			sc.nextLine();
			switch(opcionEst) {
			case 1:
				System.out.println("Introduce la matrícula del coche que quieres comprobar: ");
				Coche.comprobarMatricula(Estandar.getEstandarDisponibles());
				}
			break;
			
		case "monovolumen":
			Monovolumen.almacenMonovolumen();
			Monovolumen.mostrarMonovolumen();
			int opcionMon = sc.nextInt();
			sc.nextLine();
			switch(opcionMon) {
			case 1:
				System.out.println("Introduce la matrícula del coche que quieres comprobar: ");
				Monovolumen.comprobarMatricula(Monovolumen.getMonovolumenDisponibles());;
				}
			break;
		}
		
		}
		
		System.out.println("saliste");
//		boolean volver = true;
//		while(!volver) {
//			System.out.println("¿Qué quieres hacer?\n1. Ver precios\n2. Ver reparaciones\n3. Ver componentes \n4. Volver atrás");
//			switch(opcion2) {
//			
//			
//			
//			}
//		}
		
		
	}

}
