package edu.co.konrandlorenz.control;

import java.util.Scanner;

import edu.co.konrandlorenz.model.GestorJuego;
import edu.co.konrandlorenz.model.JugadorComputadora;
import edu.co.konrandlorenz.model.JugadorHumano;
import edu.co.konrandlorenz.model.RankingGlobal;
import edu.co.konrandlorenz.model.Tablero;
import edu.co.konrandlorenz.model.Usuario;
import edu.co.konrandlorenz.view.Ventana;

public class AplMain {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
		    System.out.println("¡Bienvenido al juego Conecta 4!");
		    System.out.print("Por favor, ingresa tu nombre de usuario: ");
		    String nombreUsuario = scanner.nextLine();

		    // Crear usuario
		    Usuario usuario = new Usuario(nombreUsuario);

		    // Crear jugadores y tablero
		    JugadorHumano jugadorHumano = new JugadorHumano(usuario, 'X');
		    JugadorComputadora jugadorComputadora = new JugadorComputadora("Computadora", 'O');
		    Tablero tablero = new Tablero(6, 7); // Por ejemplo, un tablero de 6 filas y 7 columnas

		    // Mostrar fichas de jugadores en el tablero
		    tablero.imprimirMatrizConFichas(jugadorHumano.getFicha(), jugadorComputadora.getFicha());

		    // Crear ranking global
		    RankingGlobal rankingGlobal = new RankingGlobal();

		    // Crear gestor de juego y controlador
		    GestorJuego gestorJuego = new GestorJuego(jugadorHumano, jugadorComputadora, tablero, rankingGlobal);
		    Ventana ventana = new Ventana(); // Suponiendo que tienes una clase Ventana para la interfaz gráfica
		    Controller controller = new Controller(gestorJuego, ventana);

		    // Inicializar juego
		    gestorJuego.inicializarJuego();

		    // Jugar partida
		    gestorJuego.jugarPartida();
		}
}}
