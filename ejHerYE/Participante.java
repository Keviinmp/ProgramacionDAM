package ejHerYE;

public class Participante {

	private String nombre;
	private String apellido;
	private int edad;
	private double tiempo;
	
	public Participante(String nombre, String apellido, int edad, double tiempo) throws ParticipanteNoValidoException {
		if(nombre == null || apellido == null || edad < 14) {
			throw new ParticipanteNoValidoException("El participante no es válido: nombre, apellido, edad y tiempo deben ser correctos (mínimo 14 años).");
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return nombre +" "+ apellido + " Edad: " + edad + " Tiempo: " + tiempo + " segundos";
	}
	
}
