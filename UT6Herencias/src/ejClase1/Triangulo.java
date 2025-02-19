package ejClase1;

public class Triangulo {

	private Punto2D p1,p2,p3;

	public Triangulo(Punto2D p1, Punto2D p2, Punto2D p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double area() {
		double a = Punto2D.distancia(p1, p2);
		double b = Punto2D.distancia(p2, p3);
		double c = Punto2D.distancia(p3, p1);
		double s = (a + b + c) / 2;
		return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
	

	
}
