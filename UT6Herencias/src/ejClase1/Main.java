package ejClase1;

public class Main {

	public static void main(String[] args) {
		Punto2D p1 = new Punto2D(0.3,0.3);
		Punto2D p2 = new Punto2D(0.1 + 0.2, 0.1 + 0.2);
		Punto2D p3 = new Punto2D(0,0);
		
		Triangulo tr = new Triangulo(p1,p2,p3);
		
		System.out.println(tr.area());
	}

}
