package ejClase1;

public class Punto2D {
		private double x, y;
	public Punto2D(double x, double y) {
	this.x = x;
	this.y = y;
	}
	public static double distancia(Punto2D p1, Punto2D p2) {
	return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
	}
}
