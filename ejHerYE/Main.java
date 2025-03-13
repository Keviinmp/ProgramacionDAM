package ejHerYE;


import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear participantes
            Participante p1 = new Participante("Pepe", "Invertido", 36,15.2);
            Participante p2 = new Participante("Chiquibai", "Masón", 39,22.3);
            Participante p3 = new Participante("Juan", "Ymasi", 25,9.9);
            Participante p4 = new Participante("Elnano", "Alonso", 37,33.33);

            // Crear un equipo
            Equipo equipo1 = new Equipo("LOS DIOZE");
            equipo1.anadirJugador(p1);
            equipo1.anadirJugador(p2);

            // Intentar eliminar un jugador que no está en el equipo
            try {
                equipo1.eliminarJugador("Rosaura", "Arrustika");
                System.out.println("Jugador eliminado correctamente.");
            } catch (JugadorNoEncontradoException e) {
                System.out.println(e.getMessage());
            }

            // Crear una carrera y agregar participantes
            Carrera carrera = new Carrera("Carrera benéfica", LocalDate.of(2055, 3, 22), "Estadio Olímpico", 2.0);
            carrera.inscribirParticipante(p4);
            carrera.inscribirParticipante(p2);

            // Crear un torneo de fútbol
            ArrayList<Equipo> equipos = new ArrayList<>();
            ArrayList<Participante> participantes = new ArrayList<>();
            TorneoDeFutbol torneo = new TorneoDeFutbol("Furbito cole", LocalDate.of(2033, 2, 4), "Colegio Pepito Martínez", participantes, equipos);

            // Inscribir el equipo en el torneo
            torneo.inscribirEquipo(equipo1);
            // Asignar puntos al equipo
            equipo1.setPuntos(15);

            // Mostrar detalles de los eventos
            System.out.println("\nDetalles del torneo:\n" + torneo);
            System.out.println("\nDetalles de la carrera:\n" + carrera);
        } catch (ParticipanteNoValidoException e) {
            System.out.println("Error al crear participante: " + e.getMessage());
        }
    }
}
