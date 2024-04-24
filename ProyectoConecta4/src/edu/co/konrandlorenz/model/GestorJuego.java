package edu.co.konrandlorenz.model;

import java.util.Scanner;

public class GestorJuego implements Juego {
	private Jugador jugadorActual;
    private Jugador jugadorOponente;
    private Tablero tablero;
    private RankingGlobal rankingGlobal;
    private Scanner scanner;


    public GestorJuego(Jugador jugadorActual, Jugador jugadorOponente, Tablero tablero, RankingGlobal rankingGlobal) {
        this.jugadorActual = jugadorActual;
        this.jugadorOponente = jugadorOponente;
        this.tablero = tablero;
        this.rankingGlobal = rankingGlobal;
        this.scanner = new Scanner(System.in);
        this.rankingGlobal = new RankingGlobal(); // Inicializar rankingGlobal aquí
    }
	
    public void inicializarJuego() {
        // Inicializar el tablero
        tablero.inicializarTablero();

        // Barajar el orden de los jugadores
        if (Math.random() < 0.5) {
            Jugador temp = jugadorActual;
            jugadorActual = jugadorOponente;
            jugadorOponente = temp;
        }

        System.out.println("¡Juego inicializado!");
    }

    public void finalizarJuego() {
        System.out.println("¡Juego finalizado!");
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
                    int columna = ((JugadorComputadora) jugadorActual).realizarMovimiento(tablero, 0); // 0 es solo un valor de ejemplo
                    realizarMovimiento(columna);
                }

                // Mostrar estado del tablero
                System.out.println("Estado actual del tablero:");
                System.out.println(tablero);

                if (haTerminado()) {
                    break; // Si el juego ha terminado, salir del bucle
                }
            }

            // Mostrar el resultado final solo si hay un ganador válido
            Jugador ganador = getGanador();
            if (ganador != null) {
                System.out.println("¡El ganador es: " + ganador.getNombre() + "!");
                rankingGlobal.agregarPuntaje(ganador.getNombre(), 1); // Agregar 1 punto al ganador
                rankingGlobal.mostrarRanking(); // Mostrar el ranking global
            } else {
                System.out.println("¡Empate!");
            }
        }
    }
	public boolean haTerminado() {
		return tablero.estaLleno() || tablero.hayGanador(0);
    }

    public Jugador getGanador() {
    	if (tablero.hayGanador(0)) {
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
    	tablero.colocarFicha(columna, jugadorActual.getFicha());
        if (!tablero.verificarGanador(jugadorActual.getFicha())) {
            cambiarJugador();
        }
		return false;
    }
    

	public RankingGlobal getRankingGlobal() {
		return rankingGlobal;
	}

	public void setRankingGlobal(RankingGlobal rankingGlobal) {
		this.rankingGlobal = rankingGlobal;
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
				+ tablero + ", rankingGlobal=" + rankingGlobal + ", scanner=" + scanner + "]";
	}


	
	
	

}
