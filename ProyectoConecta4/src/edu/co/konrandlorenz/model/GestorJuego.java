package edu.co.konrandlorenz.model;

import java.util.Scanner;

public class GestorJuego implements Juego {
	private Jugador jugadorActual;
    private Jugador jugadorOponente;
    private Tablero tablero;
    private Scanner scanner;

    public GestorJuego(Jugador jugadorActual, Jugador jugadorOponente, Tablero tablero) {
        this.jugadorActual = jugadorActual;
        this.jugadorOponente = jugadorOponente;
        this.tablero = tablero;
        this.scanner = new Scanner(System.in);
    }
	
	public void inicializarJuego() {
		
	}
	
	public void finalizarJuego() {
		
	}
	
	public void jugarPartida() {
		try (Scanner scanner = new Scanner(System.in)) {
			while (!haTerminado()) {
	            // Turno del jugador actual
	            System.out.println("Turno de " + jugadorActual.getNombre() + ":");
	            if (jugadorActual instanceof JugadorHumano) {
	                System.out.print("Ingresa la columna donde deseas colocar la ficha (1-7): ");
	                int columna = scanner.nextInt() - 1;
	                realizarMovimiento(columna);
	            } else if (jugadorActual instanceof JugadorComputadora) {
	                int columna = (int) (Math.random() * tablero.getColumnas());
	                realizarMovimiento(columna);
	            }
	            
	            // Mostrar estado del tablero
	            System.out.println("Estado actual del tablero:");
	            System.out.println(tablero);

	            if (haTerminado()) {
	                break; // Si el juego ha terminado, salir del bucle
	            }
	        }

	        // Mostrar el resultado final
	        if (getGanador() != null) {
	            System.out.println("¡El ganador es: " + getGanador().getNombre() + "!");
	        } else {
	            System.out.println("¡Empate!");
	        }
	    }
	}
	
	public boolean haTerminado() {
		return tablero.estaLleno() || tablero.hayGanador();
    }

    public Jugador getGanador() {
    	if (tablero.hayGanador()) {
            return jugadorActual;
        }
        return null;
       
    }
	
    public void cambiarJugador() {
        Jugador temp = jugadorActual;
        jugadorActual = jugadorOponente;
        jugadorOponente = temp;
    }
    
    public boolean realizarMovimiento(int columna) {
        if (tablero.colocarFicha(columna, jugadorActual.getNumero())) {
            if (tablero.verificarGanador(jugadorActual.getNumero())) {
                jugadorActual.incrementarPuntaje();
                return true; // El jugador actual ganó
            }
            cambiarJugador();
            return false; // Movimiento exitoso, el juego continúa
        }
        return false; // Movimiento inválido, la columna está llena
    }

	public Jugador getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(Jugador jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	public Jugador getJugadorOponente() {
		return jugadorOponente;
	}

	public void setJugadorOponente(Jugador jugadorOponente) {
		this.jugadorOponente = jugadorOponente;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
	

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public String toString() {
		return "GestorJuego [jugadorActual=" + jugadorActual + ", jugadorOponente=" + jugadorOponente + ", tablero="
				+ tablero + "]";
	}
	
	
	

}
