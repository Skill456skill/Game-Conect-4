package edu.co.konrandlorenz.model;

import java.util.Arrays;

public class Tablero {
	private int filas;
	private int columnas;
	private int[][] cuadricula;
    private static final int VACIO = 0;
    private static final int JUGADOR1 = 1;
    private static final int JUGADOR2 = 2;

    public Tablero(int filas, int columnas, int cuadricula) {
        this.filas = filas;
        this.columnas = columnas;
        this.cuadricula = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.cuadricula[i][j] = VACIO;
            }
        }
    }

    public boolean colocarFicha(int columna, int jugador) {
        for (int i = filas - 1; i >= 0; i--) {
            if (cuadricula[i][columna] == VACIO) {
                cuadricula[i][columna] = jugador;
                return true;
            }
        }
        return false; 
    }
    public boolean hayGanador() {
        // Verificar horizontalmente
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas - 3; j++) {
                if (cuadricula[i][j] != VACIO &&
                    cuadricula[i][j] == cuadricula[i][j + 1] &&
                    cuadricula[i][j] == cuadricula[i][j + 2] &&
                    cuadricula[i][j] == cuadricula[i][j + 3]) {
                    return true;
                }
            }
        }

        // Verificar verticalmente
        for (int i = 0; i < filas - 3; i++) {
            for (int j = 0; j < columnas; j++) {
                if (cuadricula[i][j] != VACIO &&
                    cuadricula[i][j] == cuadricula[i + 1][j] &&
                    cuadricula[i][j] == cuadricula[i + 2][j] &&
                    cuadricula[i][j] == cuadricula[i + 3][j]) {
                    return true;
                }
            }
        }

        // Verificar diagonalmente (de izquierda a derecha)
        for (int i = 0; i < filas - 3; i++) {
            for (int j = 0; j < columnas - 3; j++) {
                if (cuadricula[i][j] != VACIO &&
                    cuadricula[i][j] == cuadricula[i + 1][j + 1] &&
                    cuadricula[i][j] == cuadricula[i + 2][j + 2] &&
                    cuadricula[i][j] == cuadricula[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        // Verificar diagonalmente (de derecha a izquierda)
        for (int i = 0; i < filas - 3; i++) {
            for (int j = 3; j < columnas; j++) {
                if (cuadricula[i][j] != VACIO &&
                    cuadricula[i][j] == cuadricula[i + 1][j - 1] &&
                    cuadricula[i][j] == cuadricula[i + 2][j - 2] &&
                    cuadricula[i][j] == cuadricula[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        return false;
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

	public static int getJugador1() {
		return JUGADOR1;
	}

	public static int getJugador2() {
		return JUGADOR2;
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

	public int[][] getCuadricula() {
		return cuadricula;
	}

	public void setCuadricula(int[][] cuadricula) {
		this.cuadricula = cuadricula;
	}

	@Override
	public String toString() {
		return "Tablero [filas=" + filas + ", columnas=" + columnas + ", cuadricula=" + Arrays.toString(cuadricula)
				+ "]";
	}
	

}
