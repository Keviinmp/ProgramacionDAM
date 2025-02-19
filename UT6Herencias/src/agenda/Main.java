package agenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(2025);
        mostrarMenu(agenda);
    }

    public static void mostrarMenu(Agenda agenda) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Agregar Cita");
            System.out.println("2. Ver Citas de un Día");
            System.out.println("3. Avanzar Página");
            System.out.println("4. Retroceder Página");
            System.out.println("5. Leer Página Actual");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarCita(agenda, scanner);
                    break;
                case 2:
                    verCitasDia(agenda, scanner);
                    break;
                case 3:
                    agenda.avanzarPagina();
                    break;
                case 4:
                    agenda.retrocederPagina();
                    break;
                case 5:
                    agenda.leerPagina();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    public static void agregarCita(Agenda agenda, Scanner scanner) {
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese la hora: ");
        int hora = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();

        Cita cita = new Cita(hora, minutos, titulo, texto);
        agenda.agregarCita(dia, mes, cita);
        System.out.println("Cita agregada exitosamente.");
    }

    public static void verCitasDia(Agenda agenda, Scanner scanner) {
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        for (Pagina pagina : agenda.getPaginas()) {
            if (pagina.getDia() == dia && pagina.getMes() == mes) {
                System.out.println("Citas para el " + dia + " de " + agenda.getMesesanyo()[mes - 1] + ":");
                pagina.verCitas();
                return;
            }
        }
        System.out.println("No se encontraron citas para esta fecha.");
    }
}
