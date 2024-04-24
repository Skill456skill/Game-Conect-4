package edu.co.konrandlorenz.view;

import edu.co.konrandlorenz.model.Tablero;

public class Ventana {
	 public void actualizarTablero(Tablero tablero) {
	        System.out.println("Estado actual del tablero:");
	        System.out.println(tablero.toString()); // Mostrar el estado actual del tablero
	    }

	    public void mostrarMensaje(String mensaje) {
	        System.out.println(mensaje);
	    }
	}