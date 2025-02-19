package agenda;

public class Agenda {
    public static final int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String[] mesesAnyo = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private int anyo;
    private Pagina[] paginas;
    private Pagina abierta;
    private int paginaActual;

    public Agenda(int anyo) {
        this.anyo = anyo;
        paginas = new Pagina[365];
        int contadorDia = 1;
        int contadorMes = 1; // Comienza en 1 para enero
        for (int i = 0; i < this.paginas.length; i++) {
            paginas[i] = new Pagina(contadorDia++, contadorMes);
            if (contadorDia > diasMes[contadorMes - 1]) { // Ajustamos el índice aquí
                contadorDia = 1;
                contadorMes++;
            }
        }
        this.paginaActual = 0;
        this.abierta = paginas[paginaActual];
    }

    public void leerPagina() {
        System.out.println("DÍA " + abierta.getDia() + " de " + mesesAnyo[abierta.getMes() - 1]);
        abierta.verCitas();
    }

    public void avanzarPagina() {
        if (paginaActual < paginas.length - 1) {
            paginaActual++;
            abierta = paginas[paginaActual];
        } else {
            System.out.println("Ya estás en la última página.");
        }
    }

    public void retrocederPagina() {
        if (paginaActual > 0) {
            paginaActual--;
            abierta = paginas[paginaActual];
        } else {
            System.out.println("Ya estás en la primera página.");
        }
    }

    public void agregarCita(int dia, int mes, Cita cita) {
        for (Pagina pagina : paginas) {
            if (pagina.getDia() == dia && pagina.getMes() == mes) {
                pagina.agregarCita(cita);
                break;
            }
        }
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public static String[] getMesesanyo() {
        return mesesAnyo;
    }
}
