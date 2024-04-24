package edu.co.konrandlorenz.model;

import java.util.Arrays;

public class Tablero {
	private int filas;
    private int columnas;
    private char[][] cuadricula;
    private static final char VACIO = ' ';


    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.cuadricula = new char[filas][columnas];
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < filas; i++) {
            Arrays.fill(cuadricula[i], VACIO);
        }
    }
    
    public void imprimirMatrizConFichas(char fichaJugador1, char fichaJugador2) {
        System.out.println("Tablero inicial con fichas de los jugadores:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char ficha = cuadricula[i][j];
                if (ficha == VACIO) {
                    System.out.print(VACIO + " ");
                } else if (ficha == fichaJugador1) {
                    System.out.print("X "); // Representación de la ficha del jugador 1
                } else if (ficha == fichaJugador2) {
                    System.out.print("O "); // Representación de la ficha del jugador 2
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    
    
    public boolean colocarFicha(int columna, char ficha) {
        for (int i = filas - 1; i >= 0; i--) {
            if (cuadricula[i][columna] == VACIO) {
                cuadricula[i][columna] = ficha;
                return true;
            }
        }
        return false; // Columna llena
    }
    
    public boolean hayGanador(int k) {
        int[][] direcciones = {
                {0, 1},  // Horizontal
                {1, 0},  // Vertical
                {1, 1},  // Diagonal principal
                {1, -1}  // Diagonal inversa
        };

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int[] dir : direcciones) {
                    if (verificarDireccion(k, i, j, dir[0], dir[1])) {
                        return true; // El jugador ha ganado
                    }
                }
            }
        }
        return false; // El jugador no ha ganado
    }
    
    private boolean verificarDireccion(int k, int fil, int col, int filDir, int colDir) {
        int count = 0;

        for (int i = fil, j = col; i >= 0 && i < filas && j >= 0 && j < columnas; i += filDir, j += colDir) {
            if (cuadricula[i][j] == k) {
                count++;
                if (count == 4) {
                    return true; // El jugador ha ganado
                }
            } else {
                break;
            }
        }
        return false; // No se encontró una secuencia ganadora en esta dirección
    }

    
    public boolean estaLleno() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (cuadricula[i][j] == VACIO) {
                    return false; 
                }
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sb.append(cuadricula[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public boolean columnaDisponible(int columna) {
        return cuadricula[0][columna] == VACIO;
    }


    public boolean verificarGanador(int jugador) {
        
        return false;
    }

	public void colocarFicha(int columna) {

	}
	
	public boolean verificarGanador() {
		return false;
	}

	
	public static int getVacio() {
		return VACIO;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}


	public char[][] getCuadricula() {
		return cuadricula;
	}

	public void setCuadricula(char[][] cuadricula) {
		this.cuadricula = cuadricula;
	}







	

}
