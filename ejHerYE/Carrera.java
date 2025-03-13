package ejHerYE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Carrera extends EventoDeportivo<Participante> implements Ganador<Participante>{

	private double distancia;

	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar, new ArrayList<>());
		this.distancia = distancia;
	}
	
	 @Override
	    public Participante obtenerGanador() {
	        if (getParticipantes().isEmpty()) {
	            return null; // No hay participantes en la carrera
	        }

	        Participante ganador = getParticipantes().get(0); // Suponemos que el primero es el ganador inicialmente

	        for (Participante participante : getParticipantes()) {
	            if (participante.getTiempo() < ganador.getTiempo()) { // Gana quien tenga menor tiempo
	                ganador = participante;
	            }
	        }

	        return ganador;
	    }
	 
	 @Override
	 public String toString() {
	     StringBuilder sb = new StringBuilder();
	     sb.append("Carrera: ").append(nombre).append("\n");
	     sb.append("Fecha: ").append(fecha).append("\n");
	     sb.append("Lugar: ").append(lugar).append("\n");
	     sb.append("Distancia: ").append(distancia).append(" km\n");
	     
	     sb.append("\nParticipantes inscritos:\n");
	     if (participantes.isEmpty()) {
	         sb.append(" - No hay participantes inscritos.\n");
	     } else {
	         for (Participante p : participantes) {
	             sb.append(" - ").append(p.toString()).append("\n");
	         }
	     }

	     Participante ganador = obtenerGanador();
	     sb.append("\n🏅 Ganador de la carrera: ")
	       .append(ganador != null ? ganador.toString() : "Aún no definido");

	     return sb.toString();
	 }

}
