package coche;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Coche {
	
	protected String marca;
	protected String matricula;
	protected float precioCoste;
	protected float precioVenta;
	
	public Coche(String marca, String matricula, float precioCoste, float precioVenta) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}

	
	// Muestra solo la marca y la matricula del vehñiculo
	public void mostrarVehiculo() {
		System.out.printf("MARCA: %s\nMATRÍCULA: %s\n\n",marca,matricula);	
	}
	
	
	// Muestra solo los precios de compra del conce y al precio que se vende
	public void mostrarPrecios() {
		System.out.printf("\nPRECIO COMPRA: %.2f€\nPRECIO VENTA: %.2f€\n\n",precioCoste,precioVenta);
	}
	
//	public void numeroReparaciones() {				// Este método generará un número aleatorio de reparaciones que necesita el coche
//		Random random = new Random();++
//		int reparaciones = random.nextInt(6);		// Genera un número aleatorio entre 0 y 5
//		
//		if(reparaciones>1) System.out.printf("El vehículo %s con matrícula %s necesita %d reparaciones",marca,matricula,reparaciones);
//		else if(reparaciones==1)System.out.printf("El vehículo %s con matrícula %s necesita %d reparación",marca,matricula,reparaciones);
//		else System.out.printf("El vehículo %s con matrícula %s no necesita reparaciones",marca,matricula);
//	}
	
	// Método genérico para comprobar matrícula (PREGUNTAR POR EL T)
    public static <T extends Coche> void comprobarMatricula(List<T> cochesDisponibles) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matrícula:");
        String mat = sc.nextLine();
        boolean encontrado = false;
        for (T coche : cochesDisponibles) {
            if (mat.equalsIgnoreCase(coche.getMatricula())) {
                coche.mostrarVehiculo();
                coche.mostrarPrecios();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo con esa matrícula.");
        }
    }
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	
	// CLASES DE COMPONENTES DEL VEHICULO
	
	// CARROCERIA
	
	class Carroceria {
		
		protected String color;
		protected String condicion;
		
		public Carroceria(String color, String condicion) {
			this.color = color;
			this.condicion = condicion;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCondicion() {
			return condicion;
		}
		public void setCondicion(String condicion) {
			this.condicion = condicion;
		}
		
	}
	
	// MOTOR
	
	class Motor {
		
		protected String numBastidor;
		
		public Motor(String numBastidor) {
			this.numBastidor = numBastidor;
		}

		public String getNumBastidor() {
			return numBastidor;
		}

		public void setNumBastidor(String numBastidor) {
			this.numBastidor = numBastidor;
		}
		
		
	}
	
	// RUEDAS
	
	class Ruedas {
		protected float tamano;
		protected float condicion;
		
		public Ruedas(float tamano, float condicion) {
			this.tamano = tamano;
			this.condicion = condicion;
			
		}
		public float getTamano() {
			return tamano;
		}
		public void setTamano(float tamano) {
			this.tamano = tamano;
		}
		public float getCondicion() {
			return condicion;
		}
		public void setCondicion(float condicion) {
			this.condicion = condicion;
		}
		
		
	}
	
	
}
