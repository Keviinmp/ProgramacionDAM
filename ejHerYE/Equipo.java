package ejHerYE;

import java.util.List;
import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private ArrayList<Participante> jugadores;
	private int puntos;
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
		this.puntos = 0;
	}

	
	
	public void anadirJugador(Participante jugador) {
		jugadores.add(jugador);
	}
	
	public void eliminarJugador(String nombre, String apellido) throws JugadorNoEncontradoException {
	    Participante jugadorAEliminar = null;

	    for (Participante jugador : jugadores) {
	        if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
	            jugadorAEliminar = jugador;
	            break;
	        }
	    }

	    if (jugadorAEliminar != null) {
	        jugadores.remove(jugadorAEliminar);
	    } else {
	        throw new JugadorNoEncontradoException("Jugador no encontrado: " + nombre + " " + apellido);
	    }
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Participante> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Participante> jugadores) {
		this.jugadores = jugadores;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    result.append("Equipo: ").append(nombre).append("\nPuntos: ").append(puntos).append("\nJugadores:");

	    if (jugadores.isEmpty()) {
	        result.append("\n - No hay jugadores en el equipo.");
	    } else {
	        for (Participante jugador : jugadores) {
	            result.append("\n - ").append(jugador.toString());
	        }
	    }

	    return result.toString();
	}


	
}
