import java.util.Scanner;
class Juego {
    private Tablero tablero;
    private Jugador jugador;
    private Scanner scanner;

    public Juego() {
        tablero = new Tablero();
        jugador = new Jugador(1, 3); // Posición inicial del jugador
        tablero.colocarJugador(jugador);
        scanner = new Scanner(System.in);
    }

    public char[][] getTablero() {
        return tablero.getEstadoTablero(); // Añade este método en la clase Tablero para devolver el estado.
    }

    public boolean moverJugador(String direccion) {
        return jugador.mover(direccion, tablero);
    }

    public boolean esVictoria() {
        return tablero.esVictoria();
    }
}
