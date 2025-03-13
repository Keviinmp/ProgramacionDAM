package ejHerYE;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class EventoDeportivo<T> implements Ganador<T> {
	public String nombre;
	public LocalDate fecha;
	public String lugar;
	public List<Participante> participantes;
	
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar, List<Participante> participantes) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = participantes;
	}

	public void inscribirParticipante(Participante participante) {
		participantes.add(participante);
		System.out.println("Se ha inscrito a "+participante.getNombre()+" en "+nombre);
	}

	@Override
	public abstract T obtenerGanador();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
	
}
