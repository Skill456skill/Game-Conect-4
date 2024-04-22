package edu.co.konrandlorenz.control;

import java.util.Scanner;

import edu.co.konrandlorenz.model.GestorJuego;
import edu.co.konrandlorenz.model.JugadorComputadora;
import edu.co.konrandlorenz.model.JugadorHumano;
import edu.co.konrandlorenz.model.Tablero;
import edu.co.konrandlorenz.model.Usuario;

public class AplMain {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¡Bienvenido al juego Conecta 4!");
            System.out.print("Por favor, ingresa tu nombre de usuario: ");
            String nombreUsuario = scanner.nextLine();

            // Creamos el usuario con el nombre ingresado
            Usuario usuario = new Usuario(nombreUsuario);

            JugadorHumano jugador1 = new JugadorHumano(usuario);
            JugadorComputadora jugador2 = new JugadorComputadora("Computadora", 0);
            Tablero tablero = new Tablero(1, 1, 4);

            GestorJuego gestorJuego = new GestorJuego(jugador1, jugador2, tablero);
            // Ventana vistaJuego = new Ventana();  <- No es necesario en esta implementación

            gestorJuego.inicializarJuego();
            gestorJuego.jugarPartida();
        }
    }

	}


