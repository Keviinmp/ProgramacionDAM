package gestionEquipo;

import java.util.*;

public class Aplicacion {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Real Madrid");

        // Lista de futbolistas a agregar
        List<Futbolista> futbolistas = List.of(
            new Futbolista("Courtois", 30, Posicion.PORTERO, 10, List.of("Chelsea", "Real Madrid"), 5),
            new Futbolista("Lunin", 25, Posicion.PORTERO, 5, List.of("Real Madrid"), 2),
            new Futbolista("Carvajal", 32, Posicion.DEFENSA, 12, List.of("Real Madrid"), 10),
            new Futbolista("Rudiger", 30, Posicion.DEFENSA, 10, List.of("Chelsea", "Real Madrid"), 8),
            new Futbolista("Kroos", 34, Posicion.CENTROCAMPISTA, 15, List.of("Bayern", "Real Madrid"), 20),
            new Futbolista("Tercer portero", 28, Posicion.PORTERO, 5, List.of("Otro Equipo"), 1), // Esto generará error
            new Futbolista("Bellingham", 20, Posicion.CENTROCAMPISTA, 3, List.of("Dortmund", "Real Madrid"), 4),
            new Futbolista("Vinicius", 24, Posicion.DELANTERO, 6, List.of("Real Madrid"), 12),
            new Futbolista("Benzema", 36, Posicion.DELANTERO, 18, List.of("Lyon", "Real Madrid"), 25)
           
        );

        // Intentar agregar los futbolistas al equipo uno por uno
        for (Futbolista f : futbolistas) {
            try {
                equipo.agregarFutbolista(f);
                System.out.println("Jugador agregado: " + f.getNombre()); // Mensaje de éxito
            } catch (RegistroFutbolistaException e) {
                System.out.println("Error al agregar " + f.getNombre() + ": " + e.getMessage());
            }
        }

        // Mostrar la formación del equipo ordenada por posición
        System.out.println("\nFormación del equipo:");
        equipo.listarFormacionDelEquipo();
    }
}
