package ejHerYE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TorneoDeFutbol extends EventoDeportivo<Equipo> implements Ganador<Equipo> {

    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, List<Participante> listaParticipantes,
                          ArrayList<Equipo> equipos) {
        super(nombre, fecha, lugar, listaParticipantes);
        this.equipos = equipos;
    }

    @Override
    public Equipo obtenerGanador() {
        Equipo ganador = null;
        int maxPuntos = -1;

        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() > maxPuntos) {
                maxPuntos = equipo.getPuntos();
                ganador = equipo;
            }
        }

        return ganador;
    }

    public void inscribirEquipo(Equipo equipo) {
	    if (equipo != null && !equipos.contains(equipo)) {
	        equipos.add(equipo);
	        System.out.println("Se ha inscrito el equipo " + equipo.getNombre() + " en " + nombre);
	    } else if (equipo == null) {
	        System.out.println("⚠️ Error: Intento de inscribir un equipo nulo.");
	    } else {
	        System.out.println("⚠️ El equipo " + equipo.getNombre() + " ya está inscrito en " + nombre);
	    }
	}
    
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Torneo: ").append(nombre)
	      .append("\nFecha: ").append(fecha)
	      .append("\nLugar: ").append(lugar)
	      .append("\nEquipos inscritos:\n");

	    if (equipos.isEmpty()) {
	        sb.append(" - No hay equipos inscritos.\n");
	    } else {
	        for (Equipo equipo : equipos) {
	            sb.append(equipo.toString()).append("\n");
	        }
	    }

	    Equipo ganador = obtenerGanador();
	    sb.append("\nGanador del torneo: ").append(ganador != null ? ganador.getNombre() : "Aún no definido");

	    return sb.toString();
	}
}