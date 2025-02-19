package streaming;

public class Pelicula implements Reproducible {

	private String nombre;
	private TipoContenido contenido;

	public Pelicula(String nombre, TipoContenido contenido) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
	}

	public void reproducir() {	System.out.println("La película'" + nombre + "' se está reproduciendo" );}
	
	public void pausar() { System.out.println("película'" + nombre + "' se ha pausado" );	}
	
	public void obtenerTipoContenido() { 	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoContenido getContenido() {
		return contenido;
	}

	public void setContenido(TipoContenido contenido) {
		this.contenido = contenido;
	}

	
	
	
	
	
}
