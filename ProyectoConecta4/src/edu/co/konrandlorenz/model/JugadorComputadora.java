package edu.co.konrandlorenz.model;

import java.util.Random;

public class JugadorComputadora extends Jugador {
	private Random random;
	private static char fichaComputadora = 'O';
	

	public JugadorComputadora(String nombre, char ficha) {
	    super(nombre, ficha);
	    random = new Random();
	}

	 @Override
	    public int realizarMovimiento(Tablero tablero, int columna) {
	        int columnaAleatoria = random.nextInt(tablero.getColumnas());
	        while (!tablero.columnaDisponible(columnaAleatoria)) {
	            columnaAleatoria = random.nextInt(tablero.getColumnas());
	        }
	        return columnaAleatoria;
	    }

	public static char getFichaComputadora() {
		return fichaComputadora;
	}

	public static void setFichaComputadora(char fichaComputadora) {
		JugadorComputadora.fichaComputadora = fichaComputadora;
	}
}

