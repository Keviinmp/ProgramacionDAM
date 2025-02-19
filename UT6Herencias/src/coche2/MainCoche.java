//package coche2;
//
//import java.util.Scanner;
//
//import Coches.Deportivo;
//import Coches.Reparacion;
//
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class MainCoche {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Deportivo deportivo = null;
//		boolean salir = false;
//		while(!salir) {
//			System.out.println("¿Qué quieres hacer?");
//			System.out.println("1. Crear monovolumen");
//			System.out.println("2. Crear estándar");
//			System.out.println("3. Crear deportivo");
//			System.out.println("4. Ver reparaciones del coche deportivo");
//			System.out.println("5. Salir");
//			int opcion = sc.nextInt();
//			switch(opcion) {
//			case 1:
//				Monovolumen monovolumen = crearMonovolumen(sc);
//				System.out.println("Monovolumen: "+monovolumen);
//				 break;
//			case 2: 
//				Estandar estandar = crearEstandar(sc);
//				System.out.println("Estándar: "+ estandar);
//				break;
//			case 3:
//				deportivo = crearDeportivo(sc);
//				System.out.println("Deportivo: "+ deportivo);
//				break;
//			case 4:
//				if (deportivo == null) {
//                    System.out.println("No se ha creado un coche deportivo aún.");
//                } else {
//                    System.out.println("Reparaciones del coche deportivo:");
//                    for (Reparacion r : deportivo.getReparaciones()) {
//                        System.out.println("- Reparación realizada el: " + r.getFecha());
//                    }
//                }
//                break;
//				
//			case 5:
//				 salir = true;
//                 System.out.println("Saliendo del programa...");
//                 break;
//             
//			 default:
//                 System.out.println("Opción no válida, intenta de nuevo.");
//         }
//			}
//			}
//
//	public static Monovolumen crearMonovolumen(Scanner sc) {
//		System.out.println("Introduce la marca: ");
//		String marca = sc.nextLine();
//		sc.nextLine();
//		System.out.println("Introduce el número:");
//		Integer numero = sc.nextInt();
//		System.out.println("Introduce el precio de coste: ");
//		float coste = sc.nextFloat();
//		System.out.println("Introduce el precio de venta: ");
//		float venta = sc.nextFloat();
//		System.out.println("Introduce el número de plazas:");
//		Integer plazas = sc.nextInt();
//		
//		// Pedir datos de la carrocería y motor
//		Motor motor = crearMotor(sc);
//		Carroceria carroceria = crearCarroceria(sc);
//		ArrayList<Ruedas> ruedas = crearListaRuedas(sc);
//		
//		return new Monovolumen(marca,numero,coste,venta,plazas,motor,carroceria,ruedas);
//		
//	}
//	
//	public static Estandar crearEstandar(Scanner sc) {
//		System.out.println("Introduce la marca: ");
//		String marca = sc.nextLine();
//		System.out.println("Introduce el número:");
//		Integer numero = sc.nextInt();
//		System.out.println("Introduce el precio de coste: ");
//		float coste = sc.nextFloat();
//		System.out.println("Introduce el precio de venta: ");
//		float venta = sc.nextFloat();
//		System.out.println("Introduce el número de puertas:");
//		Integer puertas = sc.nextInt();
//		
//		// Pedir datos de la carrocería y motor
//		Motor motor = crearMotor(sc);
//		Carroceria carroceria = crearCarroceria(sc);
//		ArrayList<Ruedas> ruedas = crearListaRuedas(sc);
//		
//		return new Estandar(marca,numero,coste,venta,puertas,motor,carroceria,ruedas);
//		
//		
//	}
//	
//	public static Deportivo crearDeportivo(Scanner sc) {
//		System.out.println("Introduce la marca: ");
//		String marca = sc.nextLine();
//		sc.nextLine();
//		System.out.println("Introduce el número:");
//		Integer numero = sc.nextInt();
//		System.out.println("Introduce el precio de coste: ");
//		float coste = sc.nextFloat();
//		System.out.println("Introduce el precio de venta: ");
//		float venta = sc.nextFloat();
//		
//		// Pedir datos de la carrocería y motor
//		Motor motor = crearMotor(sc);
//		Carroceria carroceria = crearCarroceria(sc);
//		ArrayList<Ruedas> ruedas = crearListaRuedas(sc);
//		
//		Deportivo deportivo = new Deportivo(marca,numero,coste,venta,motor,carroceria,ruedas);
//		deportivo.addReparacion(new Reparacion(new Date()));
//		
//		return deportivo;
//	}
//	
//	public static Motor crearMotor(Scanner sc) {
//		System.out.println("Introduce el número de bastidor");
//		int numBastidor = sc.nextInt();
//		return new Motor(numBastidor);
//	}
//	
//	public static Carroceria crearCarroceria(Scanner sc) {	
//		System.out.println("Color de la carrocería: ");
//		String color = sc.nextLine();
//		sc.nextLine();
//		System.out.println("Estado de la carrocería: (Nueva/Usada)");
//		String condicion = sc.nextLine();
//		
//		return new Carroceria(color, condicion);
//	}
//	
//	public static ArrayList<Ruedas> crearListaRuedas(Scanner sc){
//		ArrayList<Ruedas> listaRuedas = new ArrayList<>();
//		System.out.println("¿Cuántas ruedas quieres?");
//		int numRuedas = sc.nextInt();
//		sc.nextLine();
//		for(int i = 1;i<= numRuedas; i++) {
//			System.out.println("Tamaño de la rueda "+ i + ":");
//			int tamano = sc.nextInt();
//			sc.nextLine();
//			System.out.println("Condición de la rueda "+ i + ": (Nueva/Usada)");
//			String condicion = sc.nextLine();
//			listaRuedas.add(new Ruedas(tamano, condicion));
//		}
//		return listaRuedas;
//	}
//}
