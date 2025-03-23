package gestionEquipo;

import java.util.*;

public class Equipo {

	private String nombre;
	private List<Futbolista> jugadores;
	// Crea un Map que asocia la posición al número máximo de personas por equipo
	private static final Map<Posicion, Integer> MAX_POR_POSICION = Map.of(
			Posicion.PORTERO, 2,
			Posicion.DEFENSA, 5,
			Posicion.CENTROCAMPISTA, 5,
			Posicion.DELANTERO, 4	
			);
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
	}

	
	// Este método agrega un futbolista al equipo si no se ha alcanzado el límite de jugadores en su posición.
	public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {
        long count = jugadores.stream().filter(f -> f.getPosicion() == futbolista.getPosicion()).count();
        if (count >= MAX_POR_POSICION.get(futbolista.getPosicion())) {
            throw new RegistroFutbolistaException("No se puede agregar más jugadores en la posición " + futbolista.getPosicion());
        }
        jugadores.add(futbolista);
    }
	
	 public void listarFormacionDelEquipo() {
	        // Ordenamos la lista de futbolistas por posición usando sort y un comparador personalizado
	       	jugadores.sort(Comparator.comparing(Futbolista::getPosicion));
	        
	        // Usamos un Iterator para recorrer la lista y mostrar la información de cada futbolista
	        Iterator<Futbolista> iterator = jugadores.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
