package streaming;

public class Musica implements Reproducible {
	
	private String nombre;
	private TipoContenido contenido;
	
	public Musica(String nombre, TipoContenido contenido) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
	}

	public void reproducir() {	System.out.println("La canción '" + nombre + "' se está reproduciendo" );}
	
	public void pausar() { System.out.println("La canción '" + nombre + "' se ha pausado" );}
	
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
